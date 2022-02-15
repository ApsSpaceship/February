package Study_20220211_17;

import java.util.Scanner;

public class SWEA_1859_백만장자프로젝트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스 수
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 매매가 개수
			int[] nums = new int[N];
			for (int i = 0; i < N; i++) { //숫자 N개 입력
				nums[i] = sc.nextInt();
			}
			System.out.printf("#%d %d\n", tc, findMax(0, N-1, nums)); //테스트케이스 번호, 번 돈 출력
		}

	}
	
	// 최댓값 구해서 그 앞에는 다 사고 최댓값날 팔아~
	public static long findMax(int start, int finish, int[] nums) {
		long money = 0;
		while (start < finish) { //시작점이 끝점보다 작을 때까지
			int max = 0;
			long sum = 0;
			int maxIdx = 0;
			for (int i = finish; i >= start; i--) { //맨 뒤에서부터 최댓값 찾기(반복 횟수를 줄이기 위해)
				if (max < nums[i]) {
					max = nums[i];
					maxIdx = i; //최댓값의 인덱스도 저장해주기
				}
			}
			for (int i = start; i < maxIdx; i++) { //시작점에서 최댓값 인덱스 전까지 값 더해주기
				sum += nums[i];
			}
			money += (long)max * (maxIdx - start) - sum; //번 돈은 매도가-매수가
			start = maxIdx + 1; //최댓값의 인덱스 다음을 시작점으로 변경
		}

		return money; // 번 돈 리턴
	}

}
