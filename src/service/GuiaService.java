package service;

import model.Guia;
import java.util.ArrayList;

public class GuiaService {

    public static void mostrarGuias(ArrayList<Guia> guias) {

        for (Guia guia : guias) {
            System.out.println(guia);
        }
    }

    public static void buscarPorNombre(
            ArrayList<Guia> guias,
            String nombre) {

        for (Guia guia : guias) {

            if (guia.getPersona()
                    .getNombre()
                    .equalsIgnoreCase(nombre)) {

                System.out.println(guia);
            }
        }
    }
}