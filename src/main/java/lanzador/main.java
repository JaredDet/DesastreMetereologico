package lanzador;

import modelo.*;

public class main {

    public static void main(String[] args) {

        Desastre.accederaManejo("leer");
        System.out.println(Desastre.getDesastres().toString());
    }
}
