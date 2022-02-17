package Study_20220218_24;

import java.util.Scanner;

public class BOJ_2477_참외밭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int[] farm = new int[6];
		int max = 0;
		int maxIdx = 0;

		for (int i = 0; i < 6; i++) {
			sc.nextInt(); // 방향은 그냥 버리기
			farm[i] = sc.nextInt(); // 농장 테두리값
			if (max < farm[i]) { // 제일 긴거 저장
				maxIdx = i;
				max = farm[i];
			}
		}
    
		int longIdx = (farm[(maxIdx + 5) % 6] > farm[(maxIdx + 1) % 6]) ? -1 : 1; // max옆 긴 애가 max전 인덱스인지 후 인덱스인지

		// max*그 옆 긴 애 - 짧은 부분*2 (짧은 부분은 max옆 긴 애 방향으로 + 2,3인덱스)
		if (longIdx > 0)
			System.out.println(
					K * (farm[maxIdx] * farm[(maxIdx + 1) % 6] - farm[(maxIdx + 3) % 6] * farm[(maxIdx + 4) % 6]));
		else
			System.out.println(
					K * (farm[maxIdx] * farm[(maxIdx + 5) % 6] - farm[(maxIdx + 2) % 6] * farm[(maxIdx + 3) % 6]));//(3=15%6, 2=20%6)
	}
}
