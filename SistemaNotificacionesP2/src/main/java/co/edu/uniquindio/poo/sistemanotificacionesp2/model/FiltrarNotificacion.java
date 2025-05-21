package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Clase base para implementar filtros dentro de una cadena de responsabilidad
 * para el procesamiento de notificaciones
 *
 * Utiliza el patrón de diseño Chain of Responsibility, permitiendo encadenar
 * múltiples validaciones sobre una notificación antes de que esta sea enviada
 */
public class FiltrarNotificacion {

    protected FiltrarNotificacion next; //Siguiente filtro en la cadena

    /**
     * Establece el siguiente filtro en la cadena de responsabilidad
     * @param next
     */
    public void  setNext (FiltrarNotificacion next){
        this.next = next;
    }

    /**
     * Método de manejo que procesa la notificación y decide si debe pasar al siguiente filtro.
     * @param notificacion
     * @return
     */
    public boolean manejo (Notificacion notificacion){
        if (next != null) return next.manejo(notificacion);
        return true;
    }
}
