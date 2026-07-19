package model;

public class Guia implements Registrable {

    private Persona persona;
    private RutaTuristica ruta;

    public Guia(Persona persona, RutaTuristica ruta) {
        this.persona = persona;
        this.ruta = ruta;
    }

    public Persona getPersona() {
        return persona;
    }

    public RutaTuristica getRuta() {
        return ruta;
    }

    @Override
    public String mostrarResumen() {
        return "Guía: " + persona.getNombre();
    }

    @Override
    public String toString() {
        return persona + " | " + ruta;
    }
}