package ThirdWork;
import java.util.Scanner;
public class Problem_three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmin = Integer.MAX_VALUE, tmax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i ++ ) {
			int x = sc.nextInt();
			if (x < tmin) tmin = x;
			if (x > tmax) tmax = x;
		}
		System.out.println(tmax + " " + tmin);
	}
}
