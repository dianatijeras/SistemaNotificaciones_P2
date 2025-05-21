package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Interfaz que define la estrategia para enviar notificaciones.
 * Implementa el patrón Strategy, permitiendo cambiar el método de envío
 * (Email, SMS, Push, etc.) sin modificar la clase que usa esta estrategia.
 */
public interface NotificacionStrategy {

     /**
      * Envía un mensaje a un usuario específico según la estrategia implementada
      * @param mensaje
      * @param usuario
      */
     void enviar(String mensaje,Usuario usuario);
}
