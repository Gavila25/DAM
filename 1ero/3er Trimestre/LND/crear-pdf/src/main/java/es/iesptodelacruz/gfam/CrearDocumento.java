package es.iesptodelacruz.gfam;

import java.io.IOException;
import javax.swing.text.AbstractDocument.Content;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
public class CrearDocumento {

    /**
     * Función para crear la página que queremos
     * @return
     */
    public static PDPage crearPagina(){
        PDPage page = new PDPage(PDRectangle.A6);
        return page;
    }

    /**
     * Función para crear el contenido de la página
     * @param documento documento donde la página y el contenido
     * @param pagina pagina donde vamos a introducir el contenido
     * @param titulo titulo de la página
     * @return el contenido de la página
     * @throws IOException
     */
    public static PDPageContentStream crearContenido(PDDocument documento,PDPage pagina,String titulo) throws IOException{
        PDPageContentStream contenido=new PDPageContentStream(documento, pagina);
        contenido.beginText();
        contenido.setFont(PDType1Font.TIMES_BOLD, 32);
        contenido.newLineAtOffset( 20, pagina.getMediaBox().getHeight() - 52);
        contenido.showText(titulo);
        contenido.endText();
        return contenido;
    }

    public static PDImageXObject agregarImagen(PDDocument documento,String ruta,String nombreFoto) throws IOException{
        PDImageXObject imagen = PDImageXObject.createFromByteArray(documento, Main.class.getResourceAsStream(ruta).readAllBytes(), nombreFoto);
        return imagen;
    }
   
}
