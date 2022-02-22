import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class baekjoon_2628_종이자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(); // 가로
		int h = sc.nextInt(); // 세로
		int tc = sc.nextInt();
		List<Integer> arrx = new ArrayList<>(); // 세로로 자르는
		List<Integer> arry = new ArrayList<>(); // 가로로 자르는
		for (int tn = 1; tn <= tc; tn++) {
			int fi = sc.nextInt();
			int si = sc.nextInt();
			if (fi == 0) {
				arry.add(si);
			} else {
				arrx.add(si);
			}
		}
		arrx.add(0);
		arry.add(0);
		arrx.add(d);
		arry.add(h);
		Collections.sort(arrx);
		Collections.sort(arry);
		int maxx = 0;
		int maxy = 0;
		//System.out.println(arrx.toString());
		
		for(int i = 1; i < arrx.size(); i++) {
			maxx = Math.max(maxx, arrx.get(i)-arrx.get(i-1));
		}
		for(int j = 1; j < arry.size(); j++) {
			maxy = Math.max(maxy, arry.get(j)-arry.get(j-1));
		}
		
		System.out.println(maxx * maxy);
		
		
		
		
		
		
		

	}

}
