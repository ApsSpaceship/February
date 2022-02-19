package Study_20220218_24;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_14696_딱지놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();// 총 라운드 수
		for (int r = 0; r < N; r++) {
			int[] A = new int[5]; // 인덱스 1~4 사용
			int[] B = new int[5];
			char ans = 'D'; // 답은 무승부로 초기화
			int a = sc.nextInt();
			for (int i = 0; i < a; i++) { // a만큼
				A[sc.nextInt()]++;
			}
			int b = sc.nextInt();
			for (int i = 0; i < b; i++) { // b만큼
				B[sc.nextInt()]++;
			}

			for (int i = 4; i > 0; i--) { // 뒤부터 개수 비교
				if (A[i] > B[i]) {
					ans = 'A';
					break;
				} else if (A[i] < B[i]) {
					ans = 'B';
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
