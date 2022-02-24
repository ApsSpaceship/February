import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; ++i)
			arr[i] = sc.nextInt();
		int[] pSum = new int[n + 1];
		for (int i = 1; i <= n; ++i)
			pSum[i] = arr[i] + pSum[i - 1];

		int maxSum = Integer.MIN_VALUE;
		int p1 = 0;
		int p2 = k;
		while (p2 <= n) {
			maxSum = Math.max(maxSum, pSum[p2] - pSum[p1]);
			++p1;
			++p2;
		}
		System.out.printf("%d", maxSum);
	}
}
