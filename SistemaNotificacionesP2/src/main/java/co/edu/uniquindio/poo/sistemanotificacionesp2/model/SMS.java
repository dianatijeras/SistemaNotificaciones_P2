package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class SMS implements NotificacionStrategy{
    private String telefonoDestinatario, mensaje;

    @Override
    public void enviar(Usuario user, String message) {
        System.out.println("SMS enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + message);
    }

}
