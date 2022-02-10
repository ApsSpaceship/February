import java.util.Scanner;

public class SwExpertAcademy_1984_중간평균값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 수
		int tc = sc.nextInt();
		//테이스 케이스 수 만큼 반복한다.
		for (int tn = 1; tn <= tc; tn++) {
			//점수 10개가 담긴 배열을 만든다.
			float[] nums = new float[10];
			//점수를 입력받는다.
			for (int i = 0; i < nums.length; i++) {
				nums[i] = sc.nextFloat();
			}

			float max = 0;
			//최대 점수가 10000 이하라 10001로 값을 주었다.
			float min = 10001;
			//최댓값 인덱스 담을 변수
			int maxidx = 0;
			//최솟값 인덱스 담을 변수
			int minidx = 0;
			//점수 합
			float sum = 0;
            //최댓값과 최솟값을 구하고 각 값에 해당하는 인덱스를 저장한다.
			for (int i = 0; i < nums.length; i++) {
				if(nums[i] > max) {
					max = nums[i];
					maxidx = i;				
				}if(nums[i] < min) {
					min = nums[i];
					minidx = i;
				}
			}
			//최댓값과 최솟값은 건너뛰고 더해준다.
			for(int i = 0; i < nums.length; i++) {
				if(i == maxidx || i == minidx) {
					continue;				
				}
				sum = sum + nums[i];
			}			
			float avg = sum / 8;
			//소수 첫째자리에서 반올림 -> %0.f
			System.out.printf("#%d %.0f\n", tn, avg);
		}
	}

}
