package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica(
                        "Ruta del Salmon",
                        5,
                        4);

        RutaGastronomica ruta2 =
                new RutaGastronomica(
                        "Sabores del Sur",
                        3,
                        6);

        PaseoLacustre paseo1 =
                new PaseoLacustre(
                        "Lago Llanquihue",
                        2,
                        "Catamaran");

        PaseoLacustre paseo2 =
                new PaseoLacustre(
                        "Todos los Santos",
                        4,
                        "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural(
                        "Museo Colonial",
                        2,
                        "Museo Colonial Aleman");

        ExcursionCultural excursion2 =
                new ExcursionCultural(
                        "Fuerte Historico",
                        3,
                        "Fuerte Reina Luisa");

        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println();

        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println();

        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}