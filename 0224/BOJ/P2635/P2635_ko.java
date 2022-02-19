package Study_20220218_24;

import java.util.Scanner;

public class BOJ_2635_수이어가기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count;
		int idx;
		int cMax = 0;
		int[] numsMax = new int[30000]; //그냥 넉넉히 잡음
		int[] nums = new int[30000];
		
		//계산
		for (int i = N; i >= (N+1) / 2; i--) {// 처음 뺄 값은 절반보다 크게
			count = 1; // 최소 N은 있음
			idx = 0;
			nums[idx++] = N; // 매번 배열 0은 N임
			nums[idx] = i; // 매번 배열 1은 처음 뺄 값
			while (nums[idx++] >= 0) { // 전 인덱스가 0보다 크다면
				count++; // 개수 증가
				nums[idx] = nums[idx - 2] - nums[idx - 1]; // 이번 인덱스 계산
			}
			if (cMax < count) {// count개수 맥스면 numsMax에 저장
				cMax = count;
				for (int j = 0; j < count; j++) {
					numsMax[j] = nums[j];
				}
			}
		}
		
		//출력
		System.out.println(cMax);
		for (int i = 0; i < cMax; i++) {
			System.out.printf("%d ", numsMax[i]);
		}
	}
}
