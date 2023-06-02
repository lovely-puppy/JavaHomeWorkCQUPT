package NineWork;

import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable<Person> {
    private String name;
    private float height, weight;

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight() {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight() {
        this.weight = weight;
    }

    public void speak() {
        System.out.printf("I am %s,my height %.1f,my weight %.1f\n", name, height, weight);
    }
    public int compareTo(Person o) {
        if ((this.height*0.5+this.weight*0.5) < (o.height*0.5+o.weight*0.5)) return -1;
        else if ((this.height*0.5+this.weight*0.5) == (o.height*0.5+o.weight*0.5)) return 0;
        else return 1;
    }
    public String toString() {
        return "Person [name=" + name + ",height=" + height + ",weight=" + weight + "]";
    }
}

public class TestCompare {
    public static void main(String[] args) {
        int i;
        Person ps[] = new Person[6];
        ps[0] = new Person("zhangsan", 170, 110);
        ps[1]  =  new  Person("lisi",  168,  120);
        ps[2]  =  new  Person("wangwu",  165,  115);
        ps[3]  =  new  Person("zhaoliu",  172,  121);
        ps[4]  =  new  Person("zhouqi",  160,  100);
        ps[5]  =  new  Person("zhengba",  166,  119);
        System.out.println("array  sort  before:");
        for  (i  =  0;  i  <  ps.length;  i++)  {
            ps[i].speak();
        }
        Arrays.sort(ps, 0, 6, Person::compareTo);
        System.out.println("\narray  sort  after:");
        for  (i  =  0;  i  <  ps.length;  i++)  {
            System.out.println(ps[i]);
        }
    }
}
