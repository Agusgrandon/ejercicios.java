package EjercicioPersonas;
import java.util.Scanner;

public class EjercicioPersonas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ListaPersonas listadoDePersonas = new ListaPersonas(input);
        
        int opcion;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("Menu");
            System.out.println("1. Agregar personas");
            System.out.println("2. Mostrar la lista");
            System.out.println("3. Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    listadoDePersonas.agregarPersonas();
                    break;
                case 2:
                    listadoDePersonas.mostrarDatos();
                    break;
                case 3:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
