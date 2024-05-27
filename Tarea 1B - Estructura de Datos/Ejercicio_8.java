package tarea.pkg1b.manuel.gomez.ed;
public class Ejercicio_8 {
    public static void main(String[] args) {
        double [][] notasEstudiantes = new double [20][4];
        double [] mediaAsignatura = new double [4];
        double mediaClase = 0;
        System.out.println("Alumnos     A1    A2    A3    A4");
        for (int i = 0; i < 20; i++) {
            double mediaAlumno = 0;
            for (int j = 0; j < 4; j++) {
                notasEstudiantes[i][j] = (double)(Math.random()*10+0);
                mediaAlumno += notasEstudiantes[i][j];
                mediaAsignatura[j] += notasEstudiantes [i][j];
            }
            mediaAlumno = mediaAlumno/4;
            mediaClase += mediaAlumno;
            if (i < 9)
                System.out.printf("Alumno %d ",(i+1));
            else
                System.out.printf("Alumno %d",(i+1));
            System.out.printf("  %.2f",notasEstudiantes[i][0]);
            System.out.printf("  %.2f",notasEstudiantes[i][1]);
            System.out.printf("  %.2f",notasEstudiantes[i][2]);
            System.out.printf("  %.2f",notasEstudiantes[i][3]);
            System.out.printf("  Media Alumno --> %.2f",mediaAlumno);
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            mediaAsignatura[i] = mediaAsignatura[i]/20;
            System.out.printf("Media Asignatura %d : %.2f",(i+1),mediaAsignatura[i]);
            System.out.println("");
        }
        mediaClase = mediaClase/20;
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Media Clase --> %.2f",mediaClase);
        System.out.println("");
    }
}
