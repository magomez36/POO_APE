package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_10 {
    static int aFilas, aColumnas;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 18, m = 8;
        String [][] estadoAsientosAvion = new String[n][m];
        String [][] nombreAsientosAvion = new String[n][m];
        asignarEstadoAleatorioAsientos(estadoAsientosAvion, n, m);
        asignarNombresAsientos(nombreAsientosAvion, n, m);
        presentarEstadoAvion(estadoAsientosAvion, n, m);
        while (true) {
            System.out.println("Desea reservar algun Asiento del Avion? [Si]|[No]");
            aFilas = 0;
            aColumnas = 0;
            if ("Si".equals(teclado.next())){
                String nombreAsientoFilas, nombreAsientoColumnas;
                boolean asientoEscogido = false;
                System.out.println("Ingrese el nombre del Asiento en Filas");
                nombreAsientoFilas = teclado.next();
                System.out.println("Ingrese el nombre del Asiento en Columnas");
                nombreAsientoColumnas = teclado.next();
                obtenerPosicionAsiento(nombreAsientosAvion, nombreAsientoFilas, nombreAsientoColumnas, asientoEscogido);
                if (" Ocupado ".equals(estadoAsientosAvion[aFilas][aColumnas])){
                    System.out.println("El asiento se encuentra ocupado por favor escoga otro :)");
                }else if ("  Vacio  ".equals(estadoAsientosAvion[aFilas][aColumnas])){
                    System.out.println("El asiento esta disponible desea Reservarlo? [Si]|[No]");
                    if ("Si".equals(teclado.next()))
                        estadoAsientosAvion[aFilas][aColumnas] = " Ocupado ";
                }else if (asientoEscogido == false)
                    System.out.println("Los Datos Ingresado son Incorrentos");
            }else {
                break;
            }
            System.out.println("------------Datos Avion Actualizados------------");
            presentarEstadoAvion(estadoAsientosAvion, n, m);
        }
        
    }
    public static void asignarEstadoAleatorioAsientos(String [][] estadoAsientosAvion, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                estadoAsientosAvion[i][j] = ((int)(Math.random()*2+1) == 1)?(" Ocupado "):("  Vacio  ");
            }
        }
    }
    public static void asignarNombresAsientos(String [][] nombreAsientosAvion, int n , int m){
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                nombreAsientosAvion[i][j] = "N"+(i+1)+"M"+(j+1);
    }
    public static void obtenerPosicionAsiento(String matrizAsientos [][], String nombreAsientoFilas, String nombreAsientoColumnas, boolean asientoEscogido){
        String asientoSeleccionado = nombreAsientoFilas+nombreAsientoColumnas;
        for (int i = 0; i < 18 ; i++){
            for (int j = 0; j < 8; j++) {
                if (asientoSeleccionado.equals(matrizAsientos[i][j])){
                    aFilas = i;
                    aColumnas = j;
                    asientoEscogido = true;
                }
            }
        }
    }
    public static void presentarEstadoAvion(String [][] estadoAsientosAvion, int n, int m){
        System.out.println("          M 1         M 2         M 3         M 4         M 5         M 6         M 7         M 8");
        for (int i = 0; i < n; i++) {
            if (i < 9)
                System.out.print("N "+(i+1)+"   ");
            else
                System.out.print("N "+(i+1)+"  ");
            for (int j = 0; j < m; j++) {
                System.out.print("["+estadoAsientosAvion[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
}
