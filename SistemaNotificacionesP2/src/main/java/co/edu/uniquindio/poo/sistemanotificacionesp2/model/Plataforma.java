package co.edu.uniquindio.poo.sistemanotificacionesp2.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase Plataforma para gestionar usuarios y eventos
 */
public class Plataforma {
    private String nombre;
    private List<Usuario> usuarios;

    public Plataforma(String nombre, String... operations) {
        this.nombre = nombre;
        this.usuarios = new LinkedList<>();
    }

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

    public void unsubscribe(Usuario usuario) {
        usuarios.removeIf(u -> u instanceof Usuario && u.getEmail().equals(u.getEmail()));
        System.out.println("Usuario eliminado");
    }


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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}