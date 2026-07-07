package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Ruta Gastronomica -> " +
                "Nombre: " + nombre +
                ", Duracion: " + duracionHoras + " horas" +
                ", Paradas: " + numeroDeParadas);
    }

    @Override
    public String toString() {
        return "Ruta Gastronomica -> " +
                super.toString() +
                ", Paradas: " + numeroDeParadas;
    }
}