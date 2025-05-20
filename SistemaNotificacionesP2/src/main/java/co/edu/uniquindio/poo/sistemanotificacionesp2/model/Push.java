package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Push implements NotificacionStrategy{
    private String titulo, mensaje;
    public Push(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public void enviar(String mensaje, Usuario user) {
        System.out.println("🔔 Push enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + mensaje);
    }
}

