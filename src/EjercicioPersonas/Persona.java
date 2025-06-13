package EjercicioPersonas;

public class Persona {
    private String nombre;
    private int anio;

    public Persona(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", anio=" + anio + '}';
    }
    
    
}
