package EjercicioCuatroListas;
import java.util.ArrayList;
import java.util.List;

public class ListaLibros {
    List<Libro> listaDeLibros;
    
    public ListaLibros(){
        listaDeLibros = new ArrayList<>();
    }
    
    public void agregarLibros(Libro a){
        listaDeLibros.add(a);
    }
    
    public void mostrarLibros(){
        for(Libro a : listaDeLibros){
            System.out.println(a);
        }
    }
}
