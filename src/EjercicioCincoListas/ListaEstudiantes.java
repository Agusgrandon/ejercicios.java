package EjercicioCincoListas;
import java.util.ArrayList;
import java.util.List;


public class ListaEstudiantes {
    List<Estudiantes> listadoEstudiantes;

    public ListaEstudiantes(){
        listadoEstudiantes = new ArrayList();
    }
    
    public void agregarEstudiante(Estudiantes a){
        listadoEstudiantes.add(a);
    }
    
    public void mostrarLista(){
        for(Estudiantes a : listadoEstudiantes){
            System.out.println(a);
        }
    }
    
    //metodo que devuelve estudiantes aprobados
    public void estudiantesAprobados(){
        for(Estudiantes a : listadoEstudiantes){
            if(a.getNota() >= 6){
                System.out.println("Los estudiantes aprobados son: " + a);
            }
        }
    }
}
