package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class Notificacion {

    private Usuario usuario;
    private String mensaje;
    private NotificacionStrategy strategy;
    private FiltrarMensajeVacio mensajeVacio;
    private FiltrarUsuarioBloqueado usuarioBloqueado;

    public Notificacion(Usuario usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public NotificacionStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(NotificacionStrategy strategy) {
        this.strategy = strategy;
    }



    public void enviar(){
        String formato = usuario.formatMessage(mensaje);
        strategy.enviar(usuario);
    }

}
