package Study_20220218_24;

import java.util.Scanner;

public class BOJ_2567_색종이2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] vMap = new int[102][102];// 0번 비움 100번 비움 1~ 99까지 사용
		int num = sc.nextInt();
		int x;
		int y;
		for (int i = 0; i < num; i++) { // 세로는 x~x+9까지 가로는 y~y+9까지 1입력
			y = sc.nextInt() + 1; // 입력은 0,0기준이므로 +1로 받음
			x = sc.nextInt() + 1;
			mapChange(vMap, x, y); // 맵에 색종이 입력
		}
		int sum = 0; // 합 초기화
		for (int i = 1; i < 101; i++) { // 맵 확인해서 값 다 더해주기(1~100사용)
			for (int j = 1; j < 101; j++) {
				if (vMap[i][j] == 1) // 1일 때만 찾기
					sum += check(i, j, vMap);
			}
		}
		System.out.print(sum); // 합 출력
	}

	public static void mapChange(int[][] vMap, int x, int y) {
		for (int i = 0; i < 10; i++) { // 색종이 부분 1로 칠하기
			for (int j = 0; j < 10; j++) {
				vMap[x + i][y + j] = 1;
			}
		}
	}

	public static int check(int x, int y, int[][] vMap) { // 주변 0개수 확인
		int[] dx = { 1, -1, 0, 0 }; // 4방향
		int[] dy = { 0, 0, 1, -1 };
		int sum = 0;
		for (int dir = 0; dir < 4; dir++) {
			if (vMap[x + dx[dir]][y + dy[dir]] == 0) { //0개수 세주기
				sum++;
			}
		}
		return sum;
	}
}
