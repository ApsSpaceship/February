import java.util.Scanner;

public class baekjoon_2578_빙고 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] my = new int[5][5];
		int[][] del = new int[5][5];

		for (int i = 0; i < my.length; i++) {
			for (int j = 0; j < my.length; j++) {
				my[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < del.length; i++) {
			for (int j = 0; j < del.length; j++) {
				del[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		int r = 0; // 정답 좌표
		int c = 0; // 정답 좌표
		int bingo = 0;
		while (bingo < 3) {
			bingo = 0;
			me: for (int k = 0; k < my.length; k++) {
				for (int l = 0; l < my.length; l++) {
					if (my[k][l] == del[r][c]) {
						my[k][l] = 0; // 사회자가 부른 번호  0으로 만든다.
						count++;
						c++;
						if (c == 5) { // 5*5라 c가 4를 넘어가면 다음 줄로 답안배열의 좌표를 옮긴다.
							r++;
							c = 0;
						}
						break me;
					}
				}
			}
			// 가로빙고 판단
			for (int i = 0; i < my.length; i++) {
				boolean flag = true;
				for (int j = 0; j < my.length; j++) {
					if (my[i][j] != 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					bingo++;
				}
			}
			// 세로빙고판단
			for (int i = 0; i < my.length; i++) {
				boolean flag = true;
				for (int j = 0; j < my.length; j++) {
					if (my[j][i] != 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					bingo++;
				}
			}
			// 대각선빙고
			int b = 0;
			int d = 0;
			for (int i = 0; i < my.length; i++) {
				for (int j = 0; j < my.length; j++) {
					if (i == j && my[i][j] == 0) {
						b++;
					}
					//오른쪽 대각선 위로 향하는 방향은 i+j == 4일때
					if (i + j == 4 && my[i][j] == 0) {
						d++;
					}
				}
				if (b == 5) {
					bingo++;

				}
				if (d == 5) {
					bingo++;
				}
			}
		}
		System.out.println(count);
	}

}
