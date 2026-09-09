package clase1.Modelo;

public class Traductor implements ComunicadorTexto {
    private Texto texto;


    public Traductor(Texto texto) {

        this.texto = texto;
    }
    public Texto getTexto() {
        return texto;
    }

    @Override
    public String traductorI() {
        return "Traduciendo contenido\"" + this.texto.getContenido()
                + "\" del idioma \"" + this.texto.getIdioma();
    }

    @Override
    public String Adaptador() {
        return "Adaptando el contenido a la region \"" +
                this.texto.getRegion() + "\"";
    }

    @Override
    public String interprete() {
        return "Contenido final en\"" + this.texto.getIdioma() +
                "para la region\"" + this.texto.getRegion() + "\"";
    }
}
