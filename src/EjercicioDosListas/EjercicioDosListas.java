package EjercicioDosListas;
import java.util.Scanner;
//Agenda de contactos. Permitir agregar contactos con nombre y número de teléfono. Mostrar todos los contactos.


public class EjercicioDosListas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre;
        int numero;
        Contactos contactos = new Contactos();
        
        System.out.print("Ingresa el nombre y el telefono: ");
        nombre = input.nextLine();
        numero = input.nextInt();
        
        Persona contacto1 = new Persona(nombre, numero);
        contactos.agregarContacto(contacto1);
        contactos.mostrarContactos();
    }
}
