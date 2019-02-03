package pl.tomek.javaquiz.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ContentPaneController implements Initializable {

    @FXML
    private Label questionLabel;
   
    public Label getQuestionLabel() {
    	return questionLabel;
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
}
