import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        GestionAlumno gestionAlumno = new GestionAlumno();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("--- MENU DE INGRESO ALUMNOS ---");
            System.out.println("\n1.- Agregar Alumno");
            System.out.println("2.- Mostrar lista de Alumnos");
            System.out.println("3.- Actualizar Alumno");
            System.out.println("4.- Eliminar Alumno");
            System.out.println("5.- Salir");

            System.out.println("\n Seleccione una opcion: ");
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1: 
                    gestionAlumno.agregarAlumno();
                    break;
                case 2: 
                    gestionAlumno.mostrarAlumnos();
                    break;
                case 3:
                    gestionAlumno.actualizarAlumno();
                    break;
                case 4:
                    gestionAlumno.eliminarAlumno();
                    break;
                case 5:
                    System.out.println("CERRANDO SISTEMA...");
                    return;
            }
        }while(opcion != 5);
    }
}



