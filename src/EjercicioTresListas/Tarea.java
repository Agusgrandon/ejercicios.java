package EjercicioTresListas;


public class Tarea {
    private String descripcion;
    private String prioridad;

    public Tarea(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" + "descripcion=" + descripcion + ", prioridad=" + prioridad + '}';
    }

}
