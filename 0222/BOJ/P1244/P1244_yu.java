import java.util.Scanner;

public class bj_1244_스위치켜고끄기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 전구세팅
		int L = sc.nextInt();

		int[] light = new int[L];

		for (int l = 0; l < L; l++) {

			light[l] = sc.nextInt();
		}

		// 학생
		int stu = sc.nextInt();

		for (int s = 0; s < stu; s++) {

			int gender = sc.nextInt();
			int num = sc.nextInt() - 1;

			// 남학생
			if (gender == 1) {

				for (int i = num; i < L; i += num + 1) {

					light[i] = light[i] == 1 ? 0 : 1;
				}

			}

			// 여학생
			if (gender == 2) {

				light[num] = light[num] == 1 ? 0 : 1;

				for (int i = 1; i < L; i++) {

					if (num - i >= 0 && num + i < L && light[num - i] == light[num + i]) {

						light[num - i] = light[num - i] == 1 ? 0 : 1;
						light[num + i] = light[num + i] == 1 ? 0 : 1;

					} else {
						break;
					}
				}

			}

		} // for
		
		// int i가 1부터 시작해야한다는 것 유의하기

		for (int i = 1; i <= light.length; i++) {
			System.out.print(light[i-1] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}

//		if (light.length < 21) {
//			for (int x : light) {
//				System.out.print(x + " ");
//			}
//		} else {
//
//			outer: for (int i = 0; i < light.length; i += 20) {
//				for (int j = 0; j < 20; j++) {
//					if (i + j >= light.length) {
//						break outer;
//					}
//
//					System.out.print(light[j + i] + " ");
//				}
//				System.out.println();
//
//			}
//		}
	}

}
