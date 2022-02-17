import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_1859_백만장자2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt(); // 테스트 케이스
		for (int tn = 1; tn <= tc; tn++) {
			int size = sc.nextInt();
			//리스트로 입력받기
			List<Integer> arr = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				int a = sc.nextInt();
				arr.add(a);
			}
			long sum = 0;
			boolean flag = true;
			while (flag) {
				float max = 0;
				int maxi = 0;
				//최댓값에 해당하는 인덱스 찾기
				for (int i = 0; i < arr.size(); i++) {
					if (max < arr.get(i)) {
						max = arr.get(i);
						maxi = i;
					}
				}
				//최댓값 기준 왼쪽부분 최댓값과의 차 구해서 더하기
				for (int i = 0; i < maxi; i++) {
					sum = sum + (arr.get(maxi) - arr.get(i));
				}
				//최댓값 이후 부분은 그 중에서도 또 최댓값을 찾아야 하므로 최댓값을 기준으로 리스트를 자르고 반복
				if(maxi + 1 < arr.size()) {
					arr = arr.subList(maxi+1, arr.size());
				}else {
					flag = false;
				}			
			}
			System.out.println("#" + tn + " " + sum);
		}
	}

}
