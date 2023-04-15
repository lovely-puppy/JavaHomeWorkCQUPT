package experiment_3;
import java.util.Scanner;

public class Complex {
	private double real1;
	private double real2;
	private double imag1;
	private double imag2;
	
	Complex() {};
	Complex(double real1, double imag1, double real2, double imag2) {
		this.real1 = real1;
		this.imag1 = imag1;
		this.real2 = real2;
		this.imag2 = imag2;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	double sub(double a, double b) {
		return a - b;
	}
	double mul(double a, double b, double c, double d) {
		return a*b - c*d;
	}
	
	void show() {
		System.out.printf("ComplexNumber a: %.1f + %.1fi\n", this.real1, this.imag1);
		System.out.printf("ComplexNumber b: %.1f + %.1fi\n", this.real2, this.imag2);
		System.out.printf("(a + b) = %.1f + %.1fi\n", add(this.real1, this.real2), add(this.imag1, this.imag2));
		System.out.printf("(a - b) = %.1f + %.1fi\n", sub(this.real1, this.real2), sub(this.imag1, this.imag2));
		System.out.printf("(a * b) = %.1f + %.1fi", mul(this.real1, this.real2, this.imag1, this.imag2), mul(this.real1, this.imag2, this.imag1, -this.real2));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input c1:");
		double a = sc.nextInt(), b = sc.nextInt();
		System.out.println("input c2:");
		double c = sc.nextInt(), d = sc.nextInt();
		Complex complex = new Complex(a, b, c, d);
		complex.show();
		sc.close();
	}
}
