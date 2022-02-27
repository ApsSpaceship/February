import java.util.Scanner;

public class P2477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//  1m^2 면적의 참외 수
		int K = sc.nextInt();
		int max1 = 0;
		int max1Idx = 0;
		// 최대 높이 또는 넓이의 Idx를 구해 3번째 뒤 idx를 구한다. 
		int max2 = 0;
		// 최대 높이 또는 넓이의 Idx를 구해 3번째 뒤 idx를 구한다. 
		int max2Idx = 0;
		int[] arr = new int[6];
		for(int i =0; i < 6; i++) {
			// 방향은 사용하지 않는다.
			sc.nextInt();
			int length = sc.nextInt();
			if(i%2 == 0) {
				if(max1 <= length) {
					max1 = length;
					max1Idx = i;
				}
			}else {
				if(max2 <= length) {
					max2 = length;
					max2Idx = i;
				}
			}
			arr[i] = length;
		}
		max1Idx = (max1Idx+3)%6;
		max2Idx = (max2Idx+3)%6;
		int ans = (max1 * max2 - arr[max1Idx]*arr[max2Idx])*K;
		System.out.println(ans);
		sc.close();
	}
}
