package experiment_5;
import java.util.Scanner;

interface CircleInterface {
	final float PI = 3.14159f;
	float getArea(float r);
	float getCircumference(float r);
}
class Circle implements CircleInterface {
	public float getArea(float r) {
		return PI * r * r;
	}
	public float getCircumference(float r) {
		return 2 * PI * r;
	}
}
public class Problem_1 {
	public static void main(String[] args) {
		Circle c = new Circle();
		Scanner in = new Scanner(System.in);
		System.out.println("Please input r: ");
		float r = in.nextFloat();
		System.out.println("The area is : " + c.getArea(r));
		System.out.println("The circumference is : " + c.getCircumference(r));
		in.close();
	}
}