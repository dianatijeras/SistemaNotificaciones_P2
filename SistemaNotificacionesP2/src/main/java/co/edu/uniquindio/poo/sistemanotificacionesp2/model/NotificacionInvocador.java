package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase invocadora que gestiona y ejecuta una lista de comandos de notificación
 * Implementa el patrón Command, actuando como el receptor que almacena y dispara
 * la ejecución de comandos encapsulados como objetos NotificacionComando
 */
public class NotificacionInvocador {
    private List<NotificacionComando> queue = new ArrayList<>();

    /**
     * Agrega un comando de notificación a la cola de ejecución
     * @param notificacionComando
     */
    public  void addComando(NotificacionComando notificacionComando){
        queue.add(notificacionComando);
    }

    /**
     * Ejecuta todos los comandos almacenados en la cola, en el orden en que fueron agregados
     * Luego, limpia la cola para futuras operaciones.
     */
    public void executeComandos(){
        for(NotificacionComando notificacionComando : queue){
            notificacionComando.ejecutar();
        }
        queue.clear();
    }
}
