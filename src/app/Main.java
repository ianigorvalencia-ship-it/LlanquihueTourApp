package app;

import data.GestorServicios;
import model.Cliente;
import model.Guia;
import service.GuiaService;
import ui.InterfazGrafica;
import util.ArchivoUtil;
import util.ClienteUtil;

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

        System.out.println();

        System.out.println("===== CLIENTES =====");

        ArrayList<Cliente> clientes =
                ClienteUtil.cargarClientes("./clientes.txt");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println();

        System.out.println("===== INTERFAZ GRAFICA =====");

        InterfazGrafica interfaz =
                new InterfazGrafica();

        interfaz.iniciar();
    }
}