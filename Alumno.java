public class Alumno{

    private int id_alumno;
    private String fullname;
    private int edad;
    private String membresia;

    public Alumno(int id, String fullname, int edad, String membresia){
        this.id_alumno = id;
        this.fullname = fullname;
        this.edad = edad;
        this.membresia = membresia;
    }


    public int getId_alumno() {
        return id_alumno;
    }
    public String getFullname() {
        return fullname;
    }
    public int getEdad() {
        return edad;
    }
    public String getMembresia() {
        return membresia;
    }
    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nID Alumno: "+ id_alumno + "\nNombre Completo: " + fullname + "\nEdad Alumno: " + edad + "Tipo de Membresía: " + membresia;
    }
}