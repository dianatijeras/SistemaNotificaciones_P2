package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Cliente extends Usuario {

    public Cliente(String nombre, String email, String telefono, String id) {
        super(nombre, email, telefono, id);
    }

    @Override
    protected String getHeader() {
        return "Hola Cliente, " + getNombre() + ",\n";
    }

    @Override
    protected String personalizeMessage(String message) {
        return message;
    }

    @Override
    protected String getFooter(String mensaje) {
        return mensaje + "\n Gracias por usar la aplicación.";
    }


}
