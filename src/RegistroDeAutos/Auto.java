package RegistroDeAutos;

public class Auto extends Vehiculo{
    private int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public String toString() {
        return "Auto{" + 
                "Marca= " + getMarca() +
                ", Modelo= " + getModelo() +
                ", Año= " + getAnio() +
                "Cantidad De Puertas= " + cantidadDePuertas + '}';
    }
    
    
}
