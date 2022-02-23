import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class baekjoon_2309_일곱난쟁이 {
	static boolean[] sel = new boolean[9];
	static int[] arr;
	static int sum = 100;
	static List<Integer> choose = new ArrayList<>();

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		check(0);
		Collections.sort(choose); // 오름차순으로 정리
		for(int i = 0; i < choose.size(); i++) {
			System.out.println(choose.get(i));
		}
	}
	
	public static void check(int idx) {
		if(idx == sel.length) {
			int checksum = 0; // 난쟁이의 키 합
			List<Integer> midcheck = new ArrayList<>();
			for(int i = 0; i < arr.length; i++) {
				if(sel[i]) { // 이번 부분집합에 포함된 난쟁이만 더해줌
					checksum += arr[i];
					midcheck.add(arr[i]);
				}
			}
			//7명의 난쟁이의 키 합이 100이면 choose 리스트에 저장.
			if(checksum == 100 && midcheck.size() == 7) {
				choose = midcheck;				
			}
			return ;		
		}	
		
		sel[idx] = true;
		check(idx+1);
		sel[idx] = false;
		check(idx+1);
	}

}
