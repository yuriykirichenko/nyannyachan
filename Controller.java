package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.awt.event.ActionListener;

public class Controller{
    @FXML
    private TextField FirstName;
    @FXML
    private TextField LastName;
    @FXML
    private TextField EMail;
    @FXML
    private TextField Nickname;
    @FXML
    private TextField Password;
    @FXML
    private CheckBox Human;
    @FXML
    private CheckBox Bitch;
    @FXML
    private CheckBox AgreeRules;
    @FXML
    private Button CheckIn;
    @FXML
    private Button Exit;

    @FXML public void doExit(ActionEvent event) {
        Platform.exit(); // коректне завершення застосунку JavaFX
    }

    @FXML
    private void selected(ActionEvent event){
        if(FirstName.getText() == "First Name:"){
            FirstName.setText(" ");
        }
    }
}
