package pl.tomek.javaquiz.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import pl.tomek.javaquiz.quiz.QuestionsBase;
import pl.tomek.javaquiz.quiz.Question;

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
