package Modelo;

public class Traductor implements ComunicadorTexto {
    private Texto texto;


    public Traductor(Texto texto) {

        this.texto = texto;
    }
    @Override
    public String traductorI(Texto texto) {
        return "Traduciendo contenido\"" + this.texto.getContenido()
                + "\" del idioma \"" + this.texto.getIdioma();
    }

    @Override
    public String Adaptador(Texto texto) {
        return "Adaptando el contenido a la region \"" +
                this.texto.getRegion() + "\"";
    }

    @Override
    public String interprete(Texto texto) {
        return "Contenido final en\"" + this.texto.getIdioma() +
                "para la region\"" + this.texto.getRegion() + "\"";
    }
}
