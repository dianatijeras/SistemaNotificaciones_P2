module co.edu.uniquindio.poo.sistemanotificacionesp2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens co.edu.uniquindio.poo.sistemanotificacionesp2.viewController to javafx.fxml;
    exports co.edu.uniquindio.poo.sistemanotificacionesp2;
}