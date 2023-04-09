package ForthWork;
import java.util.Scanner;
public class Problem_three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		for (int i = start; i <= end; i ++ ) {
			if (is_huiwen(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean is_huiwen(int x) {
		if (x/10 == 0) return true;
		int cnt = 0;
		int[] arr = new int[20];
		while (x != 0) {
			arr[cnt ++ ] = x % 10;
			x /= 10;
		}
		int l = 0, r = cnt - 1;
		while (l < r) {
			if (arr[l] != arr[r]) return false;
			l ++;r --;
		}
		return true;
	}
}
