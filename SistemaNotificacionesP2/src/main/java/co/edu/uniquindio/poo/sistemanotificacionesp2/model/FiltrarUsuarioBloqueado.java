package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

public class FiltrarUsuarioBloqueado extends FiltrarNotificacion{

    public boolean manejo(Notificacion notificacion) {
        if (!notificacion.getUsuario().isActivo()){
            System.out.println("Usuario No Activo");
            return false;
        }
        return super.manejo(notificacion);
    }

}
