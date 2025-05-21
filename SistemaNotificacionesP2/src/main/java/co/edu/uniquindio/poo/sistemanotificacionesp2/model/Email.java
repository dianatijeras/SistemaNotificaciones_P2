package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Estrategia concreta de notificación que representa el envío de mensajes por correo electrónico
 * Implementa la interfaz NotificacionStrategy
 */
public class Email implements NotificacionStrategy{

    private String mensaje;

    /**
     * Constructor de la clase Email
     * @param mensaje
     */
    public Email(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Envía el mensaje al usuario por medio de correo electrónico.
     * @param mensaje
     * @param user
     */
    @Override
    public void enviar(String mensaje, Usuario user) {
        System.out.println("Email enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + mensaje);
    }
}

