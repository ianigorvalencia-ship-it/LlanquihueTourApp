package ui;

import data.GestorEntidades;
import model.Guia;
import model.Persona;
import model.RutaTuristica;
import model.Vehiculo;

import javax.swing.JOptionPane;

public class InterfazGrafica {

    private GestorEntidades gestor;

    public InterfazGrafica() {
        gestor = new GestorEntidades();
    }

    public void iniciar() {

        int opcion;

        do {

            String menu = """
                    ===== LLANQUIHUE TOUR =====

                    1. Agregar guia

                    2. Agregar vehiculo

                    3. Mostrar entidades

                    4. Salir
                    """;

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Ingrese un numero valido."
                );

                opcion = 0;
            }

            switch (opcion) {

                case 1:

                    String nombre = JOptionPane.showInputDialog("Nombre del guia");
                    String rut = JOptionPane.showInputDialog("RUT");
                    String telefono = JOptionPane.showInputDialog("Telefono");
                    String ruta = JOptionPane.showInputDialog("Nombre de la ruta");
                    String tipo = JOptionPane.showInputDialog("Tipo de ruta");

                    Persona persona = new Persona(
                            nombre,
                            rut,
                            telefono);

                    RutaTuristica rutaTuristica = new RutaTuristica(
                            ruta,
                            tipo);

                    Guia guia = new Guia(
                            persona,
                            rutaTuristica);

                    gestor.agregarGuia(guia);

                    JOptionPane.showMessageDialog(
                            null,
                            "Guia agregado correctamente");

                    break;


                case 2:

                    String patente = JOptionPane.showInputDialog("Patente");
                    String modelo = JOptionPane.showInputDialog("Modelo");

                    Vehiculo vehiculo = new Vehiculo(
                            patente,
                            modelo);

                    gestor.agregarVehiculo(vehiculo);

                    JOptionPane.showMessageDialog(
                            null,
                            "Vehiculo agregado correctamente");

                    break;


                case 3:

                    JOptionPane.showMessageDialog(
                            null,
                            gestor.mostrarEntidades());

                    break;


                case 4:

                    JOptionPane.showMessageDialog(
                            null,
                            "Hasta luego");

                    break;


                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion invalida");

            }

        } while (opcion != 4);

    }

}