package com.example.spinnertest;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private Spinner<String> mySpinner = new Spinner<>();

    ObservableList<String> months = FXCollections.observableArrayList("January",
            "February", "March", "April", "May", "June", "July", "August","September","October","November","December");

    SpinnerValueFactory<String> svf = new SpinnerValueFactory.ListSpinnerValueFactory<>(months);


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        mySpinner.setValueFactory(svf);
    }


    @FXML
    private Text txtFld;

    @FXML
    void getTheChoice() {

        String monthPicked= mySpinner.getValue();
        txtFld.setText(monthPicked);

    }


}
