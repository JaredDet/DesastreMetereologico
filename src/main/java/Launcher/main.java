package Launcher;

import modelo.*;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Desastre.accederaManejo("leer");
        System.out.println(Desastre.getDesastres().toString());
    }
}
