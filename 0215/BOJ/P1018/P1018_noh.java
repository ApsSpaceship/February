import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] board = new char[n][m];
		for (int i = 0; i < n; ++i)
			board[i] = sc.next().toCharArray();
		char[][] temp = new char[8][8];
		for (int i = 0; i < 8; ++i)
			for (int j = 0; j < 8; ++j)
				temp[i][j] = ((i + j) % 2 == 0 ? 'W' : 'B');
		int minDiff = 64;
		loop: for (int i = 0; i < n - 7; ++i)
			for (int j = 0; j < m - 7; ++j) {
				int cntDiff1 = 0;
				int cntDiff2 = 0;
				for (int k = 0; k < 8; ++k)
					for (int l = 0; l < 8; ++l)
						if (temp[k][l] != board[i + k][j + l])
							++cntDiff1;
						else
							++cntDiff2;
				minDiff = Math.min(minDiff, Math.min(cntDiff1, cntDiff2));
				if (minDiff == 0)
					break loop;
			}
		System.out.printf("%d", minDiff);
	}
}
