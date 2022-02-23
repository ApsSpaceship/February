import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P2309 {
	static Integer[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		// 중복 제거를 위해 Hashset에 넣는다.
		for(int p = 1; p<= 9; p++) {
			set.add(sc.nextInt());
		}
		// HashSet을 다시 Integer 배열로 만든다.
		arr = set.toArray(new Integer[0]);
		// 오름차순 정렬한다.
		Arrays.sort(arr);
		int sumV = getSum();
		// set 사이즈 구한다.
		int size = set.size();
		// 중복을 제거하고 난 후 크기에 따라 처리한다.
		switch(size) {
		// 7명이면 그대로 출력
		case 7:
			break;
		// 8명이면 그 넘는 키를 제외하고 출력
		case 8:
			int outNum = sumV-100;
			for(int i =0; i<size;i++) {
				if(arr[i] != outNum) 
					System.out.println(arr[i]);
			}
			break;
		// 9명이면 넘는 값을 구해서 두 수의 합과 비교한 다음, 같을 경우 해당하는 두 수를 제거하고 출력
		case 9:
			int sum2 = sumV-100;
			//간편한 제거를 위해 새 리스트를 만든다.
			ArrayList<Integer> list = new ArrayList<>();
			for(int i =0; i < size; i++) {
				list.add(arr[i]);
			}
			// 반복해서 두 수의 합이 넘는 값과 같은 경우, 두 수 빼고 새 리스트에 넣는다.
			loop : for(int i = 0; i < size-1; i++) {
				for(int j = i+1; j < size; j++) {
					if(sum2 == (list.get(i)+list.get(j))) {
						// 일단 i번째 값을 삭제하고 그 값을 두수의 합에서 빼준다.
						sum2 -= list.remove(i);
						// remove를 하고나면 리스트에 변동이 생기므로 남은 리스트에서 남은 값을 찾아 삭제한다.
						for(int k = 0; k < size-1; k++) {
							if(sum2 == list.get(k)) {
								list.remove(k);
								// 삭제하면 전체 반복문을 빠져나온다.
								break loop;
							}
						}
					}
				}
			}
			// 출력
			for(int n : list) System.out.println(n);
			break;
		}
		sc.close();	
	}
	// 전체 합 구하기
	public static int getSum() {
		int sumV =0;
		for(int i = 0; i <arr.length; i++)
			sumV += arr[i];
		return sumV;
	}
}
