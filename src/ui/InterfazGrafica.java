package ui;

import data.GestorCliente;
import data.GestorEntidades;
import data.GestorReservas;
import model.Cliente;
import model.Guia;
import model.Persona;
import model.Reserva;
import model.RutaTuristica;
import model.Vehiculo;

import javax.swing.JOptionPane;

public class InterfazGrafica {

    private GestorEntidades gestor;
    private GestorCliente gestorCliente;
    private GestorReservas gestorReservas;

    public InterfazGrafica() {
        gestor = new GestorEntidades();
        gestorCliente = new GestorCliente();
        gestorReservas = new GestorReservas();
    }

    public void iniciar() {

        int opcion;

        do {

            String menu = """
                    ===== LLANQUIHUE TOUR =====

                    1. Agregar guia

                    2. Agregar vehiculo

                    3. Mostrar entidades

                    4. Agregar cliente

                    5. Mostrar clientes

                    6. Agregar reserva

                    7. Mostrar reservas

                    8. Salir
                    """;

            try {

                opcion = Integer.parseInt(
                        JOptionPane.showInputDialog(menu));

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Ingrese un numero valido.");

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

                    String nombreCliente =
                            JOptionPane.showInputDialog("Nombre cliente");

                    String rutCliente =
                            JOptionPane.showInputDialog("RUT cliente");

                    String telefonoCliente =
                            JOptionPane.showInputDialog("Telefono cliente");

                    String correo =
                            JOptionPane.showInputDialog("Correo cliente");


                    Cliente cliente = new Cliente(
                            nombreCliente,
                            rutCliente,
                            telefonoCliente,
                            correo);


                    gestorCliente.agregarCliente(cliente);


                    JOptionPane.showMessageDialog(
                            null,
                            "Cliente agregado correctamente");

                    break;



                case 5:

                    JOptionPane.showMessageDialog(
                            null,
                            gestorCliente.getClientes().toString());

                    break;



                case 6:

                    String rutBuscar =
                            JOptionPane.showInputDialog(
                                    "Ingrese RUT del cliente");


                    Cliente clienteReserva =
                            gestorCliente.buscarClientePorRut(rutBuscar);


                    if (clienteReserva == null) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Cliente no encontrado");

                        break;
                    }


                    String nombreRuta =
                            JOptionPane.showInputDialog(
                                    "Nombre de la ruta");


                    String tipoRuta =
                            JOptionPane.showInputDialog(
                                    "Tipo de ruta");


                    RutaTuristica rutaReserva =
                            new RutaTuristica(
                                    nombreRuta,
                                    tipoRuta);


                    String fecha =
                            JOptionPane.showInputDialog(
                                    "Fecha reserva");


                    int cantidad =
                            Integer.parseInt(
                                    JOptionPane.showInputDialog(
                                            "Cantidad de personas"));


                    Reserva reserva = new Reserva(
                            clienteReserva,
                            rutaReserva,
                            fecha,
                            cantidad);


                    gestorReservas.agregarReserva(reserva);


                    JOptionPane.showMessageDialog(
                            null,
                            "Reserva creada correctamente");

                    break;



                case 7:

                    JOptionPane.showMessageDialog(
                            null,
                            gestorReservas.getReservas().toString());

                    break;



                case 8:

                    JOptionPane.showMessageDialog(
                            null,
                            "Hasta luego");

                    break;



                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion invalida");

            }


        } while (opcion != 8);

    }

}