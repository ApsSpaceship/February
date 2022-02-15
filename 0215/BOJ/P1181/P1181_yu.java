import java.util.Scanner;

public class bj_1181_단어정렬 {
	public static void main(String[] args) {

		// * 주의 * 틀린 풀이!!!!!!!

		// 입력받기

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// n개의 배열만들기

		String[] word = new String[N];

		// 입력받아서 배열에 넣기

		for (int tc = 0; tc < N; tc++) {

			word[tc] = sc.next();
		}

		// 중복되어 있는 것을 없애주기

		for (int i = 0; i < N - 1; i++) {

			for (int j = i + 1; j < N; j++) {

				if (word[i].equals(word[j])) {

					// NullPointerException error
					// word[j].replace(word[j], null);

					// word[i].replace(word[i], "");
					// word[i].replace(word[i], "0");    replace 제대로 익히기
					word[j] = "0";
				}

			}
		}

		// 배열 정렬(길이 순)
		
		for (int i = 0; i < N; i++) {
			
			for (int j = 1; j < N - i; j++) {

				// 같을 때를 먼저 써줘야함. 밑으로 가면 다른 애들만 있어서 들어오지를 않음
				
				if (word[j - 1].length() == word[j].length()) {
					if (word[j - 1].compareTo(word[j]) > 0) {
						String tem = word[j - 1];
						word[j - 1] = word[j];
						word[j] = tem;
					}
				}

				if (word[j - 1].length() > word[j].length()) {
					String temp = word[j - 1];
					word[j - 1] = word[j];
					word[j] = temp;


				}

			}
		} // 정렬 끝

		// 출력

		for (int i = 0; i < N; i++) {

			if (!word[i].equals("0"))
				System.out.println(word[i]);
		}
	}

}
