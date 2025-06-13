package RegistroDeAutos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaVehiculos {
    private List<Vehiculo> listaDeVehiculos;
    private Scanner input;

    public ListaVehiculos(Scanner input) {
        this.listaDeVehiculos = new ArrayList();
        this.input = input;
    }
    
    public void agregarVehiculo(){
        System.out.println("Sub menu");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.print("Ingresa el tipo de vehiculo que queres ingresar: ");
        int opcion = input.nextInt();
        input.nextLine();
        
        switch(opcion){
            case 1:
                System.out.print("Ingresa la marca: ");
                String marca = input.nextLine();
                
                System.out.print("Ingresa el modelo: ");
                String modelo = input.nextLine();
                
                System.out.print("Ingresa el anio: ");
                int anio = input.nextInt();
                
                System.out.print("Ingresa la cantidad de puertas: ");
                int puertas = input.nextInt();
                input.nextLine();
                
                Vehiculo autoNuevo = new Auto(puertas, marca, modelo, anio);
                listaDeVehiculos.add(autoNuevo);
                break;
                
            case 2:
                System.out.print("Ingresa la marca: ");
                String marcaDos = input.nextLine();
                
                System.out.print("Ingresa el modelo: ");
                String modeloDos = input.nextLine();
                
                System.out.print("Ingresa el anio: ");
                int anioDos = input.nextInt();
                
                System.out.print("Ingresa el cilindrado: ");
                int cilindrado = input.nextInt();
                input.nextLine();
                
                Vehiculo moto = new Moto(cilindrado, marcaDos, modeloDos, anioDos);
                listaDeVehiculos.add(moto);    
                break;
        }
    }
    
    public void mostrarLista(){
        if(listaDeVehiculos.isEmpty()){
            System.out.println("La lista esta vacia, tenes que agregar datos");
        } else {
            for(Vehiculo a : listaDeVehiculos){
                System.out.println(a);
            }
        }
    }
    
}
