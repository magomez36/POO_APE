package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese la dimension del array para la Serie Fibonacci");
        int dimension = teclado.nextInt();
        int [] arraySerieFibonacci = new int [dimension];
        arraySerieFibonacci[0] = 0;
        arraySerieFibonacci[1] = 1;
        for (int i = 0; i < arraySerieFibonacci.length; i++) {
            arraySerieFibonacci[i] = obtenerSiguienteNumero(i+1);
            System.out.print("["+arraySerieFibonacci[i]+"] ");
        }
        System.out.println("");
    }
    public static int obtenerSiguienteNumero(int numero){
        int casoBase = 1;
        if (numero <= casoBase){
            return numero;
        }else {
            return obtenerSiguienteNumero(numero-1)+obtenerSiguienteNumero(numero-2);
        }
    }
}
