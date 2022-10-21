package baekjoon_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_10814 {
	public static void main(String[] args) throws Exception {
		//���̰� �����ϴ� ��, ���̰� ������ ���� ������ ������.
		//������ ������� �����Ͱ� �־����� �ȴ�.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//2���� �迭�� �Է��� ����
		String user[][] = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				user[i][j] = sc.next();
				//[][0]���� ���� [][1]���� �̸��� �������
				//[][0]�� �������� ������ ������ ���ٸ� [i][]���� i�� ���������� ������ �ϸ� �ȴ�.
			}
		}
		
		//�� �Է¹���
		Arrays.sort(user, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0].equals(o2[0]))
					return 0;
				else
					return (Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]));
			}
		});
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(user[i][j] + " ");
			}
			System.out.println();
		}
	}
}
