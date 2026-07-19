package util;

import model.Cliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ClienteUtil {

    public static ArrayList<Cliente> cargarClientes(String archivo) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {

            BufferedReader lector =
                    new BufferedReader(
                            new FileReader(archivo));


            String linea;


            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");


                Cliente cliente = new Cliente(
                        datos[0],
                        datos[1],
                        datos[2],
                        datos[3]
                );


                clientes.add(cliente);
            }


            lector.close();


        } catch (Exception e) {

            System.out.println(
                    "Error al cargar clientes: "
                            + e.getMessage());
        }


        return clientes;
    }
}