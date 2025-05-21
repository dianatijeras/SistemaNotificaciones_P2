package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Implementación de la estrategia de notificación mediante Push
 * Envía un mensaje tipo push a un usuario específico
 */
public class Push implements NotificacionStrategy{
    private String titulo, mensaje;

    /**
     * Constructor de la clase Push
     * @param mensaje
     */
    public Push(String mensaje){
        this.mensaje = mensaje;
    }

    /**
     * Envía el mensaje push al usuario indicado
     * @param mensaje
     * @param user
     */
    @Override
    public void enviar(String mensaje, Usuario user) {
        System.out.println("🔔 Push enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + mensaje);
    }
}

