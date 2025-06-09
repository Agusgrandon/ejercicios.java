package listas;


public class Listas {
    public static void main(String[] args){
        // 1. Crear una instancia de Productos (lista vacía)
        Productos productos = new Productos();
        
        // 2. Crear objetos Producto y agregarlos a la lista
        productos.agregarProductos(new Producto("Harina", 250));
        productos.agregarProductos(new Producto("Aceite", 750));
        
        // 3. Mostrar todos los productos ingresados
        productos.mostrarProductos();
 
    }
}
