package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Implementación de la estrategia de notificación mediante SMS
 * Envía un mensaje SMS a un usuario específico
 */
public class SMS implements NotificacionStrategy{
    private String telefonoDestinatario, mensaje;

    /**
     * Constructor de la clase SMS
     * @param mensaje
     */
    public SMS(String mensaje){
        this.mensaje = mensaje;
    }

    /**
     * Envía el mensaje SMS al usuario indicado
     * @param mensaje
     * @param user
     */
    @Override
    public void enviar(String mensaje, Usuario user) {
        System.out.println("SMS enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + mensaje);
    }

}
