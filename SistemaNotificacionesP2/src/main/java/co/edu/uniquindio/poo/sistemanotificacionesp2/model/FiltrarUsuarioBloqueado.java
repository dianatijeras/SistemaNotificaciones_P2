package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Filtro que verifica si el usuario asociado a una notificación está activo
 *
 * Esta clase forma parte de una cadena de responsabilidad y extiende la clase base FiltrarNotificacion
 * Si el usuario está inactivo (bloqueado), la notificación no será enviada.
 */
public class FiltrarUsuarioBloqueado extends FiltrarNotificacion{

    /**
     * Procesa la notificación verificando si el usuario está activo
     * Si el usuario no está activo, imprime un mensaje en consola y detiene el proceso.
     * @param notificacion
     * @return
     */
    public boolean manejo(Notificacion notificacion) {
        if (!notificacion.getUsuario().isActivo()){
            System.out.println("Usuario No Activo");
            return false;
        }
        return super.manejo(notificacion);
    }

}
