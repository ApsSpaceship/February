import java.util.Scanner;

public class swea_2005_파스칼의삼각형 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// T개만큼 입력받기

		for (int tc = 1; tc <= T; tc++) {

			int num = sc.nextInt();

			// 2차원 배열 만들기
			int[][] pascal = new int[num][num];

			// 맨 처음 1은 규칙이 없음
			pascal[0][0] = 1;

			for (int i = 1; i < num; i++) {
				for (int j = 0; j <= i; j++) {

					// 1이 출력되어야 하는 부분
					if (j == 0 || i == j) {
						pascal[i][j] = 1;

						// 합이 출력되어야 하는 부분 (기준으로 부터 왼쪽상단 및 바로 위 숫자 더함)
					} else {
						pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
					}
				}
			} // for문 끝

			System.out.println("#" + tc);
			for (int i = 0; i < num; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(pascal[i][j]);
				}
				System.out.println();
			}

		}

	}
}
