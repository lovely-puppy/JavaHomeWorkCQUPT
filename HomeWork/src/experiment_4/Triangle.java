package experiment_4;
import java.util.Scanner;

public class Triangle {
	private double a, b, c;
	
	Triangle() {};
	Triangle(double x, double y, double z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}
	
	boolean isValid() {
		if (this.a + this.b <= this.c || this.a + this.c <= this.b || this.b + this.c <= this.a) return false;
		return true;
	}
	
	double getPerimeter() {
		if (!isValid()) {
			this.a = 0;this.b=0;this.c=0;
			return 0;
		}
		return this.a + this.b + this.c;
	}
	
	double getArea() {
		if (!isValid()) {
			this.a = 0;this.b=0;this.c=0;
			return 0;
		}
		double s = (this.a + this.b + this.c) / 2;
		return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
	}
	void setSide(double x, double y, double z) {
		if (x + y <= z || x + z <= y || y + z <= x) {
			System.out.println("a b c input error");
		} else {
			this.a = x;
			this.b = y;
			this.c = z;
		}
	}
	double getA() {
		if (!isValid()) return 0;
		return this.a;
	}
	void setA(double x) {
		double tmp = this.a;
		this.a = x;
		if (!isValid()) {
			System.out.println("a input error");
			this.a = tmp;
		}
	}
	double getB() {
		if (!isValid()) return 0;
		return this.b;
	}
	void setB(double x) {
		double tmp = this.b;
		this.b = x;
		if (!isValid()) {
			System.out.println("b input error");
			this.b = tmp;
		}
	}
	double getC() {
		if (!isValid()) return 0;
		return this.c;
	}
	void setC(double x) {
		double tmp = this.c;
		this.c = x;
		if (!isValid()) {
			System.out.println("c input error");
			this.c = tmp;
		}
	}
	
	public String toString() {
		return "a=" + this.a + ",b=" + this.b + ",c=" + this.c;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		Triangle t = new Triangle(x, y, z);
		System.out.println("perimeter=" + t.getPerimeter());
		System.out.println("area=" + t.getArea());
		System.out.println(t);
		t.setSide(t.getA() + 3, t.getB() + 2, t.getC() + 1);
		System.out.println(t);
        t.setA(t.getA()  +  20);
        System.out.println(t);
        t.setB(t.getB()  +  20);
        System.out.println(t);
        t.setC(t.getC()  +  20);
        System.out.println(t);
        in.close();
	}
}
