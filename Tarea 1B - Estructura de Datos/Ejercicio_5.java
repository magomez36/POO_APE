package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese la dimension del array para generar y almacenar los numeros primos");
        int dimension = teclado.nextInt();
        int [] arrayNumerosPrimos = new int [dimension];
        int aux = 1;
        arrayNumerosPrimos[0] = 1;
        for (int i = 1; aux < dimension; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0){
                    cont++;
                }    
            }
            if (cont == 2){
                arrayNumerosPrimos[aux] = i;
                aux++;
            }
        }
        for (int i = 0; i < dimension; i++) {
            System.out.print("["+arrayNumerosPrimos[i]+"] ");
        }
        System.out.println("");
    }
}
