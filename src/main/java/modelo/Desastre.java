package modelo;

import datos.DatosDesastre;
import errores.LanzadorMensaje;

import java.util.ArrayList;

public class Desastre {

    public static ArrayList<Desastre> desastres = new ArrayList<>();
    private Ubicacion epicentro;
    private TipoDesastre tipoDesastre;
    private String fecha;


    public Desastre(Ubicacion epicentro, TipoDesastre tipoDesastre, String fecha) {
        this.epicentro = epicentro;
        this.tipoDesastre = tipoDesastre;
        this.fecha = fecha;
    }

    public Desastre() {

    }

    public static void accederaManejo(String opcion) {

        DatosDesastre manejo = new DatosDesastre("src/main/resources/recursos.txt");

        switch (opcion) {
            case "create" -> manejo.manejoCrear();
            case "leer" -> desastres = manejo.manejoLeer("modelo.Desastre");
            case "borrar" -> manejo.borrar();
            default -> LanzadorMensaje.lanzarEntradaNoValida();
        }
    }

    public void accederaManejo(String opcion, Desastre desastre) {

        DatosDesastre manejo = new DatosDesastre("src/main/resources/recursos.txt");

        switch (opcion) {
            case "create" -> manejo.manejoCrear();
            case "actualizar" -> manejo.manejoActualizar(desastre);
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
}
