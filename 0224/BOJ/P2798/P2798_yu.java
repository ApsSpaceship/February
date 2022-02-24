import java.util.Scanner;

public class bj_2798_블랙잭 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 카드 개수
		int N = sc.nextInt();

		int limit = sc.nextInt();

		// 카드 입력받기

		int[] card = new int[N];

		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}

		// 카드 3장 고르고 조건 확인

		int max = 0;

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (card[i] + card[j] + card[k] <= limit) {

						if (max < card[i] + card[j] + card[k]) {
							max = card[i] + card[j] + card[k];
						}
					}
				}
			}
		}

		System.out.println(max);

	}
}
