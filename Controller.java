package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

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

    @FXML
    public void doExit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    public void maleCheck(ActionEvent event){
        if(Human.isFocused())
            Bitch.setSelected(false);
        if(Bitch.isFocused())
            Human.setSelected(false);

    }

    @FXML
    public void checkIn(ActionEvent event){

    }
}
