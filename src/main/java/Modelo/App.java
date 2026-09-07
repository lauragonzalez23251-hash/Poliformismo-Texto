package Modelo;

public class App implements ComunicadorTexto {
    private Texto texto;

    public App(Texto texto){
        this.texto = texto;
    }
    @Override
    public String traductorI  (Texto texto){
        return "Se está procesando el contenido\"" + this.texto.getContenido()
                + "\" en el idioma \"" + this.texto.getIdioma();
    }
    @Override
    public String Adaptador (Texto texto){
        return "Configurando la región a \"" + this.texto.getRegion() +
                "\" para el contenido";
    }
    @Override
    public String interprete(Texto texto) {
        return "Entregando la traducción completa en \"" + this.texto.getIdioma() +
                "\" para la región \"" + this.texto.getRegion() + "\"";

    }
}
