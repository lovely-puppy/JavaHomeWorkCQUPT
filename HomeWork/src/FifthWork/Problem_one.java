package FifthWork;
import java.util.Scanner;

public class Problem_one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input length: ");
		double length = sc.nextDouble();
		System.out.println("Please input width: ");
		double width = sc.nextDouble();
		Retangle ret = new Retangle(length, width);
		System.out.println("The lengh is:" + ret.getLength());
		System.out.println("The width is:" + ret.getWidth());
		System.out.println("The area is:" + ret.getArea());
	}
}