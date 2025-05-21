package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Clase abstracta que representa un usuario en el sistema.
 * Implementa la interfaz Notificador para recibir notificaciones
 */
public abstract class Usuario implements Notificador{

    private String nombre, email, telefono, id;
    protected boolean activo;

    /**
     * Constructor de la clase Usuario
     * @param nombre
     * @param email
     * @param telefono
     * @param id
     */
    public Usuario(String nombre, String email, String telefono, String id) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.id = id;
        this.activo = true;
    }

    /**
     * Metodo que obtiene el nombre de un usuario
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de un usuario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el email de un usuario
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo que establece el email de un usuario
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo que obtiene el telefono de un usuario
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo que establece el telefono de un usuario
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo que obtiene el ID de un usuario
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Metodo que establece el ID de un usuario
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Metodo que obtiene el estado de un usuario
     * @return
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Metodo que establece el estado de un usuario
     * @param activo
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Formatea el mensaje combinando un encabezado, el mensaje personalizado y un pie de página
     * @param mensaje
     * @return
     */
    public final String formatMessage(String mensaje) {
        StringBuilder sb = new StringBuilder();
        sb.append(getHeader());
        sb.append(personalizeMessage(mensaje));
        sb.append(getFooter(mensaje));
        return sb.toString();
    }


    /**
     * Obtiene el encabezado del mensaje
     * Método abstracto que debe implementar cada subclase
     * @return
     */
    protected abstract String getHeader();

    /**
     * Personaliza el contenido del mensaje
     * Método abstracto que debe implementar cada subclase
     * @param message
     * @return
     */
    protected abstract String personalizeMessage(String message);

    /**
     * Obtiene el pie de página del mensaje
     * Método abstracto que debe implementar cada subclase
     * @param mensaje
     * @return
     */
    protected abstract String getFooter(String mensaje);


    /**
     * Método que recibe notificaciones de eventos
     * Implementación de la interfaz Notificador
     * @param evento
     */
    @Override
    public void update(String evento){
        System.out.println(nombre + "recibe notificacion: " + evento);

    }
}
