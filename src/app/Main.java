package app;

import data.GestorServicios;
import model.Guia;
import service.GuiaService;
import util.ArchivoUtil;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Guia> guias =
                ArchivoUtil.cargarGuias("guias.csv");

        System.out.println("===== GUIAS =====");

        GuiaService.mostrarGuias(guias);

        System.out.println();

        System.out.println("===== BUSQUEDA =====");

        GuiaService.buscarPorNombre(
                guias,
                "Juan Perez");

        System.out.println();

        System.out.println("===== SERVICIOS TURISTICOS =====");

        GestorServicios gestor = new GestorServicios();
        gestor.mostrarServicios();
    }
}