package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class EnviarNotificacionComando implements NotificacionComando {

    private Notificacion notificacion;

    public EnviarNotificacionComando(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void ejecutar() {
        notificacion.enviar();
    }
}
