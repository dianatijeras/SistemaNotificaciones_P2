package co.edu.uniquindio.poo.sistemanotificacionesp2.controller;

import co.edu.uniquindio.poo.sistemanotificacionesp2.model.*;

/**
 * Controlador para manejar las acciones del menu de inicio del sistema de notificaciones
 */
public class MenuInicioController {

    private Plataforma plataforma;

    /**
     * Constructor que inicializa el controlador con la plataforma
     * @param plataforma
     */
    public MenuInicioController(Plataforma plataforma){
        this.plataforma = plataforma;
    }


    /**
     * Envia un mensaje a un usuario a traves de un canal especifico
     * @param mensaje
     * @param canal
     * @param email
     */
    public void enviarMensaje( String mensaje, String canal, String email) {
        if (mensaje == null || canal == null || email == null) {
            throw new IllegalArgumentException("mensaje, canal o email no pueden ser nulos.");
        }
        Usuario u = plataforma.buscarUsuario(email);
        Notificacion notificacion = new Notificacion(u, mensaje);

        switch (canal) {
            case "Email":
                notificacion.setStrategy(new Email(mensaje));
                break;
            case "SMS":
                notificacion.setStrategy(new SMS(mensaje));
                break;
            case "Push":
                notificacion.setStrategy(new Push(mensaje));
                break;
            default:
                throw new IllegalArgumentException("Canal de notificación no válido: " + canal);
        }

        notificacion.enviar();
    }
}
