package utiilidades;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import errores.LanzadorMensaje;
import modelo.Desastre;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jackson {


    private static ArrayList<Desastre> convertirJSONaArray(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, new TypeReference<ArrayList<Desastre>>() {});
    }

    public static ArrayList<Desastre> manejoConvertirJSONaArrayList(String json) {
        try {
            return convertirJSONaArray(json);
        } catch (JsonProcessingException e) {
            LanzadorMensaje.lanzarError(e);
            return null;
        }
    }

    private static String convertirArrayListaJSON(ArrayList<Desastre> desastres) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(desastres);
    }

    public static String manejoConvertirArraylistaJSON(ArrayList<Desastre> desastres) {
        try {
            return convertirArrayListaJSON(desastres);
        } catch (JsonProcessingException e) {
            LanzadorMensaje.lanzarError(e);
            return null;
        }
    }
}
