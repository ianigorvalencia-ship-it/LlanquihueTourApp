package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Paseo Lacustre -> " +
                "Nombre: " + nombre +
                ", Duracion: " + duracionHoras + " horas" +
                ", Embarcacion: " + tipoEmbarcacion);
    }

    @Override
    public String toString() {
        return "Paseo Lacustre -> " +
                super.toString() +
                ", Embarcacion: " + tipoEmbarcacion;
    }
}