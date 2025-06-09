package EjercicioDosListas;

public class Persona {
    private String nombre;
    private int numero;

    public Persona(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", numero=" + numero + '}';
    }
    
    
}
