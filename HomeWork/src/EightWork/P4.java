package EightWork;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] ch = n.toCharArray();
        int a = 0;
        int i = 0;
        while (ch[i] != '.') {
            a = a*10 + (ch[i] - '0');
            i ++ ;
        }
        i ++ ;
        int c = 1;
        int b = 0;
        for (;i < ch.length; i ++ ) {
            b = b * 10 + (ch[i] - '0');
            c *= 10;
        }
        int d = gcd(b, c);
        while (d != 1) {
            b /= d;
            c /= d;
            d = gcd(b, c);
        }
        System.out.printf("%d %d %d", a, b, c);
    }

    public static int gcd(int a, int b) {
        int tmp =- 0;
        while ((tmp = a % b) != 0) {
            a = b;
            b = tmp;
        }
        return b;
    }
}
