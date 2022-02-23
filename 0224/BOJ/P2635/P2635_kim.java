import java.util.Scanner;

public class baekjoon_2635_수이어가기 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0; //max
		int search = 0; // 가장 큰 개수가 나오는 두번째 숫자.
		//두번째 수가 될 수 있는 범위를  다 돌리면서 최대 길이를 찾는다.
		for(int i = n/2 ; i <= n; i++) {
			int check = 0;
			int a = n; // 입력받은 수
			int b = i; // 두번째 수
			int c = 1; // while문을 돌아야 해서 임의로 1이라는 값을 줌
			//뺀 값이 음수가 나오기 전까지 while문 돌림
			while(c >= 0) {
				c = a - b;
				a = b;
				b = c;	
				check++;
			}
			if(count < check) {
				count = check;
				search = i;	// 최대 개수가 나온 두번째 숫자인 i를 search에 저장		
			}
		}
		int[] arr = new int[count+1]; // 뺀 횟수보다 +1만큼의 수가 나옴
		arr[0] = n;
		arr[1] = search;
		for(int i = 2; i < arr.length; i++){
			arr[i] = arr[i-2] - arr[i-1];
		}
		System.out.println(arr.length);
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
		
				
	}

}
