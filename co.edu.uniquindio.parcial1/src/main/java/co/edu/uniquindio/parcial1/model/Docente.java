package co.edu.uniquindio.parcial1.model;

public class Docente {

    private String nombre;
    private String apellido;
    private int edad;
    private String correo;

    public Docente(String nombre, int edad, String correo, String apellido){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String  getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }
}


