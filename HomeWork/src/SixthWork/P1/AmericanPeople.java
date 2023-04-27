package SixthWork.P1;

public class AmericanPeople extends People {
	@Override
	public void speakHello() {
		System.out.println("hello,I am American!");
	}
	@Override
	public void averageHeight() {
		System.out.print("avarge heigh of American:");
		System.out.println(height);
	}
	@Override
	public void averageWeight() {
		System.out.print("average weight of American:");
		System.out.println(weight);
	}
	public void amercianBoxing() {
		System.out.println("I can boxing.");
	}
}
