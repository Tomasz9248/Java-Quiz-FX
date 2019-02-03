package pl.tomek.javaquiz.controller;

import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import pl.tomek.javaquiz.model.Question;
import pl.tomek.javaquiz.model.QuestionsBase;

public class MainPaneController implements Initializable {

	@FXML
	private ContentPaneController contentPaneController;

	@FXML
	private ControlPaneController controlPaneController;

	@FXML
	private ScorePaneController scorePaneController;

	private QuestionsBase qb;
	private Question question;
	private List<Button> buttonList;
	private Label qLabel;
	private Label scoreLabel;

	private static String answer = "";
	private static int score = 0;
	private static int questionNo = 0;

	String hitCorrect = ("resources/correct.mp3");
	String hitWrong = ("resources/wrong.mp3");
	Media soundCorrect = new Media(new File(hitCorrect).toURI().toString());
	Media soundWrong = new Media(new File(hitWrong).toURI().toString());
	MediaPlayer mediaPlayer;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeLibrary();
		setQuestion();
		setUpButtons();
	}

	public void initializeLibrary() {
		try {
			qb = new QuestionsBase().loadDatabase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setQuestion() {
		question = qb.getRandomQuestion();
		qLabel = contentPaneController.getQuestionLabel();
		qLabel.setText(question.getName());
	}

	public boolean validateAnswer() {
		return (answer.equals(question.getCorrectAnswer()));
	}

	public void nextQuestion() {
		questionNo++;
		if (validateAnswer() && questionNo < 10) {
			playCorrect();
			score = score + 1;
			setLabel();
			setQuestion();
			setUpButtons();
		} else if (questionNo < 10) {
			playWrong();
			setQuestion();
			setUpButtons();
		} else {
			qLabel.setText("Twój wynik to: " + score + "/10");
		}
	}

	public void setLabel() {
		scoreLabel = scorePaneController.getScoredPointsLabel();
		scoreLabel.setText(String.valueOf(score));
	}

	private void setUpButtons() {
		buttonList = controlPaneController.getButtonList();
		Collections.shuffle(buttonList);
		int index = 0;
		for (Button button : buttonList) {
			button.setText(question.getAnswer(index));
			index++;
		}
		for (Button button : buttonList) {
			getAnswer(button);
		}
	}

	private void getAnswer(Button button) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				answer = button.getText();
				nextQuestion();
			}
		});
	}

	private void playCorrect() {
		mediaPlayer = new MediaPlayer(soundCorrect);
		mediaPlayer.play();
	}

	private void playWrong() {
		mediaPlayer = new MediaPlayer(soundWrong);
		mediaPlayer.play();
	}
}
