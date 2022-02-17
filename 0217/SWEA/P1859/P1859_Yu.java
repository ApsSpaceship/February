import java.util.Scanner;

public class swea_1859_백만장자프로젝트 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			// 각 날의 매매가
			int N = sc.nextInt();
			long sum = 0;

			// 배열만들기
			int[] price = new int[N];

			// 입력받기
			for (int n = 0; n < N; n++) {

				price[n] = sc.nextInt();
			}

			// 뒤에서 부터 비교하기. 최대값을 맨 마지막 인덱스 값으로 지정
			int max = price[N - 1];

			for (int i = N - 2; i >= 0; i--) {

				// 최대값보다 작으면 사야함
				if (price[i] < max) {
					sum += max - price[i];
				} else {
					// 아니면 최대값을 변화시켜줌
					max = price[i];
				}

			}

			// 출력
			System.out.println("#" + tc + " " + sum);

		}
	}

}
