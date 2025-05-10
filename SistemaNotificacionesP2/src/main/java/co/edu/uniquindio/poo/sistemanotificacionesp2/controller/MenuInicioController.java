package co.edu.uniquindio.poo.sistemanotificacionesp2.controller;

import co.edu.uniquindio.poo.sistemanotificacionesp2.model.*;

public class MenuInicioController {

    private Plataforma plataforma;

    public MenuInicioController(Plataforma plataforma){
        this.plataforma = plataforma;
    }


    public void enviarMensaje( String mensaje, String canal, String email) {
        if (mensaje == null || canal == null || email == null) {
            throw new IllegalArgumentException("mensaje, canal o email no pueden ser nulos.");
        }
        Usuario u = plataforma.buscarUsuario(email);
        Notificacion notificacion = new Notificacion(u, email);

        switch (canal) {
            case "Email":
                notificacion.setStrategy(new Email());
                break;
            case "SMS":
                notificacion.setStrategy(new SMS());
                break;
            case "Push":
                notificacion.setStrategy(new Push());
                break;
            default:
                throw new IllegalArgumentException("Canal de notificación no válido: " + canal);
        }

        notificacion.enviar();
    }
}
