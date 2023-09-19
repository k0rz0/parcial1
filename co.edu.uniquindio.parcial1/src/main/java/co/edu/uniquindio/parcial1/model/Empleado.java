package co.edu.uniquindio.parcial1.model;

public class Empleado {
    private String nombre;
    private String apellido;
    private int identificacion;
    private String departamento;
    private String posicion;
    private double salario;

    public Empleado(String nombre, String apellido, int identificacion, String departamento, String posicion, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.departamento = departamento;
        this.posicion = posicion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
