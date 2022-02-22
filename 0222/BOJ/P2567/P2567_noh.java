import java.util.Scanner;

public class Main {
	static int[] dy = { 1, 0, -1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[102][102];
		int n = sc.nextInt();
		for (int t = 0; t < n; ++t) {
			int x = sc.nextInt() + 1;
			int y = 90 - sc.nextInt() + 1;
			for (int i = 0; i < 10; ++i)
				for (int j = 0; j < 10; ++j)
					board[y + i][x + j] = 1;
		}
		int cnt = 0;
		for (int i = 1; i <= 100; ++i)
			for (int j = 1; j <= 100; ++j)
				if (board[i][j] == 1)
					for (int dir = 0; dir < 4; ++dir)
						if (board[i + dy[dir]][j + dx[dir]] == 0)
							++cnt;

		System.out.printf("%d", cnt);
	}
}
