package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Interfaz que define el comando para ejecutar acciones relacionadas con notificaciones
 * Implementa el patrón Command, que encapsula una acción como un objeto
 */
public interface NotificacionComando {

    /**
     * Ejecuta la acción asociada al comando
     */
    public void ejecutar();
}
