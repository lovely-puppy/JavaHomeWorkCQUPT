package FifthWork;

public class Circle {
	Circle() {}
	Circle(double r) {
		m_r = r;
	}
	
	private double m_r;
	
	double getPerimeter() {
		return 2 * Math.PI * m_r;
	}
	double getArea() {
		return Math.PI * m_r * m_r;
	}
	
	void disp() {
		System.out.printf("radius=%.4f\n", m_r);
		System.out.printf("perimeter=%.4f\n", getPerimeter());
		System.out.printf("area=%.4f\n", getArea());
	}
}
 