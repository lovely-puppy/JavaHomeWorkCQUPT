package SixthWork.P1;

public class People {
	protected double height;
	protected double weight;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void speakHello() {
		System.out.println("hello!");
	}
	public void averageHeight() {
		System.out.println("avarge  heigh:"  +  height);
	}
	public void averageWeight() {
		System.out.println("average  weight:"  +  weight);
	}
}

