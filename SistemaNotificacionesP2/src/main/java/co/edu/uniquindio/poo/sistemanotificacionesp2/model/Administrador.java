public class Administrador extends Usuario{

    public Administrador(String nombre, String email, String telefono, String id) {
        super(nombre, email, telefono, id);
    }

    protected String getHeader(){
        return "Administrador, ";
    }

    protected String  personalizeMessage(String mensaje){
        return mensaje;
    }

    protected String getFooter (){
        return "Gracias por usar la aplicacion";
    }
}
