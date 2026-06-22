package model;

public class RutaTuristica {

    private String nombreRuta;
    private String tipo;

    public RutaTuristica(String nombreRuta, String tipo) {
        this.nombreRuta = nombreRuta;
        this.tipo = tipo;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombreRuta + " (" + tipo + ")";
    }
}