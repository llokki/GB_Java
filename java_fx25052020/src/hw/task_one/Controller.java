package hw.task_one;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private Button enter;
    @FXML
    private TextField textField;



    public void btnMouseClickOnAction() {

        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        enter.setDefaultButton(true);
    }


}
