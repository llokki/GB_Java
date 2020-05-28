package hw.task_two;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class Controller  {

    @FXML
    private Text output;
    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";
    private Model model = new Model();
    private boolean start = true;


    @FXML
    private void btnNum(ActionEvent event) {
        if(start) {
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText()+value);

    }

    public void btnOperation(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if(!"=".equals(value)){
            if(!operator.isEmpty()) return;
            operator = value;
            num1 = Double.parseDouble(output.getText());
            output.setText("");
        }
        else {
            if (operator.isEmpty()) return;
            output.setText(String.valueOf(model.calculation(num1,Double.parseDouble(output.getText()),operator)));
            operator = "";
            start = true;
        }

    }
}
