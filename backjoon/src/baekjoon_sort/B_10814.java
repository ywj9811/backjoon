package baekjoon_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_10814 {
	static swap()
	
	public static void main(String[] args) throws Exception {
		//���̰� �����ϴ� ��, ���̰� ������ ���� ������ ������.
		//������ ������� �����Ͱ� �־����� �ȴ�.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //����� �Է¹��� ���ΰ�.
		
		String user[][] = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				user[i][j] = sc.next();
			}
		}
		//[][0]���� ���� [][1]���� �̸�
		
		Arrays.sort(user, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return (o1[1], o2[1]);
			}
		}
	}
}
