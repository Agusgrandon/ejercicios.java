package listas;


public class Producto {
    
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", Precio: $" + precio);
    }
    
}
