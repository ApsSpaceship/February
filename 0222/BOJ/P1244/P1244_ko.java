package Study_20220218_24;

import java.util.Scanner;

public class BaekJoon_1244_스위치켜고끄기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int swNum = sc.nextInt(); // 스위치 개수 입력
		int[] sw = new int[swNum + 1]; // 스위치가 1부터 시작이어서 배열도 1~스위치개수 인덱스 사용할거임
		for (int i = 1; i <= swNum; i++) { // 스위치 상태 입력
			sw[i] = sc.nextInt();
		}
		int stNum = sc.nextInt(); // 학생 수 입력
		int[] st = new int[stNum];
		int[] stSw = new int[stNum];
		for (int i = 0; i < stNum; i++) {
			st[i] = sc.nextInt(); // 학생 성별 입력(남:1, 여:2)
			stSw[i] = sc.nextInt(); // 해당 학생의 스위치 번호
		}

		for (int i = 0; i < stNum; i++) { // 학생 수 만큼
			if (st[i] == 1) { // 남학생이면
				for (int j = stSw[i]; j <= swNum; j += stSw[i]) { // 배수 스위치 토글
					sw[j] = 1 - sw[j];
				}

			} else { // 여학생이면
				sw[stSw[i]] = 1 - sw[stSw[i]]; // 본인 스위치 토글
				for (int j = 1; j <= Math.min(swNum - stSw[i], stSw[i] - 1); j++) {// 갈 수 있는 최대 만큼
					if (sw[stSw[i] - j] != sw[stSw[i] + j]) // 양 옆이 같지 않으면 멈춤
						break;
					sw[stSw[i] - j] = 1 - sw[stSw[i] - j]; // 양 옆 같다면 토글
					sw[stSw[i] + j] = 1 - sw[stSw[i] + j];
				}
			}
		}

		for (int i = 1; i <= swNum; i++) { // 스위치 상태 출력
			System.out.printf("%d ", sw[i]);
			if (i % 20 == 0) {
				System.out.println();
			}
		}
	}
}
