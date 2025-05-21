package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Clase que implementa el comando para enviar una notificación.
 * Forma parte del patrón de diseño Command, encapsulando la acción de enviar una notificación.
 */
public class EnviarNotificacionComando implements NotificacionComando {

    private Notificacion notificacion;

    /**
     * Constructor de la clase EnviarNotificacionComando
     * @param notificacion
     */
    public EnviarNotificacionComando(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    /**
     * Ejecuta la acción encapsulada en el comando, que es enviar la notificación
     */
    public void ejecutar() {
        notificacion.enviar();
    }
}
