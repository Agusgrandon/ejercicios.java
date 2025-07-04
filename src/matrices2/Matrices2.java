package matrices2;
import java.util.Scanner;


public class Matrices2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[2][3];
    
        //ingresar valores en la matriz
        System.out.println("Ingresa los valores para una matriz de 2 filas y 3 columnas:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        
        //imprimir la matriz
        System.out.println("\nLa matriz ingresada es:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        input.close(); 

    }
}
