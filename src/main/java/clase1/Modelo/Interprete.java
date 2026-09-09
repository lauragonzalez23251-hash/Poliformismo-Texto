package clase1.Modelo;

public class Interprete implements ComunicadorTexto {
    private Texto texto;

    public Interprete(Texto texto) {

        this.texto = texto;
    }
    public Texto getTexto() {
        return texto;
    }

     @Override
    public String traductorI() {
        return "El intérprete escucha el contenido\"" + this.texto.getContenido()
                + "\" hablando en \"" + this.texto.getIdioma();
    }
    @Override
    public String Adaptador() {
        return "Adaptando expresiones culturales de\"" + this.texto.getRegion();

    }
    @Override
    public String interprete (){
        return "Transmitiendo la voz en \"" + this.texto.getIdioma();

    }





}
