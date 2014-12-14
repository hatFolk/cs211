import java.util.*;
public class MyExam extends Exam{
	String name;
	int score;
	public MyExam(int age, int score, String name){
		super(age);
		this.list = new ArrayList();
		type = "A";
		score = (score % 101); // Ensures a score between 0 and 100
		this.name = (name.length() >=2) ? name : "thorin";
	}

	public void setName(String name){
		this.name = name;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int compareTo(Object o){
		return 0;
	}

	public String toString(){
		return name + " " + score;
	}
}

