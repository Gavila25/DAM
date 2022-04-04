package es.iesptodelacruz.gfam;

import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

public class CrearDocumento {



    public static PDPage crearPagina(){
        PDPage page = new PDPage(PDRectangle.A6);
        return page;
    }

    public static void crearContenido(){

    }
}
