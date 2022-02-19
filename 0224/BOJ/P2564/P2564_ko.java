package Study_20220218_24;

import java.util.Scanner;

public class BOJ_2564_경비원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력
		int y = sc.nextInt(); // 가로
		int x = sc.nextInt(); // 세로
		int N = sc.nextInt(); // 상점 개수
		int sum = 0;
		int[][] store = new int[N + 1][N + 1];
		int[] dir = new int[N + 1]; // 상점+동근 방향
		int[] dis = new int[N + 1];// 상점+동근 좌표
		for (int i = 0; i < N + 1; i++) {
			dir[i] = sc.nextInt();
			dis[i] = sc.nextInt();
			// 좌표 저장
			if (dir[i] == 1) { // 북
				store[i][1] = dis[i];
			} else if (dir[i] == 2) { // 남
				store[i][0] = x;
				store[i][1] = dis[i];
			} else if (dir[i] == 3) { // 서
				store[i][0] = dis[i];
			} else {// 동
				store[i][0] = dis[i];
				store[i][1] = y;
			}
		}

		// 계산
		for (int i = 0; i < N; i++) {
			if (dir[N] > 2 && dir[i] > 2 && Math.abs(dir[N] - dir[i]) == 1) { // 3,4로 마주보는경우(서동)
				sum += Math.min(y + store[N][0] + store[i][0], y + 2 * x - store[N][0] - store[i][0]); //y+동근x+상점x나 y+x*2-(동근x+상점x)로 돌아가는 것 중 작은 것
			} else if (dir[N] < 3 && dir[i] < 3 && Math.abs(dir[N] - dir[i]) == 1) {// 1,2로 마주보는경우(북남)
				sum += Math.min(x + store[N][1] + store[i][1], x + 2 * y - store[N][1] - store[i][1]); //x+동근y+상점y나 x+y*2-(동근y+상점y)로 돌아가는 것 중 작은 것
			} else {
				sum += Math.abs(store[N][0] - store[i][0]) + Math.abs(store[N][1] - store[i][1]); //x차이 절댓값 + y차이 절댓값
			}
		}
    
    //출력
		System.out.print(sum);
	}
}
