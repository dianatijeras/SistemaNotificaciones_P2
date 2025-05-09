import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Clase Plataforma para gestionar usuarios y eventos
 */
public class Plataforma {
    private String nombre;
    private Map<String, List<Usuario>> usuarios = new HashMap<>();

    public Plataforma(String nombre, String... operations) {
        this.nombre = nombre;
        for (String operation : operations) {
            this.usuarios.put(operation, new LinkedList<>());
        }
    }

    public void subscribe(String eventType, Usuario usuario) {
        List<Usuario> users = usuarios.get(eventType);
        if (users != null) {
            users.add(usuario);
        }
    }

    public void unsubscribe(String eventType, Usuario usuario) {
        List<Usuario> users = usuarios.get(eventType);
        if (users != null) {
            users.remove(usuario);
        }
    }

    public void notify(String eventType, Notificacion notificacion) {
        List<Usuario> users = usuarios.get(eventType);
        if (users != null) {
            for (Usuario usuario : users) {
                usuario.update(eventType, notificacion);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, List<Usuario>> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Map<String, List<Usuario>> usuarios) {
        this.usuarios = usuarios;
    }
}