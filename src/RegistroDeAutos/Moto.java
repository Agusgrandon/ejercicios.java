
package RegistroDeAutos;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(int cilindrada, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindrada=" + cilindrada + '}';
    }
    
    
}
