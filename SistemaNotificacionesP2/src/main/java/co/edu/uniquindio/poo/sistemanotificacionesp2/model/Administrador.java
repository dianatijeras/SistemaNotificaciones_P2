package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Representa a un usuaro con rol de Administrador dento del sistema de notificaciones
 * Hereda de la clase Usuario y define una personalizacion especifica pra los mensajes enviados
 */
public class Administrador extends Usuario{

    /**
     * Constructor de la clase Administrador
     * @param nombre
     * @param email
     * @param telefono
     * @param id
     */
    public Administrador(String nombre, String email, String telefono, String id) {
        super(nombre, email, telefono, id);
    }

    /**
     * Retorna el encabezado personalizado para los mensajes dirigidos a administradores
     * @return
     */
    @Override
    protected String getHeader(){
        return "Hola Administrador, " + getNombre() + ",\n";
    }

    /**
     * Retorna el cuerpo del mensaje sin modificaciones
     * @param mensaje
     * @return
     */
    @Override
    protected String  personalizeMessage(String mensaje){
        return mensaje;
    }

    /**
     * Retorna el pie de página para los mensajes dirigidos a administradores
     * @param mensaje
     * @return
     */
    @Override
    protected String getFooter (String mensaje){
        return "\n Gracias por usar la aplicacion";
    }
}
