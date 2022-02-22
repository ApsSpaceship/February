import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] stu = new int[6 + 1][2];
		for (int i = 0; i < n; ++i) {
			int s = sc.nextInt();
			int y = sc.nextInt();
			++stu[y][s];
		}
		int sum = 0;
		for (int y = 1; y <= 6; ++y)
			for (int s = 0; s <= 1; ++s)
				if (stu[y][s] % k == 0)
					sum += stu[y][s] / k;
				else
					sum += stu[y][s] / k + 1;
		System.out.printf("%d", sum);
	}
}
