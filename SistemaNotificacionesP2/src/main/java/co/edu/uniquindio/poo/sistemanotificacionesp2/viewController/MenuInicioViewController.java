package co.edu.uniquindio.poo.sistemanotificacionesp2.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.sistemanotificacionesp2.model.*;
import co.edu.uniquindio.poo.sistemanotificacionesp2.controller.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Controlador de la vista principal del sistema de notificaciones
 */
public class MenuInicioViewController {
    private Plataforma plataforma = new Plataforma("Sistema Notificaciones");
    private MenuInicioController menuInicioController = new MenuInicioController(plataforma);

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button_Enviar;

    @FXML
    private ComboBox<String> ComboBox_CanalNotificacion;

    @FXML
    private TextArea TextArea_Mensaje;

    @FXML
    private TextField TextField_CorreoDestino;

    private Notificacion notificacion;


    /**
     * Evento asociado al botón enviar
     * Valida los campos y llama al controlador para enviar el mensaje
     * @param event
     */
    @FXML
    void onClick_EnviarMensaje(ActionEvent event) {
        String canal = ComboBox_CanalNotificacion.getValue();
        String correoDestino = TextField_CorreoDestino.getText();
        String mensaje = TextArea_Mensaje.getText();
        if(canal == null){
            mostrarAlerta("Error", "El canal no puede estar vacio");
        } else if (correoDestino == null) {
            mostrarAlerta("Error", "El correo no puede estar vacio");
        }else if (mensaje == null) {
            mostrarAlerta("Error", "El mensaje no puede estar vacio");
        }
        else{
            menuInicioController.enviarMensaje(mensaje,canal,correoDestino);
            mostrarAlerta("Éxito", "Notificación enviada correctamente.");
            limpiarCampos();
        }

    }

    /**
     * Muestra una alerta informativa con título y mensaje
     * @param titulo
     * @param mensaje
     */
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    /**
     * Limpia los campos del formulario
     */
    private void limpiarCampos() {
        ComboBox_CanalNotificacion.setValue(null);
        TextField_CorreoDestino.clear();
        TextArea_Mensaje.clear();
    }

    /**
     * Inicializa usuarios de ejemplo y los registra en la plataforma
     */
    private void inicializarUsuarios(){

        Usuario administrador = new Administrador("Maria", "mariaG.1@gmail.com", "31467894", "42628237464");

        Usuario invitado = new Invitado("Juan", "juanR@gmail.com", "6373836383", "73839393");
        Usuario invitado0 = new Invitado("Jose", "JoseR@hotmail.com", "321233443", "109232342");
        Usuario invitado1 = new Invitado("Camila", "Cami1221@gmail.com", "1231423", "1231233");

        Usuario clienteAna = new Cliente("Ana", "anamaria@gmail.com", "82728292", "6728282")      ;
        Usuario clienteLaura = new Cliente("Laura", "LauraO@gmail.com", "72282922", "728229292");
        Usuario clienteJohn = new Cliente("John", "JohnC@gmail.com", "782928272", "72829292");

        plataforma.subscribe(administrador);

        plataforma.subscribe(invitado);
        plataforma.subscribe(invitado0);
        plataforma.subscribe(invitado1);

        plataforma.subscribe(clienteAna);
        plataforma.subscribe(clienteLaura);
        plataforma.subscribe(clienteJohn);

    }

    /**
     * Método que se ejecuta automáticamente al cargar la vista.
     * Verifica la correcta inyección de los componentes FXML,
     * inicializa usuarios y carga las opciones del ComboBox
     */
    @FXML
    void initialize() {
        assert Button_Enviar != null : "fx:id=\"Button_Enviar\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert ComboBox_CanalNotificacion != null : "fx:id=\"ComboBox_CanalNotificacion\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert TextArea_Mensaje != null : "fx:id=\"TextArea_Mensaje\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert TextField_CorreoDestino != null : "fx:id=\"TextField_CorreoDestino\" was not injected: check your FXML file 'menuInicio.fxml'.";
        inicializarUsuarios();
        ComboBox_CanalNotificacion.getItems().addAll("SMS", "Push", "Email");
    }
}
