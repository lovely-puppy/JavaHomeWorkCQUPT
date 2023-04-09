package ForthWork;
import java.util.Scanner;

public class Problem_four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		String s1 = solve(s, n);
		System.out.println(s1);
	}
	static String solve(String s, int n) {
		int len = s.length();
		char[] arr = s.toCharArray();
		for (int k = 0; k < n; k ++ ) {
			for (int i = 0; i < len; i ++ ) {
				if (arr[i] != '*') {
					boolean flag = false;
					for (int j = i + 1; j < len; j ++ ) {
						if (arr[j] != '*') {
							if (arr[i] > arr[j]) {
								arr[i] = '*';
								flag = true;
								break;
							} else break;
						}
					}
					if (flag) break;
				}
			}
		}
		String res = new String();
		for (int i = 0; i < len; i ++ ) {
			if (arr[i] != '*') res += arr[i];
		}
		return res;
	}
}
