package NineWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book implements Comparable<Book> {
    private String name;
    private double price;

    public Book() {}
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compareTo(Book b) {
        if (this.price < b.price) return -1;
        else if (this.price == b.price) return 0;
        else return 1;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input several Book,in the end #");
        List<Book> book = new ArrayList<>();
        String str;
        str = sc.next();
        while (true) {
            String[] s = str.split(",");
            String name = s[0];
            double price = Double.parseDouble(s[1]);
            book.add(new Book(name, price));
            str = sc.next();
            if (str.equals("#")) break;
        }
        System.out.println("input a new Book:");
        str = sc.next();
        String[] s = str.split(",");
        String name = s[0];
        double price = Double.parseDouble(s[1]);
        Book b = new Book(name, price);

        System.out.println("new book:<"+name+">as same books");
        for (int i = 0; i < book.size(); i ++ ) {
            if (book.get(i).getPrice() == price) {
                System.out.println(book.get(i).getName() + "," + book.get(i).getPrice());
            }
        }
        sc.close();
    }
}
