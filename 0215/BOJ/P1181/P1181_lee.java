import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		// 중복제거용 HashSet
		HashSet<String> set = new HashSet<>();
		// 입력받기 
		for(int i =0; i<N; i++) {
			set.add(br.readLine());
		}
		// HashSet -> String[]
		String[] arr = set.toArray(new String[0]);
		// 정렬
		Arrays.sort(arr, new Comparator<String>() {
			//사용자 정의 가능
			@Override
			public int compare(String s1, String s2) {
				// 길이가 같으면 사전형으로 비교
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				// 길이가 다르면 길이 차이로 비교
				else {
					return s1.length() - s2.length();
				}
			}
			
		});
		// 출력
		for(String s : arr) {
			System.out.println(s);
		}
		
	}

}
