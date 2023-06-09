package SecondWork;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Problem_four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (is_prime(x) && is_prime(get(x))) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	static int get(int x)
	{
		int sum = 0;
		while (x > 0) {
			sum = sum * 10 + x % 10;
			x /= 10;
		}
		return sum;
	}
	
	static boolean is_prime(int x)
	{
		if (x <= 1) return false;
		for (int i = 2; i <= (int)Math.sqrt(x); i ++ ) {
			if (x % i == 0) return false;
		}
		return true;
	}
}