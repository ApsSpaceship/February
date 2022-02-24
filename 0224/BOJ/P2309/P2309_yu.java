import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class bj_2309_일곱난쟁이 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// arraylist 생성

		List<Integer> height = new ArrayList<>();

		int sum = 0;

		// 입력받아서 추가 및 합계 구하기
		for (int i = 0; i < 9; i++) {

			int dwalf = sc.nextInt();

			height.add(dwalf);

			sum += dwalf;
		}

		// 100 초과값
		int number = sum - 100;

		// 원소 두 개 더한 값이 초과값이면 제거
		outer: for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				
				// 삭제 후 인덱스가 변화하는 것 유의하기
				if (height.get(i) + height.get(j) == number) {

					if (i > j) {
						height.remove(j);
						height.remove(i - 1);
					} else {
						height.remove(i);
						height.remove(j - 1);
					}

					break outer;

				}
			}
		} // for end

		// 정렬
		height.sort(Comparator.naturalOrder());

		// 출력

		for (int i = 0; i < height.size(); i++) {

			System.out.println(height.get(i));
		}

	}

}
