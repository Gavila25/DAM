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
        ut1.generarEtiquetasXml();

    }
}
