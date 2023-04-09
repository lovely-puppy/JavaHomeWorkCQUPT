package FifthWork;
import java.util.Scanner;

public class Problem_two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		Circle c = new Circle(r);
		c.disp();
	}
}
