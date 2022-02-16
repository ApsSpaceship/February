package SWEA_220215;

import java.util.Scanner;

public class String_간단한369게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //숫자 입력
		
		for (int num = 1; num <= N; num++) { //숫자 만큼
			int count = isClap(num);

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

	public static int isClap(int num) { //박수 개수 세기
		int count = 0;
		while (num > 0) { //1의자리가 3,6,9라면 박수 개수 증가
			if (num %10 == 3 || num % 10 == 6 || num % 10 == 9) {
				count++;
			}
			num /= 10; //자릿수 감소
		}
		return count; //박수 개수 리턴
	}

}
