package study4_0215_17;

import java.util.Scanner;

public class SWEA_2005_파스칼 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int size = sc.nextInt();
			//배열을 하나 크게 만들었다.
			int[][]arr = new int[size+1][size+1];
			arr[1][1] = 1;
			for (int i = 2; i < arr.length; i++) {
				for (int j = 1; j < arr.length; j++) {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}			
			//0이 아닌 부분만 출력하였다.
			System.out.println("#"+tn);
			for(int i = 1 ; i < arr.length; i++) {
				for(int j = 1; j < arr.length; j++) {
					if(arr[i][j] != 0) {
						System.out.print(arr[i][j] +" ");
					}
				}System.out.println();
			}		
		}	
	}
}
