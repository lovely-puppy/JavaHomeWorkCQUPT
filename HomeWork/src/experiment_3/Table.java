package experiment_3;
import java.util.Scanner;

public class Table {
	private String shape;
	private int legs;
	private int height;
	private int area;
	
	Table() {};
	Table(String shape, int legs, int height, int area) {
		this.shape = shape;
		this.legs = legs;
		this.height = height;
		this.area = area;
	}
	
	public String toString() { 
		return "Shape:" + this.shape + "\nLegs:" + this.legs + "\nHight" + this.height + "\nArea:" + this.area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String shape = sc.nextLine();
		int legs = sc.nextInt();
		int height = sc.nextInt();
		int area = sc.nextInt();
		Table table = new Table(shape, legs, height, area);
		System.out.println(table);
		sc.close();
	}
}
