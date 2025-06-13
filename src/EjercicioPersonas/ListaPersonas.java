package EjercicioPersonas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
    private List<Persona> listaPersonas;
    private Scanner input;

    public ListaPersonas(Scanner input) {
        this.listaPersonas = new ArrayList<>();
        this.input = input;
    }
    
    public void agregarPersonas(){
        input.nextLine();
        System.out.print("Ingresa el nombre de la persona: ");
        String nombre = input.nextLine();
        
        System.out.print("Ingresa la edad: ");
        int anio = input.nextInt();
        input.nextLine();
        
        Persona personaNueva = new Persona(nombre, anio);
        
        listaPersonas.add(personaNueva);
    }
    
    public void mostrarDatos(){
        if(listaPersonas.isEmpty()){
            System.out.println("La lista esta vacia, agrega datos.");
        } else {
            for(Persona a : listaPersonas){
                System.out.println(a);
            }
        }
    }
    
}
