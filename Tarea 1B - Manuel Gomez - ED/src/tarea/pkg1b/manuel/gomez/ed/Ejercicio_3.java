package tarea.pkg1b.manuel.gomez.ed;
public class Ejercicio_3 {
    public static void main(String[] args) {
        int [] arrayA = new int [10];
        int [] arrayB = new int [10];
        for (int i = 0; i < 10; i++) {
            arrayA[i] = i+3;
            System.out.print("["+arrayA[i]+"!] su factorial es : ");
            arrayB[i] = factorialNumero(arrayA[i]);
            System.out.print(arrayB[i]+"\n");
        }
    }
    public static int factorialNumero(int numero){
        int casoBase = 1;
        if (numero == casoBase){
            return 1;
        }
        return numero * factorialNumero(numero-1);
    }
}
