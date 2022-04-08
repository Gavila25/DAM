package es.iesptodelacruz.gfam;

import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Main {

    

    public static void main(String[] args) throws Exception {
        //Creado del documento
        try (PDDocument document = new PDDocument()) {
            Scanner sc=new Scanner(System.in);

            //Creada de la página
            PDPage pagina=CrearDocumento.crearPagina();
            document.addPage(pagina);
            System.out.println("Introduce el titulo del documento");
            String tituloDoc=sc.nextLine();

            //Creado del contenido de la página
            PDPageContentStream contenido=CrearDocumento.crearContenido(document, pagina,tituloDoc);
            //Se pide que el usuario, inserte la ruta de la imagen y el nombre de ella
            System.out.println("Indica la ruta del la imagen");
            String rutaImagen="/"+sc.nextLine();
            System.out.println("Indica el nombre para la imagen");
            String nombreImagen=sc.nextLine();

            //Creación de la imagen
            PDImageXObject agregarImagen = CrearDocumento.agregarImagen(document,rutaImagen,nombreImagen);
            contenido.drawImage(agregarImagen, 25, 150, agregarImagen.getWidth() / 5, agregarImagen.getHeight() / 5);
            contenido.close();

            //Nombrar el documento
            System.out.println("Como quieres llamar el documento");
            String nombreDocuemnto=sc.nextLine();
            document.save(nombreDocuemnto+".pdf");
        }
    }
}