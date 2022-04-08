package es.iesptodelacruz.lnd;

/**
 * Clase encargada de generar un fichero con String
 * @author Guillermo Avila Martin
 */
public final class GeneracionXml extends Utilidades{
    private GeneracionXml() {

    }
    /**
     * Funcion principal del programa
     * @param args
     */
    public static void main(String[] args) {
        
        
        Utilidades ut1=new Utilidades();
        String generarEtiquetasXml = ut1.generarEtiquetasXml();
        String generarEtiquetasRss = ut1.generarEtiquetasRss();
        String generarEtiquetaTitle = ut1.generarEtiquetaTitle("Tarea 1");
        String generarEtiquetaLink = ut1.generarEtiquetaLink("https://github.com/Gavila25");
        String generarEtiquetaDescription = ut1.generarEtiquetaDescription("Esta es la descripcion de la etiqueta");
        String contenidoChannel="\n\t\t"+generarEtiquetaTitle+"\n\t\t"+generarEtiquetaLink+"\n\t\t"+generarEtiquetaDescription;
        String generarEtiquetaChannel = ut1.generarEtiqueta("channel", contenidoChannel, false);
        System.out.println("Solucion 1, como se pedia en el ejercicio\n");
        System.out.println(generarEtiquetasXml+"\n"
        +generarEtiquetasRss+"\n\t"+
        generarEtiquetaChannel+"\n\t</channel>"+"\n</rss>");


        
        String generarEtiquetasXml2 = ut1.generarEtiquetasXml();
        String generarEtiquetasRss2 = ut1.generarEtiquetasRss();
        String generarEtiquetaTitle2 = ut1.generarEtiquetaTitle("Tarea 2");
        String generarEtiquetaLink2 = ut1.generarEtiquetaLink("https://github.com/Gavila25");
        String generarEtiquetaDescription2 = ut1.generarEtiquetaDescription("Esta es la etiqueta nueva, que tambien llevara un item");
        String generarcontenidoItem="\n\t\t\t"+generarEtiquetaTitle2+"\n\t\t\t"+generarEtiquetaLink2+"\n\t\t\t"+generarEtiquetaDescription2;
        String generarEtiquetaItem = ut1.generarEtiqueta("item", generarcontenidoItem, false);
        
        System.out.println("\nSolución 2, agregando items al xml\n");
        System.out.println("\n"+generarEtiquetasXml2+"\n"+
        generarEtiquetasRss2+"\n\t"+
        generarEtiquetaChannel+"\n\t\t"+generarEtiquetaItem+"\n\t\t</item>"
        +"\n\t</channel>"+"\n</rss>");
        
    }
}
