package EjercicioCincoListas;

public class Estudiantes {
    private String nombre;
    private int nota;

    public Estudiantes(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
