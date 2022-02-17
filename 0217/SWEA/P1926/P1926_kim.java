package day0215;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1926_369게임final3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] arr = new String[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.toString(i + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			//만약 arr[i]가 3 or 6 or 9를 포함하고 있다면 그 길이만큼 돌면서 숫자에 3,6,9가 몇 개 포함되어 있는지 체크한다. 
			if (arr[i].contains("3") || arr[i].contains("6") || arr[i].contains("9")) {
				int lennum = arr[i].length();
				String ans="";
				for (int j = 0; j < lennum; j++) {
					if (arr[i].charAt(j) == '3' || arr[i].charAt(j) == '6' || arr[i].charAt(j) == '9') {
						ans = ans + "-";
					}
				}
				arr[i] = ans;
			}		
		}
		for(String i : arr) {
			System.out.print(i+" ");
		}
	}
}
