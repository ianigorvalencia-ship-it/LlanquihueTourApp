package data;

import java.util.ArrayList;
import java.util.List;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                "Ruta del Salmon",
                5,
                4));

        servicios.add(new RutaGastronomica(
                "Sabores del Sur",
                3,
                6));

        servicios.add(new PaseoLacustre(
                "Lago Llanquihue",
                2,
                "Catamaran"));

        servicios.add(new PaseoLacustre(
                "Todos los Santos",
                4,
                "Lancha"));

        servicios.add(new ExcursionCultural(
                "Museo Colonial",
                2,
                "Museo Colonial Aleman"));

        servicios.add(new ExcursionCultural(
                "Fuerte Historico",
                3,
                "Fuerte Reina Luisa"));
    }

    public void mostrarServicios() {

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
            System.out.println();
        }

    }

}