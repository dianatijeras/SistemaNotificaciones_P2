package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Cliente extends Usuario{

    public Cliente(String nombre, String email, String telefono, String id, boolean blocked) {
        super(nombre, email, telefono, id);
    }

    protected String getHeader() {
        return "Hola Cliente, ";
    }

    protected String personalizeMessage(String message) {
        return message;
    }

    protected String getFooter() {
        return "Gracias por usar la aplicación.";
    }


}
