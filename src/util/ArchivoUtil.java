package util;

import model.*;
import java.io.*;
import java.util.ArrayList;

public class ArchivoUtil {

    public static ArrayList<Guia> cargarGuias(String archivo) {

        ArrayList<Guia> lista = new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(archivo));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                Persona persona =
                        new Persona(
                                datos[0],
                                datos[1],
                                datos[2]);

                RutaTuristica ruta =
                        new RutaTuristica(
                                datos[3],
                                datos[4]);

                Guia guia =
                        new Guia(persona, ruta);

                lista.add(guia);
            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error leyendo archivo");
        }

        return lista;
    }
}