package Study_20220218_24;

import java.util.Scanner;

public class BOJ_2578_빙고 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] vMap = new int[5][5];
		int ans = 25;
		boolean flag = true;// 빙고를 찾았는지

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				vMap[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 25; i++) {
			calls(vMap, sc.nextInt());
			if (i > 10 && flag) { // 빙고는 12번 이상 불렀을 때 나옴(i요녀석 0부터 시작.. i == 11이 12번째ㅠㅠ)
				if (isBingo(vMap)) {
					ans = i + 1;
					flag = false;
				}
			}
		}
		System.out.print(ans);
	}

	public static void calls(int[][] vMap, int num) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (vMap[i][j] == num) {
					vMap[i][j] = 0;
					break;
				}
			}
		}
	}

	public static boolean isBingo(int[][] vMap) {
		int[] countrow = new int[5];
		int[] countcol = new int[5];
		int[] count = new int[2]; // 0은 \, 1은/
		int bingo = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (vMap[i][j] == 0) { // 0일때
					if (i == j)// \빙고
						count[0]++;
					if (i + j == 4)// /빙고
						count[1]++;
					countrow[i]++; // 가로빙고
					countcol[j]++; // 세로빙고
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			if (countrow[i] == 5) // 가로빙고
				bingo++;
			if (countcol[i] == 5) // 세로빙고
				bingo++;
		}
		for (int i = 0; i < 2; i++) {
			if (count[i] == 5) // 대각선빙고
				bingo++;
		}

		if (bingo >= 3)
			return true;
		return false;
	}
}
