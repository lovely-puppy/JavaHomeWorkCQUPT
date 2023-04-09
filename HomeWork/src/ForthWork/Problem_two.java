package ForthWork;
import java.util.Scanner;

public class Problem_two {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input 10 numbers:");
		int[] arr = new int[10];
		for (int i = 0; i < 10; i ++ ) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Your numbers are:");
		for (int i = 0; i < 10; i ++ ) System.out.print(arr[i] + " ");
		System.out.println("");
		System.out.println("Please input m:");
		int m = sc.nextInt();
		reverse(arr, 0, 9);
		reverse(arr, 0, m-1);
		reverse(arr, m, 9);
		System.out.println("The new numbers are:");
		for (int i = 0; i < 10; i ++ ) System.out.print(arr[i] + " ");
		
	}
	static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int tmp = a[start];
			a[start] = a[end];
			a[end] = tmp;
			start ++;
			end -- ;
		}
	}
}
