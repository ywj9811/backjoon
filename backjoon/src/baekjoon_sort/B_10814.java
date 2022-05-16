package baekjoon_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_10814 {
	static swap()
	
	public static void main(String[] args) throws Exception {
		//나이가 증가하는 순, 나이가 같으면 먼저 가입한 순으로.
		//가입한 순서대로 데이터가 주어지게 된다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //몇명을 입력받을 것인가.
		
		String user[][] = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				user[i][j] = sc.next();
			}
		}
		//[][0]에는 나이 [][1]에는 이름
		
		Arrays.sort(user, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return (o1[1], o2[1]);
			}
		}
	}
}
