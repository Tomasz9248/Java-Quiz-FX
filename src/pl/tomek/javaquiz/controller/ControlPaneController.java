package pl.tomek.javaquiz.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControlPaneController implements Initializable {

	@FXML
	private Button buttonA;
	@FXML
	private Button buttonB;
	@FXML
	private Button buttonC;
	@FXML
	private Button buttonD;

	private List<Button> buttonList;

	public Button getButtonA() {
		return buttonA;
	}

	public Button getButtonB() {
		return buttonB;
	}

	public Button getButtonC() {
		return buttonC;
	}

	public Button getButtonD() {
		return buttonD;
	}

	public List<Button> getButtonList() {
		return buttonList;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setupButtonList();
	}

	public List<Button> setupButtonList() {
		buttonList = new ArrayList<>();
		buttonList.add(buttonA);
		buttonList.add(buttonB);
		buttonList.add(buttonC);
		buttonList.add(buttonD);
		return buttonList;
	}
}