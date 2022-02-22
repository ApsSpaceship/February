import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] ans = new char[n];
		for (int round = 0; round < n; ++round) {
			int a = sc.nextInt();
			int[] A = new int[5];
			for (int i = 0; i < a; ++i)
				++A[sc.nextInt()];
			int b = sc.nextInt();
			int[] B = new int[5];
			for (int i = 0; i < b; ++i)
				++B[sc.nextInt()];
			for (int i = 4; i >= 1; --i)
				if (A[i] > B[i]) {
					ans[round] = 'A';
					break;
				} else if (A[i] < B[i]) {
					ans[round] = 'B';
					break;
				}
			if (ans[round] != 'A' && ans[round] != 'B')
				ans[round] = 'D';
		}
		for (int round = 0; round < n; ++round)
			System.out.printf("%c\n", ans[round]);
	}
}
