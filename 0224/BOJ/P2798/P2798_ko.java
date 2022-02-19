package Study_20220218_24;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2798_블랙잭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 카드 개수
		int M = sc.nextInt(); // 최댓값
		int[] card = new int[N];
		int sum = 0;
		int sumM = 0; // sum최대
    
		//입력
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		
		//계산
		Arrays.sort(card); //정렬
		for (int i = N - 1; i >= 2; i--) //맨 뒤부터 카드 3장 골라서
			for (int j = i - 1; j >= 1; j--)
				for (int k = j - 1; k >= 0; k--)
					if ((sum = card[i] + card[j] + card[k]) <= M) { //비교
						sumM = Math.max(sumM, sum); //최댓값 찾으면 끝
						break;
					}
    
    //출력
		System.out.print(sumM);
	}
}
