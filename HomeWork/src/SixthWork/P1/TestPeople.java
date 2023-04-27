package SixthWork.P1;

public class TestPeople {
	public static void main(String[] args) {
		ChinaPeople chp = new ChinaPeople();
		chp.height = 180;
		chp.weight = 130;
		chp.speakHello();
		chp.averageHeight();
		chp.averageWeight();
		chp.chinaGongfu();
		
		AmericanPeople amp = new AmericanPeople();
		amp.setHeight(175);
		amp.setWeight(150);
		amp.speakHello();
		amp.averageHeight();
		amp.averageWeight();
		amp.amercianBoxing();
	}
}
