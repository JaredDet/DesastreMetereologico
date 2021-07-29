package modelo;

public class Habitante {

    private String nombre;
    private int edad;
    private int rut;
    private EstadoHabitante estado;

    public Habitante(String nombre, int edad, int rut, EstadoHabitante estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.estado = estado;
    }

    public Habitante() {

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
                "\n Edad: " + edad +
                "\n Rut: " + rut +
                "\n Estado: " + estado;
    }
}
