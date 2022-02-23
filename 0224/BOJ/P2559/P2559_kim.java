import java.util.Scanner;

public class baekjoon_2559_수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int d = sc.nextInt(); // 연속적인 날짜
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		//체크할 수 있는 범위
		for(int i = 0; i < arr.length-d+1; i++) {
			int sum = 0;
			for(int j = i; j < i+d; j++) {
				sum += arr[j];
			}
			max = Math.max(sum, max);
		}
		System.out.println(max);
	}

}
