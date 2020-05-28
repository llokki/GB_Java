package example2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public Button btnAdd;
    @FXML
    public VBox vbox;

    public void clickbtnAdd() {
        int x = (int)(Math.random()*100);
        Button button = new Button("button " + x);
        vbox.getChildren().add(button);

        button.setOnAction(event -> {
            System.out.println(x);

            Stage stage = (Stage) btnAdd.getScene().getWindow();
            stage.setTitle("Value: " + x);
        });
    }
}
