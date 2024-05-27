package tarea.pkg1b.manuel.gomez.ed;
import java.util.Scanner;
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rangoClientes;
        System.out.println("Ingrese el rango de Clientes");
        rangoClientes = scanner.nextInt();
        int[] clientes = new int[rangoClientes]; 
        int frente = 0; 
        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. ---> Ingresar nuevo cliente");
            System.out.println("2. ---> Atender cliente");
            System.out.println("3. ---> Retirarse de la cola");
            System.out.println("4. ---> terminar ejcucion");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cedula del nuevo cliente: ");
                    int cedula = scanner.nextInt();
                    clientes[frente] = cedula;
                    System.out.println("Cliente agregado a la cola");
                    break;
                case 2:
                    if (clientes[frente] == 0) {
                        System.out.println("No hay clientes para atender");
                    } else {
                        System.out.println("Atendiendo al cliente con cedula " + clientes[frente]);
                        clientes[frente] = 0; 
                        frente = (frente + 1) % rangoClientes; 
                    }
                    break;
                case 3:
                    System.out.println("Cliente retirado de la cola");
                    clientes[frente] = 0;
                    frente = (frente + 1) % rangoClientes; 
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Dato Ingresado no Valido");
            }
        }
    }
}
