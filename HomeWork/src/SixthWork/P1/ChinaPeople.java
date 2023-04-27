package SixthWork.P1;

public class ChinaPeople extends People {
	public double height;
	public double weight;

	@Override
	public void speakHello() {
		System.out.println("hello,I am ChinaPeople.");
	}
	@Override
	public void averageHeight() {
		System.out.print("avarge heigh of ChinaPeople:");
		System.out.println(this.height);
	}
	@Override
	public void averageWeight() {
		System.out.print("average weight of ChinaPeople:");
		System.out.println(this.weight);
	}
	void chinaGongfu() {
		System.out.println("I can gongfu.");
	}
}
