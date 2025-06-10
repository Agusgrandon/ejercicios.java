package EjercicioCuatroListas;

public class Libro {
    private String nombreDelLibro;
    private String autor;
    private int anioLanzamiento;

    public Libro(String nombreDelLibro, String autor, int anioLanzamiento) {
        this.nombreDelLibro = nombreDelLibro;
        this.autor = autor;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombreDelLibro() {
        return nombreDelLibro;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreDelLibro=" + nombreDelLibro + ", autor=" + autor + ", anioLanzamiento=" + anioLanzamiento + '}';
    }
    
    
}
