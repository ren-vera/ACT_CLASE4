import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlumno {
    
    private ArrayList<Alumno> alumnos;
    private Scanner scanner;

    public GestionAlumno(){
        alumnos = new ArrayList<>();
        scanner = new Scanner(System.in);

    }

    public void agregarAlumno(){
        System.out.println("Ingrese su ID del Alumno: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese su nombre completo: ");
        String fullname  = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su tipo de Membresía:");
        String membresia = scanner.nextLine();
        Alumno alumno = new Alumno(id, fullname, edad, membresia);

        alumnos.add(alumno);
        System.out.println("¡Alumno agregado correctamente!");
    }

    public void mostrarAlumnos(){
        //evaluo si hay alumnos o no
        if(alumnos.isEmpty()){
            System.out.println("NO HAY ALUMNOS INGRESADOS");
        }else{
            for(Alumno alumno : alumnos){
                System.out.println(alumno);
            }
        }
    }

    public void actualizarAlumno(){
        System.out.println("Ingrese la ID del alumno para actualizar datos: ");
        int id = scanner.nextInt();
        scanner. nextLine();
        //BUSCAR ID
        for(Alumno alumno : alumnos){
            if(alumno.getId_alumno()== id){
                System.out.println("Ingrese el nombre completo del Alumno: ");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese la edad del alumno: ");
                int nuevaEdad = scanner.nextInt();
                System.out.println("Ingrese el tipo de membresía: ");
                String tipoMembresia = scanner.nextLine();
                //actualizo datos
                alumno.setFullname(nuevoNombre);
                alumno.setEdad(nuevaEdad);
                alumno.setMembresia(tipoMembresia);
                System.out.println("LOS DATOS DEL ALUMNO HAN SIDO ACTUALIZADOS CORRECTAMENTE");
                return;
            }else{
                System.out.println("Alumno no encontrado");
            }
        }
    }

    public void eliminarAlumno(){
        System.out.println("Ingrese la ID del Alumno que desea eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        //Buscamos en la lista
        Alumno alumnoAeliminar = null;
        for(Alumno alumno : alumnos){
            if(alumno.getId_alumno() == id){
                alumnoAeliminar = alumno;
            }
        }
        if(alumnoAeliminar != null){
            alumnos.remove(alumnoAeliminar);
            System.out.println("ALUMNO ELIMINADO");

        }else{
            System.out.println("ALUMNO NO ENCONTRADO");
        }
    }

}
