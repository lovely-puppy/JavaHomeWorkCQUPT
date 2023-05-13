package seventhWork;

abstract class Shape {
	final double PI = 3.1415926;
	abstract double perimeter();
}

class Circle extends Shape {
	private double r;
	public Circle(double r) {
		this.r = r;
	}
	double perimeter() {
		return 2 * PI * this.r;
	}
}

class Rectangle extends Shape {
	private double a, b;
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	double perimeter() {
		return 2 * a + 2 * b;
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Rectangle rect = new Rectangle(2, 3);
		System.out.println(c.perimeter());
		System.out.println(rect.perimeter());
	}
}
