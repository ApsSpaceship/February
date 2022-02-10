import java.util.Scanner;

public class P1984 {

	public static void main(String[] args) {
		// 입력을 위한 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수 입력
		int T = sc.nextInt();
		// 테스트 케이스 반복 (t는 idx로 출력 예정이라 1~T까지)
		for(int t =1; t <= T; t++) {
			// 최댓값 선언 및 초기화 0
			int maxV = 0;
			// 최솟값 선언 및 초기화 10000 (문제에 주어짐)
			int minV = 10000;
			// 합
			double sumV = 0;
			// 입력받을 숫자 배열(10개씩)
			int[] nums = new int[10];
			for(int i =0; i<10; i++) {
				int num = sc.nextInt();
				nums[i] = num;
				// 합에 더하기
				sumV += num;
				// 최댓값 찾기				
				if(maxV < num) {
					maxV = num;
				}
				// 최솟값 찾기	
				if(minV > num) {
					minV = num;
				}
			}
			// 합에서 최대 최소 빼기
			sumV -= maxV + minV;
			// 평균 구하고 소수점 첫째자리에서 반올림 (int로 형변환)
			int avgV = (int)(sumV/8*10 +5)/10;
			System.out.println("#"+t+" "+avgV);
		}
	}
}
