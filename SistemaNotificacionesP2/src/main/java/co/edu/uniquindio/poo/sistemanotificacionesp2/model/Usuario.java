package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public abstract class Usuario {
    private String nombre, email, telefono, id;
    protected boolean activo;

    public Usuario(String nombre, String email, String telefono, String id) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.id = id;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public final String formatMessage(String mensaje) {
        return getHeader() + "\n" + personalizeMessage(mensaje) + "\n" + getFooter(mensaje);
    }

    protected abstract String getHeader();

    protected abstract String personalizeMessage(String message);

    protected abstract String getFooter(String mensaje);

}






