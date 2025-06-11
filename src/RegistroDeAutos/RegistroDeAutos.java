package RegistroDeAutos;
import java.util.Scanner;


public class RegistroDeAutos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ListaVehiculos listadoCompleto = new ListaVehiculos();
        
        String marca;
        String modelo;
        int anio;
        int cilindrada;
        int cantidadPuertas;
        int opcion;
        String opcionDos;
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
                    opcionDos = input.nextLine();
                    System.out.print("Ingresa el tipo de vehiculo que queres ingresar (Auto o Moto): ");
                    if(opcionDos == "auto" || opcionDos == "Auto"){
                        System.out.print("Ingresa a marca del auto: ");
                        marca = input.nextLine();
                        System.out.print("Ingresa el modelo: ");
                        modelo = input.nextLine();
                        System.out.print("Ingresa el año: ");
                        anio = input.nextInt();
                        System.out.print("Ingresa la cantidad de puertas que tiene: ");
                        cantidadPuertas = input.nextInt();
                        // creo el objeto
                        Vehiculo vehiculoNuevo = new Auto(cantidadPuertas, marca, modelo, anio);
                }
                case 2:
                    System.out.println("opcion2");
                case 3:
                    seguir = false;
                    break;
            }
        }
    }
}
