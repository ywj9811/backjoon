package baekjoon_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_10814 {
	public static void main(String[] args) throws Exception {
		//���̰� �����ϴ� ��, ���̰� ������ ���� ������ ������.
		//������ ������� �����Ͱ� �־����� �ȴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //����� �Է¹��� ���ΰ�.
		
		ArrayList<String> user = new ArrayList<String>();
		
		for(int i = 0; i < n; i++)
			user.add(br.readLine());
		
		//user�� ������� ����ִ�.
		
		
//		String user[][] = new String[n][2];
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 2; j++) {
//				user[i][j] = sc.next();
//			}
//		}

	}
}
