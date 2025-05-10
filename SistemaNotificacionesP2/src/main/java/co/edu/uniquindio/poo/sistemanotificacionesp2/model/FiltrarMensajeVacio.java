package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class FiltrarMensajeVacio extends FiltrarNotificacion{
    public boolean manejar(Notificacion notificacion) {
        if(notificacion.getMensaje()==null|| notificacion.getMensaje().isEmpty()){
            System.out.println("Mensaje vacio");
            return false;
        }
        return true;
    }
}
