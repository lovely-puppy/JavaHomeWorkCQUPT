package ForthWork;

import java.util.Scanner;

public class Problem_one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		String s = sc.nextLine();
		int numbers = 0, letters = 0, space = 0, other = 0;
		for (int i = 0; i < s.length(); i ++ ) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') numbers ++ ;
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') letters ++ ;
			else if (s.charAt(i) == ' ') space ++ ;
			else other ++ ;
		}
		System.out.printf("The number of numbers is: %d\n", numbers);
		System.out.printf("The number of English letters is: %d\n", letters);
		System.out.printf("The number of blank space is: %d\n", space);
		System.out.printf("The number of other characters is: %d", other);
	}
}
