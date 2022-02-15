import java.util.Scanner;

public class bj_1259_팰린드롬수 {
	public static void main(String[] args) {

		// 입력받기

		Scanner sc = new Scanner(System.in);

		while (true) {

			String num = sc.next();

			String ans = "";
			
			// 마지막에 0이 오므로, 그 전까지 반복하기

			if (num.equals("0"))
				break;

			// 문자열이 한자릴일 경우에는 무조건 팰린드롬이 됨

			if (num.length() == 1) {
				System.out.println("yes");

			} else {

				for (int i = 0; i < num.length() / 2; i++) {

					// 중간에 팰린드롬이 아니라는 것이 드러나면 더 이상 반복할 필요가 없으므로 break

					if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
						ans = "no";
						break;

					// 반복문이 다 돌 때까지 동일한지 확인하기 위해 continue

					} else {
						ans = "yes";
						continue;
					}
				}

				// 출력하기

				System.out.println(ans);
			}
		}
	}
}
