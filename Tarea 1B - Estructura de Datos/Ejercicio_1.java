package tarea.pkg1b.manuel.gomez.ed;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String aux;
        String nombreArchivoData = "Deudas.txt";
        String nombreArchivoActualizar = "DeudasActualizado.txt";
        int numeroLineas;
        numeroLineas = verfificarNumeroLineas(nombreArchivoData);
        String [][] dataClientes = new String[numeroLineas][4];
        String [] dataClientesLinea = new String[numeroLineas];
        leerArchivo(nombreArchivoData, dataClientesLinea);
        dividirDatos(dataClientesLinea, dataClientes, numeroLineas);
        cambiarEstadoClientes(dataClientes, numeroLineas);
        crearArchivoActualizado(nombreArchivoActualizar);
        escribirArchivoActualizado(dataClientes, numeroLineas, nombreArchivoActualizar);
        leerArchivo(nombreArchivoActualizar, dataClientesLinea);
        System.out.println("Desea ver el archivo actualizado? [Si]|[No]");
        aux = teclado.next(); 
        if ("Si".equals(aux)) {
            for (int i = 0; i < numeroLineas; i++) {
                System.out.println(dataClientesLinea[i]);
            }
        }
    }
    public static void crearArchivoActualizado(String nombreArchivo){
        try {
            File file = new File(nombreArchivo);
            if(file.createNewFile())
                System.out.println("Archivo creado: " + file.getName());
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public static void dividirDatos(String [] dataClientesLinea, String [][] dataClientes, int numeroLineas){
        for (int i = 0; i < numeroLineas; i++) {
            String [] aux = new String[4];
            String parts[] = dataClientesLinea[i].split(" ");
            aux[0] = parts[0];
            aux[1] = parts[1];
            aux[2] = parts[2]+" "+parts[3]+" "+parts[4];
            aux[3] = parts[5];       
            for (int j = 0; j < 4; j++) {
                dataClientes[i][j] = aux[j];
            }
        } 
    }
    public static void escribirArchivoActualizado(String [][] dataClientes, int numeroLineas, String nombreArchivo){
        try (BufferedWriter myBufferWriter = new BufferedWriter(new FileWriter(nombreArchivo, false))){
            for (int i = 0; i < numeroLineas; i++) {
                for (int j = 0; j < 4; j++) {
                    myBufferWriter.write(dataClientes[i][j]+" ");
                }
                myBufferWriter.write("\n");
            }
            myBufferWriter.close();
        } catch (IOException e) {
            System.out.println("Error en escribir archivo");
        }
    }
    public static void leerArchivo(String nombreArchivo, String [] dataClientesLinea){
        try (BufferedReader myBufferReader = new BufferedReader(new FileReader(nombreArchivo))){
            int i = 0;
            String line = myBufferReader.readLine();
            while (line != null) {
                dataClientesLinea[i] = line;
                line = myBufferReader.readLine();  
                i++;
            }
        } catch (IOException e) {
            System.out.println("Error en leer archivo");
        }
    }
    public static int verfificarNumeroLineas(String nombreArchivo){      
        int numeroLineas = 0;
        try (BufferedReader myBufferReader = new BufferedReader(new FileReader(nombreArchivo))){
            String line = myBufferReader.readLine();
            while (line != null) {
                numeroLineas++;
                line = myBufferReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error en leer archivo");
        }
        return numeroLineas;
    }
    public static void cambiarEstadoClientes(String [][] dataClientes, int numeroLineas){
        for (int i = 0; i < numeroLineas; i++) { 
            if ("Central de Riesgo".equals(dataClientes[i][2])){
                dataClientes[i][2] = "Liberado";
            }
        }
    }
}
