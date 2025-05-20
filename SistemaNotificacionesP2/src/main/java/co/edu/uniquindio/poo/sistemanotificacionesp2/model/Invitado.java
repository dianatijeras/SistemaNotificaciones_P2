package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Invitado extends Usuario{

    public Invitado(String nombre, String email, String telefono, String id) {
        super(nombre, email, telefono, id);
    }

    @Override
    protected String getHeader() {
        return "Hola Invitado, " + getNombre() + ",\n";
    }

    @Override
    protected String personalizeMessage(String message) {
        return message;
    }

    @Override
    protected String getFooter(String mensaje) {
        return "\n Gracias por usar la aplicación.";
    }



}
