package FifthWork;
import java.util.Scanner;

public class Problem_four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the horizontal (X) : ");
		double x = sc.nextDouble();
		System.out.println("Please input the ordinate (Y) : ");
		double y = sc.nextDouble();
		
		MyPoint mp = new MyPoint(x, y);
		System.out.println("Your location of horizontal (X) is :" + mp.getX());
		System.out.println("Your location of ordinate (Y) is :" + mp.getY());
	}
}
