package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Clase que representa a un usuario de tipo Invitado en el sistema de notificaciones
 *
 * Extiende la clase Usuario y personaliza la forma en que se genera un mensaje
 */
public class Invitado extends Usuario{

    /**
     * Constructor de la clase Invitado
     * @param nombre
     * @param email
     * @param telefono
     * @param id
     */
    public Invitado(String nombre, String email, String telefono, String id) {
        super(nombre, email, telefono, id);
    }

    /**
     * Devuelve el encabezado del mensaje personalizado para el usuario invitado
     * @return
     */
    @Override
    protected String getHeader() {
        return "Hola Invitado, " + getNombre() + ",\n";
    }

    /**
     * Devuelve el mensaje personalizado para el invitado
     * @param message
     * @return
     */
    @Override
    protected String personalizeMessage(String message) {
        return message;
    }

    /**
     * Devuelve el pie de mensaje para el usuario invitado
     * @param mensaje
     * @return
     */
    @Override
    protected String getFooter(String mensaje) {
        return "\n Gracias por usar la aplicación.";
    }



}
