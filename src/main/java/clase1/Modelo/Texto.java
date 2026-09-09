package clase1.Modelo;

public class Texto {
    private String Contenido;
    private String Idioma;
    private String Region;

    public Texto(String contenido, String idioma, String region) {
        this.Contenido = contenido;
        this.Idioma = idioma;
        this.Region= region;
    }

    public String getContenido() {
        return Contenido;
    }
    public String getIdioma() {
        return Idioma;
    }
    public String getRegion() {
        return Region;
    }
}
