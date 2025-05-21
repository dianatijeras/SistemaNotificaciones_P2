package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Filtro que verifica si el mensaje de una notificación está vacío o es nulo
 * Forma parte de una cadena de responsabilidad que valida notificaciones antes de ser enviadas
 */
public class FiltrarMensajeVacio extends FiltrarNotificacion{

    /**
     * Verifica si el mensaje de la notificación es nulo o vacío
     * Si lo es, imprime un mensaje en consola y retorna {false} para indicar que la notificación no debe continuar
     * @param notificacion
     * @return
     */
    public boolean manejo(Notificacion notificacion) {
        if(notificacion.getMensaje()==null|| notificacion.getMensaje().isEmpty()){
            System.out.println("Mensaje vacio");
            return false;
        }
        return true;
    }
}
