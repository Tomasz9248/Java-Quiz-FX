package pl.tomek.javaquiz.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import pl.tomek.javaquiz.model.Question;
import pl.tomek.javaquiz.model.QuestionsBase;

public class ContentPaneController implements Initializable {

    @FXML
    private Label questionLabel;
   
    public Label getQuestionLabel() {
    	return questionLabel;
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		QuestionsBase qb = new QuestionsBase();
		Question q1 = new Question("Wybierz odpowiedni typ danych dla tej warto�ci: 5.5", "double", "boolean", "ArrayList", "LinkedList");
		Question q2 = new Question("Kt�ry interfejs odpowiada za zapis i odczyt danych wraz ze zmianami?", "Serializable", "Saveable", "Loadable", "Runnable");
		Question q3 = new Question("Kt�ra z operacji nie jest wspierana przez j�zyk Java?", "Operator Overloading", "Reflection", "Mutlithreading", "Garbage Collection");
		Question q4 = new Question("Kt�re ze s��w nie jest s�owem kluczowym j�zyka Java?", "null", "import", "package", "volatile");
		Question q5 = new Question("Kt�re polecenie s�u�y do kompilowania programu Java?", "javac", "java", "javad", "javadocs");
		Question q6 = new Question("Co si� stanie je�li nie umie�cimy s�owa kluczowego \"static\" w sygnaturze metody main?", "Runtime error", "JVM uzupe�ni sygnatur� i skompiluje kod", "JVM skompiluje kod zak�adaj�c, �e s�owo static jest niejawne", "JVM nie zacznie kompilacji i wy�wietli error");
		Question q7 = new Question("W Java je�li nie nadasz warto�ci zmiennej przed jej u�yciem to:", "kompilator wy�wietli error", "zostanie zainicjowana z warto�ci� 0", "b�dzie zawiera� tzw. garbage value", "�adne z wymienionych");
		Question q8 = new Question("Wybierz odpowiedni typ danych dla tej warto�ci: 5.5", "double", "boolean", "String", "int");
		Question q9 = new Question("Jaki jest rozmiar tablicy zadeklarowanej w taki spos�b: int[] ar = {1,2,3,4,5,6}; ", "6", "5", "7", "1");
		Question q10 = new Question("Jak� warto�� przyjmuje ar[3] przy deklaracji int[] ar = {1,2,3,4,5,6};", "4", "5", "3", "0");
		Question q11 = new Question("Ostatni� warto�� w tablicy otrzymamy podaj�c jako argument:", "array.length-1", "array.length", "1", "0");
		
		
		qb.addQuestion(q1);
		qb.addQuestion(q2);
		qb.addQuestion(q3);
		qb.addQuestion(q4);
		qb.addQuestion(q5);
		qb.addQuestion(q6);
		qb.addQuestion(q7);
		qb.addQuestion(q8);
		qb.addQuestion(q9);
		qb.addQuestion(q10);
		qb.addQuestion(q11);
		qb.saveFile(qb);

	}
}
