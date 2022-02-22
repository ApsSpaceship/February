import java.util.Scanner;

public class baekjoon_2477_참외밭2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			sc.nextInt();
			arr[i] = sc.nextInt();
		}
		int max1 = 0;
		int max2 = 0;
		int max1idx = 0;
		int max2idx = 0;
		int mididx = 0;
		int mid2idx = 0;
        //가로,세로방향 나눠서 최댓값과 해당 인덱스를 찾는다.
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				if(max1<arr[i]) {
					max1 = arr[i];
					max1idx = i;
				}
			}else {
				if(max2<arr[i]) {
					max2 = arr[i];
					max2idx = i;
				}
			}
		}
		//빼줘야할 작은 네모에 해당하는 인덱스는 (최댓값 인덱스 +3)%6의 값을 가진다. // 육각형 이므로 6으로 나눔
		mididx = (max1idx+3)%6;
		mid2idx = (max2idx+3)%6;
			
		System.out.println((max1 * max2 -arr[mididx] * arr[mid2idx])*n);
		
		

	}
}
