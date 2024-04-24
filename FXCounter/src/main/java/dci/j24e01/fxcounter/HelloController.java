package dci.j24e01.fxcounter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

public class HelloController {

    private int counter = 0;

    @FXML
    private Label counterLabel;

    @FXML
    public void initialize(){
        updateUI();
    }

    @FXML
    protected void clickedUpButton() {
        counter += 1;
        updateUI();
        }
    @FXML
    protected void clickedDownButton() {
        counter -= 1;
        updateUI();
    }

    private void updateUI(){
        counterLabel.setText("Counter: "+ counter);

        if(counter > 10){
            counterLabel.setTextFill(Paint.valueOf("red"));
        }else{
            counterLabel.setTextFill(Paint.valueOf("black"));
        }
    }
}