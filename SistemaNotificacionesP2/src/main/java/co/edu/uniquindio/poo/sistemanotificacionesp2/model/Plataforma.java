package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa una plataforma para gestionar usuarios y notificaciones
 * Permite registrar y eliminar usuarios, buscar usuarios por email,
 * y gestionar la notificación de eventos a observadores registrados.
 */
public class Plataforma {
    private String nombre;
    private List<Usuario> usuarios;
    private List<Notificador> notificaciones;

    /**
     * Constructor de la clase Plataforma
     * @param nombre
     * @param operations
     */
    public Plataforma(String nombre, String... operations) {
        this.nombre = nombre;
        this.usuarios = new LinkedList<>();
        this.notificaciones = new LinkedList<>();
    }

    /**
     * Registra un nuevo usuario en la plataforma si no existe un usuario con el mismo email
     * @param usuario
     */
    public void subscribe(Usuario usuario) {
        boolean estaUsuario = false;
        for(Usuario u: usuarios) {
            if (u.getEmail().equals(usuario.getEmail())){
                estaUsuario = true;
            }
        }
        if(!estaUsuario){
            usuarios.add(usuario);
        }else{
            System.err.println("Ya se encuentra registrado un usuario con este correo");
        }

    }

    /**
     * Elimina un usuario de la plataforma
     * @param usuario
     */
    public void unsubscribe(Usuario usuario) {
        usuarios.removeIf(u -> u instanceof Usuario && u.getEmail().equals(u.getEmail()));
        System.out.println("Usuario eliminado");
    }


    /**
     * Busca un usuario registrado en la plataforma por su email
     * @param email
     * @return
     */
    public Usuario buscarUsuario(String email){
        Usuario usu = null;
        try{
             for(Usuario usuario: usuarios){
                 if(email.equals(usuario.getEmail())){
                     usu = usuario;
                     System.out.println("Usuario encontrado");
                 }
             }
         } catch (NullPointerException e) {
             System.err.println("Usuario no encontrado");
         }
        return usu;
    }

    /**
     * Notifica a todos los observadores registrados sobre un evento ocurrido
     * @param evento
     */
    public void notificarObservadores(String evento){
        for (Notificador n : notificaciones){
            n.update(evento);
        }
    }


    /**
     * Metodo que obtiene el nombre de la plataforma
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de la plataforma
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}