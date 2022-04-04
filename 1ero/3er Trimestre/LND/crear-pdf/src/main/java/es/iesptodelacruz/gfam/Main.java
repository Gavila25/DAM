package es.iesptodelacruz.gfam;

import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Main {

    public static void main(String[] args) throws Exception {
        try (PDDocument document = new PDDocument()) {
            Scanner sc=new Scanner(System.in);
            PDPage pagina=CrearDocumento.crearPagina();
            document.addPage(pagina);
            PDPageContentStream contentStream = new PDPageContentStream(document, pagina);
            
            // Text
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
            contentStream.newLineAtOffset( 20, pagina.getMediaBox().getHeight() - 52);
            contentStream.showText("Hello World!");
            contentStream.endText();

            // Image
            PDImageXObject image = PDImageXObject.createFromByteArray(document, Main.class.getResourceAsStream("/fondo.jpg").readAllBytes(), "Fondo de DragonBall");
            contentStream.drawImage(image, 20, 20, image.getWidth() / 3, image.getHeight() / 3);

            contentStream.close();

            document.save("document.pdf");
        }
    }
}