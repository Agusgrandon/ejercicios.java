package EjercicioDosListas;
import java.util.ArrayList;
import java.util.List;


public class Contactos {
    List<Persona> agendaDeContactos;
    
    //inicializo la lista
    public Contactos() {
        agendaDeContactos = new ArrayList<>();
    }
    
    //agrega a la lista
    public void agregarContacto(Persona a){
        agendaDeContactos.add(a);
    }
    
    //mostrar la lista
    public void mostrarContactos(){
        for (Persona a : agendaDeContactos){
            System.out.println(a);
        }
    }
}
