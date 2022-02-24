import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxV = 0;
		int maxI = 0;
		for (int i = 1; i <= n; ++i) {
			int a1 = n;
			int a2 = i;
			int a3;
			int cnt = 2;
			while (a1 >= a2) {
				a3 = a1 - a2;
				a1 = a2;
				a2 = a3;
				++cnt;
			}
			if (maxV < cnt) {
				maxV = cnt;
				maxI = i;
			}
		}
		System.out.printf("%d\n", maxV);
		int a1 = n;
		int a2 = maxI;
		int a3;
		while (a1 >= a2) {
			System.out.printf("%d ", a1);
			a3 = a1 - a2;
			a1 = a2;
			a2 = a3;
		}
		System.out.printf("%d ", a1);
		System.out.printf("%d ", a2);
	}
}
