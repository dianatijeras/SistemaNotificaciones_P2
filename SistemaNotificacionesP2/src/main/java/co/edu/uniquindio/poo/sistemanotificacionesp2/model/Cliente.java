package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Representa a un usuario con rol de Cliente dentro del sistema de notificaciones
 * Hereda de la clase Usuario y define la personalización de mensajes dirigida a clientes
 */
public class Cliente extends Usuario {

    /**
     * Constructor de la clase Cliente
     * @param nombre
     * @param email
     * @param telefono
     * @param id
     */
    public Cliente(String nombre, String email, String telefono, String id) {
        super(nombre, email, telefono, id);
    }

    /**
     * Retorna el encabezado personalizado para los mensajes dirigidos a cliente
     * @return
     */
    @Override
    protected String getHeader() {
        return "Hola Cliente, " + getNombre() + ",\n";
    }

    /**
     * Personaliza el cuerpo del mensaje para el cliente.
     * @param message
     * @return
     */
    @Override
    protected String personalizeMessage(String message) {
        return message;
    }

    /**
     * Retorna el pie de página para los mensajes dirigidos a clientes
     * @param mensaje
     * @return
     */
    @Override
    protected String getFooter(String mensaje) {
        return  "\n Gracias por usar la aplicación.";
    }


}
