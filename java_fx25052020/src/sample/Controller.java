package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button button1;
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;

    public void btn1Click() {
        textArea.appendText(textField.getText());
    }
}
