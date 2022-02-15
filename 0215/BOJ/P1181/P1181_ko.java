package Study_20220211_17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solvedac_1181_단어정렬2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //문자열 개수
		String[] words = new String[N];

		for (int i = 0; i < N; i++) { //문자열 개수 만큼 입력
			words[i] = sc.next();
		}
		
		Arrays.sort(words, new Comparator<String>() { //정렬
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length()) { //앞 친구 길이가 더 작으면 자리 안 바꿈
					return -1;
				} else if (o1.length() == o2.length()) { //길이가 같으면 비교함
					return o1.compareTo(o2);
				} else {
					return 1; //자리 바꿈
				}
			}
		});

		System.out.print(words[0]);
		for (int i = 1; i < N; i++) {
			if (words[i].equals(words[i - 1])) //같으면 출력 안 함
				continue;
			System.out.printf("\n%s", words[i]);
		}
  }
}
