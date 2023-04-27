package experiment_4;
import  java.util.Scanner;

public class Student {
	private String name, id;
	private int score;
	
	Student() {};
	Student(String name, String id, int score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}
	
	void setScore(int x) {
		if (x > 100 || x < 0) {
			System.out.println("score input error");
		} else {
			this.score = x;
		}
	}
	public String toString() {
		if (this.score < 0 || this.score > 100) this.score = 0;
		return "name=" + this.name + ",id=" + this.id + ",score=" + this.score;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n, s;
		int sc;
		n = in.nextLine();
		s = in.nextLine();
		sc = in.nextInt();
		Student stu = new Student(n, s, sc);
		System.out.println(stu);
		stu.setScore(sc + 50);
		System.out.println(stu);
	}
}
