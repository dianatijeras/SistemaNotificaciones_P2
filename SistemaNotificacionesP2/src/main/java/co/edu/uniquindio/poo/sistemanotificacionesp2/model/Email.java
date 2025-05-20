package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Email implements NotificacionStrategy{

    private String mensaje;

    public Email(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviar(String mensaje, Usuario user) {
        System.out.println("Email enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + mensaje);
    }
}

