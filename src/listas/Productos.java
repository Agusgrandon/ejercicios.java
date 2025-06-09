package listas;
import java.util.List;
import java.util.ArrayList;
//Registro de productos. Crear un programa que permita al usuario agregar productos con nombre y precio a una lista, y luego mostrar todos los productos ingresados.


public class Productos {
    private List<Producto> listaProductos; // atributo

    // 2. Inicialización de la lista en el constructor
    public Productos() {
        listaProductos = new ArrayList<>();
    }
    
    public void agregarProductos(Producto a){ //agrega productos a la lista
        listaProductos.add(a);
    }
    
    public void mostrarProductos(){
        for(Producto a : listaProductos){
             a.mostrarDatos();
        }
    }
    
    
    
}
