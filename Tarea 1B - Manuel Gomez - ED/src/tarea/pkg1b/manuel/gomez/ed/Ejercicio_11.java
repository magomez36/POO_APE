package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingresar la dimension de la matriz cuadrada");
        int dimension = teclado.nextInt();
        int matriz [][] = new int [dimension][dimension];
        llenarMatriz(matriz, dimension);
        System.out.println("Matriz Original");
        presentarMatriz(matriz, dimension);
        transponerMatriz(matriz, dimension);
        System.out.println("Matriz Resultante");
        presentarMatriz(matriz, dimension);
    }
    public static void llenarMatriz(int matriz [][], int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = (int)(Math.random()*99+1);
            }
        }
    }
    public static void presentarMatriz(int matriz [][], int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (matriz[i][j] < 9)
                    System.out.print("["+matriz[i][j]+"]  ");
                else
                    System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    public static void transponerMatriz(int matriz [][], int dimension){
        int matrizAux [][] = matriz;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = matrizAux[(dimension-j)-1][(dimension-i)-1];
            }
        }
    }
}
