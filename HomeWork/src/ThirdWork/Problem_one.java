package ThirdWork;
import java.util.Scanner;
public class Problem_one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a score:");
		int x = sc.nextInt();
		char grade;
		if (x >= 90 && x <= 100) grade = 'A';
		else if (x >= 80 && x < 90) grade = 'B';
		else if (x >= 70 && x < 80) grade = 'C';
		else if (x >= 60 && x < 70) grade = 'D';
		else grade = 'E';
		System.out.println(grade);
	}
}
