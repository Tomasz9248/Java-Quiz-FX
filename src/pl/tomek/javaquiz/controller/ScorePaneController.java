package pl.tomek.javaquiz.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ScorePaneController implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private Label scoreLabel;

    @FXML
    private Label scoredPointsLabel;
    
    public Label getScoredPointsLabel() {
    	return scoredPointsLabel;
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
    
    

}
