package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Email implements NotificacionStrategy{
    private String asunto, mensaje;
    @Override
    public void enviar(Usuario user, String message) {
        System.out.println("Email enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + message);
    }

}
