package model;

public class Cliente extends Persona {

    private String correo;

    public Cliente(String nombre, String rut, String telefono, String correo) {
        super(nombre, rut, telefono);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNombre() +
                " | RUT: " + getRut() +
                " | Teléfono: " + getTelefono() +
                " | Correo: " + correo;
    }
}