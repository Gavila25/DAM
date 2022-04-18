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
     * Funcion para crear la página que queremos
     * @return
     */
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
    public PDPageContentStream crearContenido(PDDocument documento,PDPage pagina,String titulo) throws IOException{
        PDPageContentStream contenido=new PDPageContentStream(documento, pagina);
        contenido.beginText();
        contenido.setFont(PDType1Font.TIMES_BOLD_ITALIC, 32);
        contenido.newLineAtOffset( 20, pagina.getMediaBox().getHeight() - 52);
        contenido.showText(titulo);
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
   
}
