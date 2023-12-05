package es.ieslosmontecillos.di_t3a462_appusotextoboton;

import es.ieslosmontecillos.componentes_vignolothiago.CampoTextoBoton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppUsoBotonController
{
    @FXML
    private Label lblName;
    @FXML
    private Label lblSurname;
    @FXML
    private CampoTextoBoton nameField;
    @FXML
    private CampoTextoBoton surnameField;


    @FXML
    public void nameUpdate(ActionEvent actionEvent) {
        lblName.setText(nameField.getTextField());
    }

    @FXML
    public void surnameUpdate(ActionEvent actionEvent) {
        lblSurname.setText(surnameField.getTextField());
    }
}