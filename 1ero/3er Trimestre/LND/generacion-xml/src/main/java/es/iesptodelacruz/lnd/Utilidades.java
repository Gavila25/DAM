package es.iesptodelacruz.lnd;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Utilidades {
    /**
     * Funcion que genera la etiqueta xml
     * @return String con etiqueta xml
     */
    protected String generarEtiquetasXml(){
        return "<?xml version=\"1.0\"?>";
    }

    /**
     * Funcion que genera la etiqueta Rss
     * @return String con etiqueta rss
     */
    protected String generarEtiquetasRss(){
        return "<rss version=\"2.0\">";
    }

    /**
     * Funcion para generarEtiquetas
     * @param nombre de la etiqueta que queremos generar
     * @param cerrar si está cerrada, no va a hacer nada. Si no está cerrada generará el cierre de la etiqueta
     * @return la etiqueta abierta y cerrada
     */
    protected String generarEtiqueta(String nombre,String contenido,Boolean cerrar){
        String cerrado="";
        if (cerrar){
            cerrado="</"+nombre+">";
        }
        return "<"+nombre+">"+contenido+cerrado;
    }
    
    

    /**
     * Funcion para generar la etiqueta title
     * @return de la etiqueta abierta y cerrada de title
     */
    protected String generarEtiquetaTitle(String contenido){
        return generarEtiqueta("title",contenido,true);
    }

    /**
     * Funcion para generar la etiqueta link
     * @return de la etiqueta abierta y cerrada de link
     */
    protected String generarEtiquetaLink(String contenido){
        return generarEtiqueta("link",contenido,true);
    }

    /**
     * Funcion para generar la etiqueta description
     * @param contenido que lleva la etiqueta
     * @return la etiqueta description con el contenido introducido
     */
    protected String generarEtiquetaDescription(String contenido){
        return generarEtiqueta("description",contenido,true);
    }

    
    

}
