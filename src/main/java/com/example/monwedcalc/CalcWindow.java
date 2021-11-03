package com.example.monwedcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcWindow {

    private long firstNumber;

    @FXML
    private TextField numberField;

    @FXML
    public void numberButtonPressed(ActionEvent event){
        var pressedButton = (Button)event.getSource();
        var buttonText = pressedButton.getText();
        var currentNumberText = numberField.getText();
        numberField.setText(currentNumberText+buttonText);
    }

    @FXML
    public void clearButtonPressed(){
        numberField.clear();
    }

    @FXML
    public void equalPressed(){
        var secondNumberText = numberField.getText();
        var secondNumber = Long.parseLong(secondNumberText);
        var result = secondNumber+firstNumber;
        numberField.setText(""+result);
    }

    @FXML
    public void plusPressed(){
        var numberAsText = numberField.getText();
        firstNumber = Long.parseLong(numberAsText);
        numberField.setText("");

    }
}
