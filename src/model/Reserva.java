package model;

public class Reserva {

    private Cliente cliente;
    private RutaTuristica ruta;
    private String fecha;
    private int cantidadPersonas;

    public Reserva(Cliente cliente, RutaTuristica ruta, String fecha, int cantidadPersonas) {
        this.cliente = cliente;
        this.ruta = ruta;
        this.fecha = fecha;
        this.cantidadPersonas = cantidadPersonas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public RutaTuristica getRuta() {
        return ruta;
    }

    public void setRuta(RutaTuristica ruta) {
        this.ruta = ruta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente.getNombre() +
                ", ruta=" + ruta.getNombreRuta() +
                ", fecha='" + fecha + '\'' +
                ", cantidadPersonas=" + cantidadPersonas +
                '}';
    }
}