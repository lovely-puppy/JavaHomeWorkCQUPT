package ThirdWork;
import java.util.Scanner;
public class Problem_two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while (x > 0) {
			if (is_prime(x)) {
				System.out.printf("%d is sushu.\n", x);
			} else {
				System.out.printf("%d is not sushu.\n", x);
			}
			x = sc.nextInt();
		}
		System.out.println("programe is over.");
	}
	static boolean is_prime(int x)
	{
		if (x <= 1) return false;
		for (int i = 2; i <= Math.sqrt(x); i ++ ) {
			if (x % i == 0) return false;
		}
		return true;
	}
}
