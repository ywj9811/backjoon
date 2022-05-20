package baekjoon_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_10814 {
	public static void main(String[] args) throws Exception {
		//나이가 증가하는 순, 나이가 같으면 먼저 가입한 순으로.
		//가입한 순서대로 데이터가 주어지게 된다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //몇명을 입력받을 것인가.
		
		ArrayList<String> user = new ArrayList<String>();
		
		for(int i = 0; i < n; i++)
			user.add(br.readLine());
		
		//user에 순서대로 들어있다.
		
		
//		String user[][] = new String[n][2];
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 2; j++) {
//				user[i][j] = sc.next();
//			}
//		}

	}
}
