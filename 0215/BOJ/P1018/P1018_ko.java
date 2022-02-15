package Study_20220211_17;

import java.util.Scanner;

public class Solvedac_1018_체스판다시칠하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 맵 세로 길이
		int M = sc.nextInt(); // 맵 가로 길이
		int min = 64; // 8x8체스판이므로 넘을 수 없는 값인 64로 초기화

		char[][] cMap = new char[N][M]; // 맵 생성
		for (int i = 0; i < N; i++) { // 맵 입력
			cMap[i] = sc.next().toCharArray();
		}

		for (int i = 0; i <= N - 8; i++) { // 맵의 범위를 벗어나면 안 되므로 N-8, M-8까지 8x8로 자름
			for (int j = 0; j <= M - 8; j++) {
				min = Math.min(chess(i, j, cMap, 'B', 'W'), min); // 왼쪽 위가 W/B인 경우
				min = Math.min(chess(i, j, cMap, 'W', 'B'), min); // 왼쪽 위가 B/W인 경우
			}
		}
		System.out.println(min); // 최솟값 출력

	}

	public static int chess(int x, int y, char[][] cMap, char B, char W) {
		int countBF = 0;
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if ((i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) && cMap[i][j] == W) { //x,y좌표가 둘 다 짝수거나 홀수인데 W인 친구들은 B여야함
					countBF++;
				}
				if ((i % 2 == 1 && j % 2 == 0 || i % 2 == 0 && j % 2 == 1) && cMap[i][j] == B) { //x,y좌표 중 하나만 짝수인데 B인 친구들은 W여야함
					countBF++;
				}
			}
		}
		return countBF;
	}
}
