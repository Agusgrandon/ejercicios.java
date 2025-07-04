
package matrices;


public class Matrices {
    public static void main(String[] args){
        //creo la matriz
        int[][] matriz = new int[2][3];
        
        //incluir valores a la matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        
        //recorrer la matriz
        
        for (int i = 0; i < 2; i++) { // filas
            for (int j = 0; j < 3; j++) { // columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // salto de linea
        }
    }
}
