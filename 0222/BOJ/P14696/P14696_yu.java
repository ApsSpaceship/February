import java.util.Scanner;

public class bj_14696_딱지놀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {

			// 각자의 카드 개수 파악하기 위한 배열
			int[] Aarr = new int[5];
			int[] Barr = new int[5];

			// A의 카드 입력받음
			int A = sc.nextInt();

			for (int an = 0; an < A; an++) {

				Aarr[sc.nextInt()]++;
			}

			// B의 카드 입력받음
			int B = sc.nextInt();

			for (int bn = 0; bn < B; bn++) {

				Barr[sc.nextInt()]++;
			}

//			// 비교
//			String ans = "A";
//
//			if (Aarr[4] != Barr[4]) {
//				if (Aarr[4] > Barr[4]) {
//					ans = "A";
//				} else {
//					ans = "B";
//				}
//			} else if (Aarr[3] != Barr[3]) {
//				if (Aarr[3] > Barr[3]) {
//					ans = "A";
//				} else {
//					ans = "B";
//				}
//			} else if (Aarr[2] != Barr[2]) {
//				if (Aarr[2] > Barr[2]) {
//					ans = "A";
//				} else {
//					ans = "B";
//				}
//			} else if (Aarr[1] != Barr[1]) {
//				if (Aarr[1] > Barr[1]) {
//					ans = "A";
//				} else {
//					ans = "B";
//				}
//			} else {
//				ans = "D";
//			}
//
//			System.out.println(ans);

			String ans = "D";

			for (int i = 4; i > 0; i--) {
				if (Aarr[i] == Barr[i]) {
					continue;
				} else {
					ans = (Aarr[i] > Barr[i] ? "A" : "B");
					break;
				}

			}
			System.out.println(ans);

		}
	}

}
