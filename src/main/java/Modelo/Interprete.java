package Modelo;

public class Interprete implements ComunicadorTexto {
    private Texto texto;

    public Interprete(Texto texto) {

        this.texto = texto;
    }
     @Override
    public String traductorI(Texto texto) {
        return "El intérprete escucha el contenido\"" + this.texto.getContenido()
                + "\" hablando en \"" + this.texto.getIdioma();
    }
    @Override
    public String Adaptador(Texto texto) {
        return "Adaptando expresiones culturales de\"" + this.texto.getRegion();

    }
    @Override
    public String interprete (Texto texto){
        return "Transmitiendo la voz en \"" + this.texto.getIdioma();

    }





}
