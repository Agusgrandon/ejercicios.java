package EjercicioTresListas;
import java.util.Scanner;
//Lista de tareas. El usuario puede ingresar tareas pendientes con descripción y prioridad. Mostrar todas las tareas ingresadas.

public class EjercicioTresListas {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     ListaTareas tareas = new ListaTareas();
     String tarea;
     String prioridad;
     int opcion;
     boolean seguir = true;
     
     while(seguir){
         System.out.println("Menu");
         System.out.println("1. Agregar tareas");
         System.out.println("2. Mostrar tareas");
         System.out.println("3. Salir");
         System.out.print("Seleccione una opcion: ");
         
         opcion = input.nextInt();
         
         switch(opcion){
            case 1:
                 System.out.println("Ingresa la tarea: ");
                 tarea = input.nextLine();
                 System.out.println("Ingresa la prioridad: ");
                 prioridad = input.nextLine();
                 input.nextLine();
                 Tarea crearTarea = new Tarea(tarea, prioridad);
                 tareas.agregarTareas(crearTarea);
                 break;
            case 2:
                tareas.mostrarTareas();
                break;
            case 3:
                seguir = false;
                break;
            default:
                System.out.println("Opcion invalida");
                break;
         }
     }
      input.close();
     
    }
}
