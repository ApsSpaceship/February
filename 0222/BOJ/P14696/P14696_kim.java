import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_14696_딱지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			//1~4번 인덱스 사용하기 위해 5로 크기 지정
			int[] p1 = new int[5]; 
			int[] p2 = new int[5]; 
			int p1size = sc.nextInt();
			for(int i = 0; i < p1size; i++) {
				p1[sc.nextInt()]++;
			}
			int p2size = sc.nextInt();
			for(int i = 0; i < p2size; i++) {
				p2[sc.nextInt()]++;
			}
			if(p1[4]>p2[4]) {
				System.out.println("A");
			}else if(p1[4] == p2[4]) {
				if(p1[3]>p2[3]) {
					System.out.println("A");
				}else if(p1[3]==p2[3]) {
					if(p1[2]>p2[2]) {
						System.out.println("A");
					}else if(p1[2] == p2[2]) {
						if(p1[1] > p2[1]) {
							System.out.println("A");
						}else if(p1[1] == p2[1]) {
							System.out.println("D");
						}else {
							System.out.println("B");
						}
					}else {
						System.out.println("B");
					}
				}else {
					System.out.println("B");
				}
			}else {
				System.out.println("B");
			}
		}
	}

}
