import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2628 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 가로
		int x = sc.nextInt();
		// 세로
		int y = sc.nextInt();
		// 자를 선의 수
		int n = sc.nextInt();
		// 선의 인덱스
		ArrayList<Integer> r = new ArrayList<>();
		ArrayList<Integer> c = new ArrayList<>();
		// 시작점
		r.add(0);
		c.add(0);
		for(int i =0; i<n; i++) {
			int rc = sc.nextInt();
			//  가로로 자르면 높이에 영향을 주고, 세로로 자르면 가로넓이에 영향을 준다.
			if(rc == 0) r.add(sc.nextInt());
			else c.add(sc.nextInt());
		}
		// 끝점
		r.add(y);
		c.add(x);
		// 오름차순 정렬
		Collections.sort(r);
		Collections.sort(c);
		// 높이 차, 가로넓이 차 배열
		int[] height = new int [r.size()-1];
		int[] width = new int[c.size()-1];
		for(int i = 1; i< r.size(); i++) {
			height[i-1] = r.get(i) - r.get(i-1);
		}
		for(int i = 1; i < c.size(); i++) {
			width[i-1] = c.get(i) - c.get(i-1);
		}
		int maxV = 0;
		for(int i = 0; i<height.length; i++) {
			for(int j = 0; j<width.length; j++) {
				if(maxV < height[i] * width[j]) maxV = height[i] * width[j];
			}
		}
		System.out.println(maxV);
	}
}
