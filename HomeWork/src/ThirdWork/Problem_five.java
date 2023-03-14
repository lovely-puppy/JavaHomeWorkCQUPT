package ThirdWork;
import java.util.Scanner;
public class Problem_five {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toUpperCase().toCharArray();
		int[] cnt = new int[26];
		for (int i = 0; i < str.length; i ++ ) {
			if (str[i] >= 65 && str[i] <= 90) {
				cnt[(int)str[i] - 65] ++ ;
			}
		}
		for (int i = 0; i < 26; i ++ ) {
			if (cnt[i] > 0) {
				System.out.printf("(%c)Num=%d\n", (char)(i+65), cnt[i]);
			}
		}
	}
}
