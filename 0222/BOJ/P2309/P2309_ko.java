package Study_20220218_24;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309_일곱난쟁이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] small = new int[9];
		int sum;
		int count;

		// 입력
		for (int i = 0; i < 9; i++) {
			small[i] = sc.nextInt();
		}
		
		// 계산
		Arrays.sort(small); // 오름차순 정렬
		find: for (int i = 0; i < 8; i++) { // 안뽑을 small1
			for (int j = i + 1; j < 9; j++) { // 안뽑을 small2
				sum = 0; // 초기화
				count = 0;
				for (int k = 0; k < 9; k++) {
					if (k != i && k != j) { // 뽑을 애들은
						sum += small[k]; // 더해줌
						if (sum > 100) // 더하다가 100넘으면 그만
							break;
						count++;
					}
				}
				if (count == 7 && sum == 100) { // 7명 합이 100이면
					for (int k = 0; k < 9; k++) {// 앞에서부터 출력
						if (k != i && k != j) {
							System.out.println(small[k]);
						}
					}
					break find; // 찾았으니까 반복문 그만
				}
			}
		}
	}
}
