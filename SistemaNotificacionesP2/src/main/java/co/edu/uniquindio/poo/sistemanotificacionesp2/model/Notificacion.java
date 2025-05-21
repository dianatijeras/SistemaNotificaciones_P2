package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Clase que representa una notificación dentro del sistema.
 */
public class Notificacion {

    private Usuario usuario;
    private String mensaje;
    private NotificacionStrategy strategy;
    private FiltrarMensajeVacio mensajeVacio;
    private FiltrarUsuarioBloqueado usuarioBloqueado;

    /**
     * Constructor de la clase Notificacion
     * @param usuario
     * @param mensaje
     */
    public Notificacion(Usuario usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    /**
     * Metodo que obtiene un usuario destinatario de la notificacion
     * @return
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Metodo que establece un usuario destinatario de la notificacion
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Metodo que obtiene un mensaje de la notificacion
     * @return
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Metodo que establece un mensaje de la notificacion
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Metodo que obtiene la estrategia de envio asignado (SMS, EMAIL, PUSH)
     * @return
     */
    public NotificacionStrategy getStrategy() {
        return strategy;
    }

    /**
     * Metodo que establece la estrategia de envio de la notificacion
     * @param strategy
     */
    public void setStrategy(NotificacionStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Envía la notificación utilizando la estrategia asignada.
     */
    public void enviar(){
        if(strategy == null){
            throw new IllegalStateException("Estrategia no asignada");
        }
        String mensajeFormateado = usuario.formatMessage(mensaje);
        strategy.enviar(mensajeFormateado, usuario);
    }

}
