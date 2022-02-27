import java.util.ArrayList;
import java.util.Scanner;

public class P2635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 첫 번째 수 입력
		int first = sc.nextInt();
		// first/2보다 작은 값의 경우는 무조건 3이다.
		// 따라서 그 외 경우를 전부 따져준다.
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> ans = new ArrayList<>();
		int max = 0;
		for(int i = first/2; i <= first; i++) {
			// 리스트에 넣는다.
			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(first);
			arr.add(i); 
			int pre = arr.get(arr.size()-2);
			int cur = arr.get(arr.size()-1); 
			// 0보다 작아지기 전 까지 넣는다.
			while(pre-cur>=0) {
				arr.add(pre-cur);
				if(pre-cur < 0) break;
				pre = arr.get(arr.size()-2);
				cur = arr.get(arr.size()-1);
			}
			// 크기가 최대인 것을 고르기 위해 정답 리스트를 만들고 넣어 크기를 비교한다.
			if(max < arr.size()) {
				ans.clear();
				for(int j =0; j<arr.size();j++) {
					ans.add(arr.get(j));
				}
				max = arr.size();
			}
		}
		// 출력
		System.out.println(max);
		sb.setLength(0);
		for(int i =0; i< ans.size();i++) {
			sb.append(ans.get(i));
			if(i != ans.size()-1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}

}
