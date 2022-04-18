package es.iesptodelacruz.gfam;

import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Main {

    

    public static void main(String[] args) throws Exception {
        
        try (PDDocument document = new PDDocument()) {
            Scanner sc=new Scanner(System.in);
            CrearDocumento nuevoDoc=new CrearDocumento();
        
            PDPage pagina=nuevoDoc.crearPagina();
            document.addPage(pagina);
            System.out.println("Introduce el titulo del documento");
            String tituloDoc=sc.nextLine();

           
            PDPageContentStream contenido=nuevoDoc.crearContenido(document, pagina,tituloDoc);
            
            System.out.println("Indica la ruta del la imagen");
            String rutaImagen="/"+sc.nextLine();
            System.out.println("Indica el nombre para la imagen");
            String nombreImagen=sc.nextLine();

            
            PDImageXObject agregarImagen = nuevoDoc.agregarImagen(document,rutaImagen,nombreImagen);
            contenido.drawImage(agregarImagen, 25, 150, agregarImagen.getWidth() / 5, agregarImagen.getHeight() / 5);
            contenido.close();

            
            System.out.println("Como quieres llamar el documento");
            String nombreDocuemnto=sc.nextLine();
            document.save(nombreDocuemnto+".pdf");
        }
    }
}