

import java.util.Scanner;

public class baekjoon_13300_방배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 학생수
		int max = sc.nextInt(); // 방마다 들어갈 수 있는 최대 인원 수
		int[][] arr = new int[n][2];
		//학년별로 몇명 있는지 체크
		int[] boy = new int[7]; // 학년
	    int[] girl = new int[7]; // 학년
	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j < 2; j++) {
	    		arr[i][j] = sc.nextInt();
	    	}
	    	if(arr[i][0] == 0) {
	    		girl[arr[i][1]]++;
	    	}
	    	else if(arr[i][0] == 1) {
	    		boy[arr[i][1]]++;
	    	}
	    	
	    }
	    int room = 0;
	    for(int i = 1; i < girl.length; i++) {
	    	if(girl[i] == 0) {
	    		continue;
	    	}else if(girl[i] % max == 0) {
	    		room += girl[i] / max;
	    	}else{
	    		room += girl[i] / max + 1;
	    	}
	    }
	    for(int i = 1; i < boy.length; i++) {
	    	if(boy[i] == 0) {
	    		continue;
	    	}else if(boy[i] % max == 0) {
	    		room += boy[i] / max;
	    	}else{
	    		room += boy[i] / max + 1;
	    	}
	    }
	    
	    System.out.println(room);

	}

}
