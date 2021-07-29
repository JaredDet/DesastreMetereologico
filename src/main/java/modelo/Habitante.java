package modelo;

public class Habitante {

    private String nombre;
    private String apellido;
    private int edad;
    private int rut;
    private EstadoHabitante estado;

    public Habitante(String nombre, String apellido, int edad, int rut, EstadoHabitante estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.estado = estado;
    }

    public Habitante() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public EstadoHabitante getEstado() {
        return estado;
    }

    public void setEstado(EstadoHabitante estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\n Apellido: " + apellido +
                "\n Edad: " + edad +
                "\n Rut: " + rut +
                "\n Estado: " + estado;
    }
}
