package SixthWork.P2;

public class TestHuman {
	public static void main(String[] args) {
		Man m = new Man();
		m.setName("Dave");
		m.setAge(28);
		m.setSex("man");
		m.getInfo();
		m.speak();
		m.run();
	
		Human h = new Woman();
		h.setName("Jude");
		h.setAge(58);
		h.setSex("woman");
		h.getInfo();
		h.speak();
		h.run();
	}
	
}
