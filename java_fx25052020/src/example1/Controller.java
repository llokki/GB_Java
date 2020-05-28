package example1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {


    @FXML
    public Slider slider;


    @FXML
    public Label label;

    public void menuExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void sliderOnMouseReleased(MouseEvent mouseEvent) {
        label.setText("Value: " + (int)slider.getValue());
        Platform.runLater(() -> {
            Stage stage = (Stage) slider.getScene().getWindow();
            stage.setTitle("Value: " + slider.getValue());
        });
    }
}
