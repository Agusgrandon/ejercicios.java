package EjercicioCuatroListas;
import java.util.Scanner;
//Lista de libros. Ingresar libros con título y autor. Mostrar la lista completa al usuario.

public class EjercicioCuatroListas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ListaLibros listadoLibros = new ListaLibros();
        
        String nombreLibro;
        String nombreAutor;
        int anio;
        int opcion;
        boolean continuar = true;
        
        while(continuar){
            System.out.println("Menu");
            System.out.println("1. Agregar libros");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Salir");
            System.out.print("Ingresa una opcion: ");
            
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingresa el nombre del autor: ");
                    nombreAutor = input.nextLine();
                    input.nextLine();
                    System.out.print("Ingresa el nombre del libro: ");
                    nombreLibro = input.nextLine();
                    System.out.print("Ingresa el año de publicacion: ");
                    anio = input.nextInt();
                    Libro libro1 = new Libro(nombreLibro, nombreAutor, anio);
                    listadoLibros.agregarLibros(libro1);
                    break;
                case 2:
                    listadoLibros.mostrarLibros();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        input.close();
    }
}
