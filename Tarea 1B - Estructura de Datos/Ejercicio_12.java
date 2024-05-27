package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroEstudiantes, numeroCursos = 5;
        System.out.println("Por favor ingrese el numero de Estudiantes");
        numeroEstudiantes = teclado.nextInt();
        int [][] arraycolegio = new int [numeroEstudiantes][numeroCursos];
        llenarNotas(arraycolegio, numeroEstudiantes, numeroCursos);
        System.out.println("              Calculo       Matematicas       Historia       Ciencias         Logica");
        presentarNotasEstudiantes(arraycolegio, numeroEstudiantes, numeroCursos);
    }
    public static void llenarNotas(int matriz [][], int filas, int columnas){
        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random()*9+1);
            }
        }
    }
    public static void presentarNotasEstudiantes(int matriz [][],int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            if (i < 9)
                System.out.print("Alumno "+(i+1)+"  \t");
            else
                System.out.print("Alumno "+(i+1)+" \t");
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+matriz[i][j]+"]\t\t");     
            }
            System.out.println("");
        }
    }
}
