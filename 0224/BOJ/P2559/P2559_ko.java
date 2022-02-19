package Study_20220218_24;

import java.util.Scanner;

public class BOJ_2559_수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력 및 초기화
		int N = sc.nextInt(); // 숫자 개수
		int K = sc.nextInt(); // 연속될 개수
		int[] nums = new int[N];
		int max = Integer.MIN_VALUE; //입력에 음수 있으므로 짱작은값
		int sum;
		for (int i = 0; i < N; i++)
			nums[i] = sc.nextInt();

		// 계산
		for (int i = 0; i < N - K + 1; i++) {// 시작점에서부터
			sum = 0;
			for (int j = 0; j < K; j++) { // K개 만큼 더해주기
				sum += nums[i + j];
			}
			max = Math.max(max, sum);// 최댓값 구하기
		}

		// 출력
		System.out.print(max);
	}

}
