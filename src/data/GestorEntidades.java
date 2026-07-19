package data;

import java.util.ArrayList;
import java.util.List;

import model.ColaboradorExterno;
import model.Guia;
import model.Persona;
import model.Registrable;
import model.RutaTuristica;
import model.Vehiculo;

public class GestorEntidades {

    private List<Registrable> entidades;

    public GestorEntidades() {

        entidades = new ArrayList<>();

        Persona persona = new Persona(
                "Pedro Gonzalez",
                "11.111.111-1",
                "987654321");

        RutaTuristica ruta = new RutaTuristica(
                "Volcan Osorno",
                "Puerto Varas");

        entidades.add(new Guia(persona, ruta));

        entidades.add(new Vehiculo(
                "ABCD11",
                "Mercedes Sprinter"));

        entidades.add(new ColaboradorExterno(
                "Maria Soto",
                "Turismo Patagonia"));
    }

    public void agregarGuia(Guia guia) {
        entidades.add(guia);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        entidades.add(vehiculo);
    }

    public List<Registrable> getEntidades() {
        return entidades;
    }

    public String mostrarEntidades() {

        StringBuilder resultado = new StringBuilder();

        for (Registrable entidad : entidades) {

            resultado.append(entidad.mostrarResumen()).append("\n");

            if (entidad instanceof Guia) {

                resultado.append("Tipo: Guia Turistico");

            } else if (entidad instanceof Vehiculo) {

                resultado.append("Tipo: Vehiculo");

            } else if (entidad instanceof ColaboradorExterno) {

                resultado.append("Tipo: Colaborador Externo");

            }

            resultado.append("\n\n");

        }

        return resultado.toString();

    }

}