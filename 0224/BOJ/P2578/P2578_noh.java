import java.util.Scanner;

class Pair {
	int first;
	int second;
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[5][5];
		boolean[][] call = new boolean[5][5];
		Pair[] pos = new Pair[26];
		for (int i = 1; i <= 25; ++i)
			pos[i] = new Pair();
		for (int i = 0; i < 5; ++i)
			for (int j = 0; j < 5; ++j) {
				board[i][j] = sc.nextInt();
				pos[board[i][j]].first = i;
				pos[board[i][j]].second = j;
			}
		for (int i = 1; i <= 25; ++i) {
			int num = sc.nextInt();
			call[pos[num].first][pos[num].second] = true;
			if (i >= 12 && BingoCheck(call)) {
				System.out.printf("%d\n", i);
				break;
			}
		}
	}

	static boolean BingoCheck(boolean[][] call) {
		int cnt = 0;
		for (int i = 0; i < 5; ++i) {
			boolean bingo = true;
			for (int j = 0; j < 5; ++j)
				if (!call[i][j]) {
					bingo = false;
					break;
				}
			if (bingo)
				++cnt;
		}
		for (int i = 0; i < 5; ++i) {
			boolean bingo = true;
			for (int j = 0; j < 5; ++j)
				if (!call[j][i]) {
					bingo = false;
					break;
				}
			if (bingo)
				++cnt;
		}
		boolean bingo = true;
		for (int i = 0; i < 5; ++i)
			if (!call[i][i]) {
				bingo = false;
				break;
			}
		if (bingo)
			++cnt;
		bingo = true;
		for (int i = 0; i < 5; ++i)
			if (!call[i][4 - i]) {
				bingo = false;
				break;
			}
		if (bingo)
			++cnt;
		return cnt >= 3;
	}
}
