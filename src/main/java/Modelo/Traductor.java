package Modelo;

public class Traductor implements ComunicadorTexto {
    private Texto texto;


    public Traductor(String Texto) {
        this.texto = texto;
    }
    @Override
    public String traductorI(Texto texto) {
        return "Traduciendo contenido\"" + this.texto.getContenido() + "\" del idioma \"" + this.texto.getIdioma() +
                "\" en la región \"" + this.texto.getRegion() + "\"";
    }

    @Override
    public String Adaptador(Texto texto) {
        return "";
    }

    @Override
    public String interprete(Texto texto) {
        return "";
    }
}
