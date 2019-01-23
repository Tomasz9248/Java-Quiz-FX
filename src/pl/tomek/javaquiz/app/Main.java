package pl.tomek.javaquiz.app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		String appName = "JavaQuiz v0.2";
		
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/pl/tomek/javaquiz/view/MainPane.fxml"));
		Scene scene = new Scene(parent);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle(appName);
		primaryStage.show();
	
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
