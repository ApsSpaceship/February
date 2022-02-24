import java.util.Scanner;

public class bj_2559_수열 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 총 일수

		int N = sc.nextInt();

		// 연속되는 날짜

		int K = sc.nextInt();

		// 총 일수만큼 배열에 받기

		int[] days = new int[N];

		for (int i = 0; i < N; i++) {

			days[i] = sc.nextInt();
		}

		// K만큼 합 구하고 최대값 찾기

		// *주의* 음수 있을 때는 0으로 하면 안됨
		int max = Integer.MIN_VALUE;

		// *주의* 인덱스 <= 인 것 항상 유의하고 사용해야함*****
		for (int i = 0; i <= N - K; i++) {

			int sum = 0;

			for (int j = 0; j < K; j++) {

				sum += days[i + j];
			}

			if (sum >= max) {

				max = sum;
			}
			
		}

		// 출력

		System.out.println(max);
	}

}
