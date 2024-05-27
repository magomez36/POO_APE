package tarea.pkg1b.manuel.gomez.ed;
public class Ejercicio_6 {
    public static void main(String[] args) {
        boolean arrayOrdenado;
        int [] arrayNumerosEnteros = new int[7];
        arrayNumerosEnteros[0] = 4;
        arrayNumerosEnteros[1] = 6;
        arrayNumerosEnteros[2] = 2;
        arrayNumerosEnteros[3] = 5;
        arrayNumerosEnteros[4] = 1;
        arrayNumerosEnteros[5] = 7;
        arrayNumerosEnteros[6] = 3;
        int [] arrayAux = new int [7];
        arrayAux[0] = 4;
        arrayAux[1] = 6;
        arrayAux[2] = 2;
        arrayAux[3] = 5;
        arrayAux[4] = 1;
        arrayAux[5] = 7;
        arrayAux[6] = 3;
        arrayAux = ordenSeleccion(arrayAux);
        arrayOrdenado = verficarOrdenArray(arrayAux, arrayNumerosEnteros);
        
        if (arrayOrdenado == false) {
            System.out.println("El arreglo de numeros enteros No esta ordenado.");
        }
        else {
            System.out.println("El arreglo de numeros enteros Si esta ordenado.");
        }
    }
    public static int[] ordenSeleccion(int []array) {
        int i, j, k, aux;
        for (i = 0; i < array.length-1; i++) {
            k = i;
            for (j = i+1; j <= array.length-1; j++) {
                if (array[j] < array[k]) k = j;
            }
            if (k != i) {
                aux = array[k];
                array[k] = array[i];
                array[i] = aux;
            }
        }
        return array;
    }
    public static boolean verficarOrdenArray(int [] arrayAux, int [] arrayNumerosEnteros){
        boolean arrayOrdenado = false;
        for (int i = 0; i < 7; i++) 
            if (arrayNumerosEnteros[i] != arrayAux[i]){
                arrayOrdenado = false;
                break;
            }else {
                arrayOrdenado = true;
            }
        return arrayOrdenado;
    }
}
