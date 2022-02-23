import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2798_블랙잭2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 카드 개수
		int max = sc.nextInt(); // 최대합
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int fin = 0;
		//3장을 겹치지 않게 뽑고 그 중 max값을 넘지 않는 최대값을 찾는다.
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				if(i!=j) // 두번째 카드가 첫번째 카드랑 달라야 함  
				{
					for(int k = 0; k < arr.length; k++) {
						if(i!= k && k != j) // 세번째 카드가 첫번째, 두번째 카드랑 달라야 한다. 
						{
							sum = arr[i] + arr[j] + arr[k];
							if(sum <= max) {
								fin = Math.max(sum, fin);
							}
						}
					}
				}
			}
		}
		
		System.out.println(fin);
		

	}
}
