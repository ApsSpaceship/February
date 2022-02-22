import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; ++i)
			arr[i] = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < m; ++i) {
			if (sc.nextInt() == 1) {
				int num = sc.nextInt();
				for (int j = num; j <= n; j += num)
					arr[j] = 1 - arr[j];
			} else {
				int num = sc.nextInt();
				int p1 = num;
				int p2 = num;
				while (1 <= p1 && p2 <= n) {
					if (arr[p1] != arr[p2])
						break;
					arr[p1] = 1 - arr[p1];
					arr[p2] = arr[p1];
					--p1;
					++p2;
				}
			}
		}
		for (int i = 1; i <= n; ++i) {
			System.out.printf("%d ", arr[i]);
			if (i % 20 == 0)
				System.out.println();
		}
	}
}
