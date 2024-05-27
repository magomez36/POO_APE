package tarea.pkg1b.manuel.gomez.ed;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreArchivoPacientes = "historialMedicoPacientes.txt";
        System.out.println("Por favor ingrese el numero de Pacientes que desea gestionar");
        int numPacientes = teclado.nextInt();        
        String [][] historialMedico = new String [numPacientes][7];
        guardarInfoPacientes(historialMedico, numPacientes);
        crearArchivoPacientes(nombreArchivoPacientes);
        escribirArchivoPacientes(nombreArchivoPacientes, historialMedico, numPacientes);
        System.out.println("Desea ver el archivo del historial medico de los Pacientes? [Si]|[No]");
        String aux = teclado.next();
        if ("Si".equals(aux)){
            leerArchivoPacientes(nombreArchivoPacientes);
        }
    }
    public static void crearArchivoPacientes(String nombreArchivo){
        try {
            File file = new File(nombreArchivo);
            if(file.createNewFile())
                System.out.println("Archivo creado: " + file.getName());
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public static void guardarInfoPacientes(String [][] historialMedico, int numPacientes) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numPacientes; i++) {
            System.out.println("Por favor Ingrese la Cedula de identidad del paciente");
            historialMedico[i][0] = teclado.nextLine();
            System.out.println("Por favor Ingrese los Apellidos Completos del paciente");
            historialMedico[i][1] = teclado.nextLine();
            System.out.println("Por favor Ingrese los Nombres completos del paciente");
            historialMedico[i][2] = teclado.nextLine();   
            System.out.println("Por favor Ingrese la Fecha de nacimiento del paciente");
            historialMedico[i][3] = teclado.nextLine();
            System.out.println("Por favor Ingrese la Estatura del paciente");
            historialMedico[i][4] = teclado.nextLine();
            System.out.println("Por favor Ingrese el Peso del paciente");
            historialMedico[i][5] = teclado.nextLine();
            System.out.println("Por favor Ingrese las Alergias del paciente");
            historialMedico[i][6] = teclado.nextLine();
        }
    }
    public static void escribirArchivoPacientes(String nombreArchivoPacientes, String [][] historialMedico, int numPacientes){
        try (BufferedWriter myBufferWriter = new BufferedWriter(new FileWriter(nombreArchivoPacientes, true))){
            for (int i = 0; i < numPacientes; i++) {
                for (int j = 0; j < 7; j++) {
                    myBufferWriter.write(historialMedico[i][j]+" ");
                }
                myBufferWriter.write("\n");
            }
            myBufferWriter.close();
        } catch (IOException e) {
            System.out.println("Error en escribir archivo");
        }
    }
    public static void leerArchivoPacientes(String nombreArchivoPacientes){
        try (BufferedReader myBufferReader = new BufferedReader(new FileReader(nombreArchivoPacientes))){
            String line = myBufferReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = myBufferReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error en leer archivo");
        }
    }
}
