package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

import java.util.List;
import java.util.ArrayList;

public class NotificacionInvocador {
    private List<NotificacionComando> queue = new ArrayList<>();

    public  void addComando(NotificacionComando notificacionComando){
        queue.add(notificacionComando);
    }

    public void executeComandos(){
        for(NotificacionComando notificacionComando : queue){
            notificacionComando.ejecutar();
        }
        queue.clear();
    }
}
