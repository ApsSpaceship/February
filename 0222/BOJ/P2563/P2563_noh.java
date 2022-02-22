import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[100][100];
		int n = sc.nextInt();
		for (int t = 0; t < n; ++t) {
			int x = sc.nextInt();
			int y = 90 - sc.nextInt();
			for (int i = 0; i < 10; ++i)
				for (int j = 0; j < 10; ++j)
					board[y + i][x + j] = 1;
		}
		int cnt = 0;
		for (int i = 0; i < 100; ++i)
			for (int j = 0; j < 100; ++j)
				if (board[i][j] == 1)
					++cnt;
		System.out.printf("%d", cnt);
	}
}
