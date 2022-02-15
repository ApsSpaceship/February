import java.util.Scanner;

public class bj_1085_직사각형에서탈출 {
	public static void main(String[] args) {

		// 변수 입력받기
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		// 3가지 경우를 비교하기.
		// min1 은 0으로 갔을 때의 최솟값
		// min2는 각 열과 행의 최대로 갔을 때의 값들 중 최솟값
		
		int min1 = Integer.min(x, y);
		int min2 = Integer.min(w - x, h - y);

		// 최종적으로 가장 작은 것 구하기
		
		int ans = Integer.min(min1, min2);

		// 출력
		
		System.out.println(ans);

	}

}
