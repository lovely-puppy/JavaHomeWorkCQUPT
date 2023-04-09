package FifthWork;
import java.util.Scanner;

public class Problem_three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the employee's name: ");
		String name = sc.next();
		System.out.println("Please input the employee's age: ");
		int age = sc.nextInt();
		System.out.println("Please input the employee's sarary: ");
		double salary = sc.nextDouble();
		System.out.println("Please input the employee's bonus: ");
		double bonus = sc.nextDouble();
		Employee e = new Employee(name, age, salary, bonus);
		System.out.println("Employee's name: " + e.getName());
		System.out.println("Employee's age: " + e.getAge());
		System.out.println("Employee's income: " + e.getIncome());
	}
}
