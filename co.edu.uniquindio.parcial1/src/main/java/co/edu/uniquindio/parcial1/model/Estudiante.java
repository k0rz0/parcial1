package co.edu.uniquindio.parcial1.model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int edad;
    private String correo;
    private int semestre;
    private double estatura;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;


    /*Constructor*/

    public Estudiante(String nombre, String apellido, String fechaNacimiento, int edad,
                      String correo, int semestre, double estatura, double nota1, double nota2,
                      double nota3, double nota4, double nota5) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
        this.estatura = estatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double promedioNotas(){
        return (getNota1() + getNota2() + getNota3() + getNota4() + getNota5())/5;
    }

    public double notaMayor(){

        if(getNota1() >= getNota2() && getNota1() >= getNota3() && getNota1() >= getNota4() && getNota1() >= getNota5()){
            return getNota1();
        }else{
            if(getNota2() >= getNota3() && getNota2() >= getNota4() && getNota2() >= getNota5()){
                return getNota2();
            }else{
                if(getNota3() >= getNota4() && getNota3() >= getNota5()){
                    return getNota3();
                }else{
                    if(getNota4() >= getNota5()){
                        return getNota4();
                    }else{
                        return getNota5();
                    }
                }
            }
        }
    }
}
