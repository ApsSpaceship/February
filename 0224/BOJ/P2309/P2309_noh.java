import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; ++i) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		int findSum = sum - 100;
		int p1 = 0;
		int p2 = 8;
		while (p1 < p2) {
			if (arr[p1] + arr[p2] == findSum)
				break;
			if (arr[p1] + arr[p2] > findSum)
				--p2;
			else if (arr[p1] + arr[p2] < findSum)
				++p1;
		}
		for (int i = 0; i < 9; ++i) {
			if (i == p1 || i == p2)
				continue;
			System.out.println(arr[i]);
		}
	}
}
