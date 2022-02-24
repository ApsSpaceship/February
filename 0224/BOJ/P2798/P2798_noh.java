import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int p1 = 0;
		int p2 = 1;
		int p3 = n - 1;
		int maxSum = 0;
		outer: while (p1 != n - 2) {
			while (p2 < p3) {
				if (arr[p1] + arr[p2] + arr[p3] == m) {
					maxSum = m;
					break outer;
				}
				if (arr[p1] + arr[p2] + arr[p3] > m)
					--p3;
				else if (arr[p1] + arr[p2] + arr[p3] < m) {
					maxSum = Math.max(maxSum, arr[p1] + arr[p2] + arr[p3]);
					++p2;
				}
			}
			++p1;
			p2 = p1 + 1;
			p3 = n - 1;
		}
		System.out.printf("%d", maxSum);
	}
}
