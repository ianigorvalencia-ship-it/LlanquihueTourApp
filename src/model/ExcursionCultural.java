package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Excursion Cultural -> " +
                "Nombre: " + nombre +
                ", Duracion: " + duracionHoras + " horas" +
                ", Lugar historico: " + lugarHistorico);
    }

    @Override
    public String toString() {
        return "Excursion Cultural -> " +
                super.toString() +
                ", Lugar historico: " + lugarHistorico;
    }
}