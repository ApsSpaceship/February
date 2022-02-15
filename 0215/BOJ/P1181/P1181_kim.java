package study4_0215_17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_1181_단어정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		String[] array = new String[tc];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}
			
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return Integer.compare(o1.length(), o2.length());
			}		
		});
		
		//중복을 제거하기 위해 리스트 하나 만들고 거기에 중복체크 해 값을 넣어줬습니다.
		List<String> result = new ArrayList<>();
		for(int i = 0; i < array.length; i++) {
			if(result.contains(array[i])) {
				continue;
			}
			result.add(array[i]);
		}
		
		for(String a : result) {
			System.out.println(a);
		}
	
	}

}
