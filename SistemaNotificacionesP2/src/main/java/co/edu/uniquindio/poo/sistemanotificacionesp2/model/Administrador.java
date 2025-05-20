package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Administrador extends Usuario{

    public Administrador(String nombre, String email, String telefono, String id) {
        super(nombre, email, telefono, id);
    }

    @Override
    protected String getHeader(){
        return "Hola Administrador, " + getNombre() + ",\n";
    }

    @Override
    protected String  personalizeMessage(String mensaje){
        return mensaje;
    }

    @Override
    protected String getFooter (String mensaje){
        return mensaje + "\n Gracias por usar la aplicacion";
    }
}
