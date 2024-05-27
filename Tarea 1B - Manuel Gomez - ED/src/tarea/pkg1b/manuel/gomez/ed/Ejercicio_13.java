package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] cursos = {"Calculo","Matematicas","Historia","Ciencias","Logica"};
        String [] nombresEstudiantes = {"Marley","Kobe","Juan","Isabella","Olivia","Alexis","Sofia","Victoria","Amelia","Alexa"};
        int [][] arrayNotasEstudiantes = new int [nombresEstudiantes.length][cursos.length];  
        llenarNotas(arrayNotasEstudiantes, nombresEstudiantes.length, cursos.length);
        System.out.println("Listado estudiantes");
        for (int i = 0; i < nombresEstudiantes.length; i++) 
            System.out.print("["+nombresEstudiantes[i]+"] ");
        System.out.println("");
        System.out.println("Cursos");
        for (int i = 0; i < cursos.length; i++) 
            System.out.print("["+cursos[i]+"] ");
        System.out.println("");
        while (true) {
            System.out.println("Desea visualizar alguna nota de algun Estudiante? [Si]|[No]");
            if ("Si".equals(teclado.next())){
                String nombreEstudiante, nombreCurso;
                int notaEstudiante;
                System.out.println("Ingrese el nombre del Estudiante");
                nombreEstudiante = teclado.next();
                System.out.println("Ingrese el nombre del curso para visualizar la nota del dicho Estudiante");
                nombreCurso = teclado.next();
                notaEstudiante = obtenerNotaEstudiante(arrayNotasEstudiantes, nombresEstudiantes, cursos, nombreEstudiante, nombreCurso);
                if (notaEstudiante == 0)
                    System.out.println("Ingreso Datos no Validos");
                else 
                    System.out.println(nombreEstudiante+" tiene "+notaEstudiante+" en "+nombreCurso); 
            }else {
                break;
            }
        }
    }
    public static void llenarNotas(int matriz [][], int filas, int columnas){
        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random()*9+1);
            }
        }
    }
    public static int obtenerNotaEstudiante(int matriz [][], String [] nombresEstudiantes, String [] cursos, String nombreEstudiante, String nombreCurso){
        for (int i = 0; i < nombresEstudiantes.length ; i++) 
            if (nombreEstudiante.equals(nombresEstudiantes[i])) 
                for (int j = 0; j < cursos.length; j++) 
                    if (nombreCurso.equals(cursos[j]))
                        return matriz[i][j];
        return 0;
    }
}
