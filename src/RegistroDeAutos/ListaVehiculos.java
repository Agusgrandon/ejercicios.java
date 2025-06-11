package RegistroDeAutos;
import java.util.ArrayList;
import java.util.List;


public class ListaVehiculos {
    List<Vehiculo> listaDeVehiculos;
    
    public ListaVehiculos(){
        listaDeVehiculos = new ArrayList();
    }
    
    public void agregarVehiculo(Vehiculo a){
        listaDeVehiculos.add(a);
    }
    
    public void mostrarLista(){
        for(Vehiculo a : listaDeVehiculos){
            System.out.println(a);
        }
    }
    
}
