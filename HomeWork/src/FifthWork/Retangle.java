package FifthWork;

public class Retangle {
	Retangle() {};
	Retangle(double length, double width) {
		m_width = width;
		m_length = length;
	}
	
	private double m_length;
	private double m_width;
	double getWidth() {
		return m_width;
	}
	double getLength() {
		return m_length;
	}
	void setWidth(double width) {
		m_width = width;
	}
	void setLength(double length) {
		m_length = length;
	}
	double getArea() {
		return m_width * m_length;
	}
}