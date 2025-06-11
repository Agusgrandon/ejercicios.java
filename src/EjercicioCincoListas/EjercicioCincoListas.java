package EjercicioCincoListas;
import java.util.Scanner;
//Notas de estudiantes. Permitir ingresar estudiantes con nombre y una nota. Luego mostrar qué estudiantes aprobaron (nota >= 6).


public class EjercicioCincoListas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ListaEstudiantes listadoDeEstudiantes = new ListaEstudiantes();
        
        String nombre;
        int nota;
        int opcion;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("Menu");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar el listado de estudiantes");
            System.out.println("3. Mostrar los estudiantes aprobados con mas de 6");
            System.out.println("4. Mostrar los estudiantes desaprobados");
            System.out.println("5. Mostrar la cantidad de alumnos aprobados");
            System.out.println("6. Mostrar la cantidad de alumnos desaprobados");
            System.out.println("7. Mostrar el promedio de alumnos aprobados");
            System.out.println("8. Mostrar el porcentaje de alumnos desaprobados");
            System.out.println("9. Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    input.nextLine();
                    System.out.print("Ingresa el nombre del alumno: ");
                    nombre = input.nextLine();
                    System.out.print("Ingresa la nota: ");
                    nota = input.nextInt();
                    //genero el objeto estudiantes
                    Estudiantes estudiante = new Estudiantes(nombre, nota);
                    //agrego el objeto a la lista
                    listadoDeEstudiantes.agregarEstudiante(estudiante);
                    break;
                case 2:
                    listadoDeEstudiantes.mostrarLista();
                    break;
                case 3:
                    listadoDeEstudiantes.estudiantesAprobados();
                    break;
                case 4:
                    listadoDeEstudiantes.estudiantesDesaprobados();
                    break;
                case 5:
                    System.out.println("La cantidad de aprobados son: " + listadoDeEstudiantes.contadorAprobados());
                    break;
                case 6:
                    System.out.println("La cantidad de alumnos desaprobados son: " + listadoDeEstudiantes.contadorDesaprobados());
                    break;
                case 7:
                    System.out.println("El promedio de alumnos aprobados es de: " + listadoDeEstudiantes.promedioAprobados());
                    break;
                case 8:
                    System.out.println("El porcentaje de alumnos desaprobados es del: " + listadoDeEstudiantes.porcentajeDesaprobados() + "%");
                    break;
                case 9:
                    seguir = false;
                    break;     
            } 
        }
        input.close();
    }
}
