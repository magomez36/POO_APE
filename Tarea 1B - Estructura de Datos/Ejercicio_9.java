package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numClientes;
        System.out.println("Por favor ingrese la cantidad de clientes que asistio a la semana en que se inauguro el gimnasio");
        numClientes = teclado.nextInt();
        int numClientesDescuento = 0;
        String [][] asistenciaSemana = new String [numClientes][6];
        System.out.println("Clientes        LUNES     MARTES    MIERCOLES   JUEVES     VIERNES    SABADO");
        for (int i = 0; i < numClientes; i++) {
            int cont = 0;
            if (i < 9)
                System.out.print("Cliente "+(i+1)+"    ");
            else
                System.out.print("Cliente "+(i+1)+"   ");
            for (int j = 0; j < 6; j++) {
                asistenciaSemana[i][j] = ((int)(Math.random()*2+1) == 1)?("Presente"):(" Ausente");
                System.out.print("["+asistenciaSemana[i][j]+"] ");
                if ("Presente".equals(asistenciaSemana[i][j]))
                    cont++;
                if (cont >= 3 && j == 5)
                    numClientesDescuento++;              
            }
            System.out.println("");
        }
        System.out.println(numClientesDescuento);
        String [] clientesConDescuento = new String [numClientesDescuento];
        int aux = 0;
        for (int i = 0; i < numClientes; i++) {
            int cont = 0;
            for (int j = 0; j < 6; j++) {
                if ("Presente".equals(asistenciaSemana[i][j]))
                    cont++;               
            }
            if (cont >= 3){
                clientesConDescuento[aux] = "Cliente "+(i+1);
                aux++;
            }
        }
        System.out.println("Lista Clientes con descuento del 20%");
        for (int i = 0; i < numClientesDescuento; i++) {
            System.out.println(clientesConDescuento[i]);
        }
    }
}
