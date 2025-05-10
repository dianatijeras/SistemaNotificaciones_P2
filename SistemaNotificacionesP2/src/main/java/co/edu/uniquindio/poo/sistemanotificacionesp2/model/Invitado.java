package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Invitado extends Usuario{

    public Invitado(String nombre, String email, String telefono, String id) {
        super(nombre, email, telefono, id);
    }


    protected String getHeader() {
        return "Hola Invitado, ";
    }

    protected String personalizeMessage(String message) {
        return message;
    }

    protected String getFooter() {
        return "Gracias por usar la aplicación.";
    }



}
