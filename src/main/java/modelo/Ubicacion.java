package modelo;

import java.util.ArrayList;

public class Ubicacion {

    private String nombrePais;
    private String nombreCiudad;
    private ArrayList<Habitante> ciudadanos;
    private ZonaGeografica zonaGeografica;

    public Ubicacion(String nombrePais, String nombreCiudad, ArrayList<Habitante> ciudadanos, ZonaGeografica zonaGeografica) {
        this.nombrePais = nombrePais;
        this.nombreCiudad = nombreCiudad;
        this.ciudadanos = ciudadanos;
        this.zonaGeografica = zonaGeografica;
    }

    public Ubicacion() {

    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public ArrayList<Habitante> getCiudadanos() {
        return ciudadanos;
    }

    public void setCiudadanos(ArrayList<Habitante> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }

    public ZonaGeografica getZonaGeografica() {
        return zonaGeografica;
    }

    public void setZonaGeografica(ZonaGeografica zonaGeografica) {
        this.zonaGeografica = zonaGeografica;
    }

    @Override
    public String toString() {
        return " Nombre de país: " + nombrePais +
                "\n Nombre de ciudad: " + nombreCiudad +
                "\n Ciudadanos: \n" + ciudadanos +
                "\n Zona geográfica: " + zonaGeografica;
    }
}
