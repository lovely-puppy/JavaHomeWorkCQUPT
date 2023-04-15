package experiment_3;
import java.util.Scanner;

public class Triangle {
	private double a, b, c;
	
	Triangle() {};
	Triangle(double x, double y, double z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}
	
	boolean is_valid() {
		if (this.a + this.b <= this.c || this.a + this.c <= this.b || this.b + this.c <= this.a) return false;
		return true;
	}
	
	double getPerimeter() {
		if (is_valid() == false) return 0;
		return this.a + this.b + this.c;
	}
	double getArea() {
		if (is_valid() == false) return 0;
		double s = (this.a + this.b + this.c) / 2;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
	public void setSide(double x, double y, double z) {
		this.a = x; this.b = y; this.c = z;
	}
	
	void show() {
		System.out.printf("perimeter=%.1f\n", getPerimeter());
		System.out.printf("area=%.1f\n", getArea());
		if (is_valid()) System.out.printf("a=%.1f,b=%.1f,c=%.1f", this.a, this.b, this.c);
		else System.out.println("a=0.0,b=0.0,c=0.0");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		Triangle triangle = new Triangle(a, b, c);
		triangle.show();
		sc.close();
	}
}
