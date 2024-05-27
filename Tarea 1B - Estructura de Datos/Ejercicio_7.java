package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension, sumaNumerosPares = 0, sumaNumerosImpares = 0;
        System.out.println("Por favor ingrese la dimension de la lista");
        dimension = teclado.nextInt();
        int [] lista = new int [dimension];
        for (int i = 0; i < dimension; i++) {
            lista[i] = (int)(Math.random()*8+1);
            if (lista[i] % 2 == 0){
                sumaNumerosPares += lista[i];
                System.out.println("["+lista[i]+"] numero Par");
            }else if (lista[i] % 2 == 1){
                sumaNumerosImpares += lista[i];
                System.out.println("["+lista[i]+"] numero Impar");
            }
        }
        System.out.println("Resultado de suma numeros Pares: "+sumaNumerosPares);
        System.out.println("Resultado de suma numeros Impares: "+sumaNumerosImpares);
    }
}
