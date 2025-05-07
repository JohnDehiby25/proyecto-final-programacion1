module co.edu.uniquindio.proyectoprogramacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.proyectoprogramacion to javafx.fxml;
    exports co.edu.uniquindio.proyectoprogramacion;
}