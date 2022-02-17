import java.util.Arrays;
import java.util.Scanner;

public class string_1926_간단한369게임 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int n = 1; n <= N; n++) {

			// 숫자를 문자로 바꿔서 입력받기
			
			String num = Integer.toString(n);

			int cnt = 0;

			// 한자리 수는 3의 배수만 - 처리
			
			if (num.length() == 1) {

				if (num.equals("3")) {
					System.out.print("- ");
				} else if (num.equals("6")) {
					System.out.print("- ");
				} else if (num.equals("9")) {
					System.out.print("- ");
				}
				// 한자리 수면서 3의 배수가 아닌 것들은 그대로 출력
				else {
					System.out.print(n+" ");
				}
				// 2자리 수 이상일 떄
			} else {

				// 자리 수를 나누어 스트링 배열에 넣음
				String[] arr = num.split("");

				// 3, 6, 9가 들어가면 카운트
				for (int j = 0; j < arr.length; j++) {

					if (arr[j].contains("3") || arr[j].contains("6") || arr[j].contains("9")) {
						cnt++;
					}
				}

				// 3,6,9가 없는 수는 그대로 출력
				if (cnt == 0) {
					System.out.print(n + " ");
				} else {
					// 카운트 된 수만큼 - 출력
					for (int i = 1; i <= cnt; i++) {
						System.out.print("-");
					}
					System.out.print(" ");
				}

			} // else 끝

		}

	}
}
