package modelo;

import java.util.ArrayList;

public class Pais {

    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public void agregarCiudades(Ciudad ciudad){
        ciudades.add(ciudad);
    }
}
