package SWEA_220215;

import java.util.Scanner;

public class String_간단한369게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //숫자 입력
		
		for (int num = 1; num <= N; num++) { //숫자 만큼
			int count = 0; //박수 개수 초기화

			if (num > 100) { //숫자가 100보다 큰 경우
				count = isClap(100, num); //계산 시작 단위 수는 100
			} else if (num > 10) { //10보다 큰 경우
				count = isClap(10, num); //계산 시작 단위 수는 10
			} else if ((num == 3 || num == 6 || num == 9)) {
				count = 1; //3,6,9일 때 박수 1번
			}
			
			if (count == 0) { //3,6,9가 없다면 숫자 출력
				System.out.print(num);
			}
			
			while (count > 0) { //박수 개수 만큼
				System.out.print("-"); //박수
				count--;
			}

			System.out.print(" "); //공백 출력
		}

	}

	public static int isClap(int digit, int num) { //박수 개수 세기
		int count = 0;
		while (digit > 0) { //앞자리부터 3,6,9라면 박수 개수 증가
			if (num / digit == 3 || num / digit == 6 || num / digit == 9) {
				count++;
			}
			num %= digit; //앞자리 제거
			digit /= 10; //자릿수 감소
		}
		return count; //박수 개수 리턴
	}

}
