package SixthWork.P2;

public class Human {
	private String name;
	private int age;
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void speak() {
		System.out.println("I am a human.");
	}
	
	public void run() {
		System.out.println("I can run.");
	}
	
	public void getInfo() {
		System.out.println("my name is:" + getName());
		System.out.println("my age is:" + getAge());
		System.out.println("my sex is:" + getSex());
	}
}
