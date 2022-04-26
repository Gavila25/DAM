package es.iesptodelacruz.gfam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
* @author Gavila25
*/
public class CrearDocumento {

    private StringBuilder nuevoTexto;

    public PDPage crearPagina(){
        PDPage page = new PDPage(PDRectangle.A6);
        return page;
    }

    /**
    * Funcion para crear el contenido de la pagina
    * @param documento documento donde la pagina y el contenido
    * @param pagina pagina donde vamos a introducir el contenido
    * @param titulo titulo de la página
    * @return el contenido de la página
    * @throws IOException
    */
    public PDPageContentStream crearContenido(PDDocument documento,PDPage pagina,String texto) throws IOException{
        PDPageContentStream contenido=new PDPageContentStream(documento, pagina);
        contenido.beginText();
        contenido.setFont(PDType1Font.TIMES_BOLD_ITALIC, 32);
        contenido.newLineAtOffset( 20, pagina.getMediaBox().getHeight() - 52);
        contenido.showText(texto);
        contenido.endText();
        return contenido;
    }

    /**
    * Funcion para crear la imagen que va a llevar la página
    * @param documento documento que hemos creado
    * @param ruta ruta de la imagen que vamos a insertar
    * @param nombreFoto nombre para guardar la imagen
    * @return la imagen escalada
    * @throws IOException
    */
    public PDImageXObject agregarImagen(PDDocument documento,String ruta,String nombreFoto) throws IOException{
        PDImageXObject imagen = PDImageXObject.createFromByteArray(documento, Main.class.getResourceAsStream(ruta).readAllBytes(), nombreFoto);
        return imagen;
    }

    public void leerFichero(PDDocument documento,PDPage page,String ruta){
    BufferedReader fichero = null;
    StringBuilder texto=null;
    try{
        fichero = new BufferedReader(new FileReader(ruta));
        String linea = null;
        texto.append("");
        while ((linea=fichero.readLine())!=null) {
            texto.append(linea);
            crearContenido(documento, page,linea);
            linea = fichero.readLine();
        }
    } catch(Exception e){
        System.out.println("Error"+e.toString());
    } finally {
        try {
            if (fichero != null) fichero.close();
        } catch(Exception e){
            System.out.println("Error"+e.toString());
        }
    }
    // salida por pantalla
    System.out.println(texto);
        
    }
}
