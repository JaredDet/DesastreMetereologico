package modelo;

import datos.DatosDesastre;
import errores.LanzadorMensaje;

import java.util.ArrayList;

public class Desastre {


    public static ArrayList<Desastre> desastres;
    private Ubicacion epicentro;
    private TipoDesastre tipoDesastre;
    private String fecha;


    public Desastre(Ubicacion epicentro, TipoDesastre tipoDesastre, String fecha) {
        this.epicentro = epicentro;
        this.tipoDesastre = tipoDesastre;
        this.fecha = fecha;
        new ArrayList<>();
    }

    public Desastre() {
        new ArrayList<>();
    }

    public static void accederaManejo(String opcion) {

        DatosDesastre manejo = new DatosDesastre("src/main/resources/recursos.txt");

        switch (opcion) {
            case "crear" -> manejo.manejoCrear();
            case "leer" -> desastres = manejo.manejoLeer("modelo.Desastre");
            case "borrar" -> manejo.borrar();
            default -> LanzadorMensaje.lanzarEntradaNoValida();
        }
    }

    public void accederaManejo(String opcion, ArrayList<Desastre> desastres) {

        DatosDesastre manejo = new DatosDesastre("src/main/resources/recursos.txt");

        switch (opcion) {
            case "crear" -> manejo.manejoCrear();
            case "actualizar" -> manejo.manejoActualizar(desastres);
            case "borrar" -> manejo.borrar();
            default -> LanzadorMensaje.lanzarEntradaNoValida();
        }
    }

    public Ubicacion getEpicentro() {
        return epicentro;
    }

    public void setEpicentro(Ubicacion epicentro) {
        this.epicentro = epicentro;
    }

    public TipoDesastre getTipoDesastre() {
        return tipoDesastre;
    }

    public void setTipoDesastre(TipoDesastre tipoDesastre) {
        this.tipoDesastre = tipoDesastre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public static ArrayList<Desastre> getDesastres() {
        return desastres;
    }

    public static void setDesastres(ArrayList<Desastre> desastres) {
        Desastre.desastres = desastres;
    }

    @Override
    public String toString() {
        return "\n Epicentro: \n" + epicentro +
                "\n tipoDesastre: " + tipoDesastre +
                "\n Fecha: " + fecha;
    }
}
