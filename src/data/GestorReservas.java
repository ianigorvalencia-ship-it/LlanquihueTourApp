package data;

import model.Reserva;

import java.util.ArrayList;

public class GestorReservas {

    private ArrayList<Reserva> reservas;

    public GestorReservas() {
        reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}