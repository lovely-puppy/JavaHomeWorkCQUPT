package FifthWork;

public class Employee {
	private String m_name;
	private int m_age;
	private double m_salary;
	private double m_bonus;
	
	Employee() {}
	Employee(String name, int age, double salary, double bonus) {
		m_name = name;
		m_age = age;
		m_salary = salary;
		m_bonus = bonus;
	}
	
	String getName() {
		return m_name;
	}
	int getAge() {
		return m_age;
	}
	double getIncome() {
		return m_salary + m_bonus;
	}
}
