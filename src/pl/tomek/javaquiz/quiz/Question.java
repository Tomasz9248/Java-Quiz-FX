package pl.tomek.javaquiz.quiz;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Question implements Serializable {
	
	private static final long versionUID = 123456789111L;
	private String name;
	private List<String> answers;
	public Question(String name, String...answers) {
		this.setName(name);
	    this.answers = Arrays.asList(answers);
	}
	
	public String getAnswer(int index) {
		return answers.get(index);
	}
	
	public String getCorrectAnswer() {
		return answers.get(0);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
