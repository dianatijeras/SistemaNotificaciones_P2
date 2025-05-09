package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Push implements NotificacionStrategy{
    private String titulo, mensaje;

    @Override
    public void enviar(Usuario user, String message) {
        System.out.println("🔔 Push enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + message);
    }
}

