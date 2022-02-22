import java.util.Scanner;

public class baekjoon_8320_직사각형을만드는방법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= n; i++) {
			int count = 0;
			//약수의 개수 구하기
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count % 2 == 0) {
				result += count/2;
			}else {
				result += (count/2+1);
			}		
		}
		System.out.println(result);
	}

}
