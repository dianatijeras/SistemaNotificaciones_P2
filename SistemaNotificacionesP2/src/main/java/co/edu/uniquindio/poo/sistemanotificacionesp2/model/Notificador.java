package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

/**
 * Interfaz para objetos que actúan como observadores en el patrón Observer
 * Define el método para recibir notificaciones sobre eventos a los que están suscritos
 */
public interface Notificador {

    /**
     * Metodo que se invoca para notificar al observador sobre un evento ocurrido
     * @param evento
     */
    public void update(String evento);
}
