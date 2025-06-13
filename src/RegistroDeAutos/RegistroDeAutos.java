package RegistroDeAutos;
import java.util.Scanner;


public class RegistroDeAutos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ListaVehiculos listadoCompleto = new ListaVehiculos(input);
        
        int opcion;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("Menu");
            System.out.println("1. Agregar vehiculo");
            System.out.println("2. Mostrar listado");
            System.out.println("3. Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    listadoCompleto.agregarVehiculo();
                    break;
                case 2:
                    listadoCompleto.mostrarLista();
                    break;
                case 3:
                    seguir = false;
                    break;
            }
        }
    }
}
