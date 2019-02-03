package pl.tomek.javaquiz.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuestionsBase implements Serializable {

	private List<Question> questionsBase;
	private String filePath = "resources/dataSource.txt";
	private static final long versionUID = 123456789111L;

	public QuestionsBase() {
		questionsBase = new ArrayList<>();
	}

	public void addQuestion(Question question) {
		questionsBase.add(question);
	}

	public Question getRandomQuestion() {
		int random = (int) Math.floor(Math.random() * questionsBase.size());
		return questionsBase.get(random);
	}

	public void saveFile(Object obj) {
		QuestionsBase qb = new QuestionsBase();
		try {
			File file = new File(filePath);
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(obj);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public QuestionsBase loadDatabase() throws Exception {
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream reader = new ObjectInputStream(fis);
		QuestionsBase qb = (QuestionsBase) reader.readObject();
		reader.close();
		return qb;
	}
}