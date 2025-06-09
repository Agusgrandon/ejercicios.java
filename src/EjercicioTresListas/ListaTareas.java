package EjercicioTresListas;
import java.util.List;
import java.util.ArrayList;


public class ListaTareas {
    List<Tarea> listaDeTareas;
    
    //inicio la lista
    public ListaTareas(){
        listaDeTareas = new ArrayList<>();
    }
    
    //agrega a la lista tareas
    public void agregarTareas(Tarea a){
        listaDeTareas.add(a);
    }
    
    //muestra la lista de tareas
    
   public void mostrarTareas(){
       for(Tarea a : listaDeTareas){
           System.out.println(a);
       }
   }
}
