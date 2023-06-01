package EightWork;

public class Test1 {
    public static void main(String[] args) {
        MobilePhone1 phone1 = new MobilePhone1("HUAWEI", "13800009999", "130111111111111111");
        phone1.display();
    }
}

abstract class Phone1 {
    private String code;

    public Phone1(String  code) {
        this.code = code;
    }

    public abstract void display();
}

class MobilePhone1 extends Phone1 {
    private String brand;
    private String ownerId;

    public MobilePhone1(String brand, String code, String ownerId) {
        super(code);
        this.brand = brand;
        this.ownerId = ownerId;
    }

    public void display() {
        System.out.println("Brand is" + brand);
        System.out.println("OwnerId is" + ownerId);
    }
}