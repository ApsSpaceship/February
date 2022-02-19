package Study_20220218_24;

import java.util.Scanner;
import java.util.TreeSet;

public class BOJ_2628_종이자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt(); // 가로길이 -> 1들어오면 잘림
		int x = sc.nextInt(); // 세로 길이 -> 0들어오면 잘림

		int slash = sc.nextInt(); //자를 횟수
		TreeSet<Integer> slashX = new TreeSet<>(); //정렬+중복제거
		TreeSet<Integer> slashY = new TreeSet<>();
		slashX.add(0);//맨 앞 값은 0
		slashY.add(0);
		for (int i = 0; i < slash; i++) {
			if (sc.nextInt() == 0) // 방향이 0이면
				slashX.add(sc.nextInt()); // X트리셋에 넣음
			else // 방향이 1이면
				slashY.add(sc.nextInt()); // Y트리셋에 넣음
		}

		System.out.println(finalMax(slashX, x) * finalMax(slashY, y));
	}
	
	//슬래시 값들 이웃한 차이 최댓값
	public static int finalMax(TreeSet<Integer> slashSet, int last) { //처음 맨 마지막 값은 길이
		int finalmax = 0; //최댓값 초기화
		int lastSub;
		while (slashSet.size() > 0) {
			lastSub = slashSet.pollLast(); // 마지막 요소 빼서 이번 요소로
			finalmax = Math.max(finalmax, last - lastSub); // 전 마지막 요소 - 이번 요소
			last = lastSub; // 이번 요소를 전 마지막 요소
		}
		return finalmax; //최댓값 리턴
	}
}
