package backjoon_string;

import java.util.Scanner;

public class Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); //��� ���̽��� ����� ���ΰ�.
		
		for(int i = 0; i < t; i++) {
			int r = sc.nextInt(); //��� �ݺ�
			String s = sc.next(); //�Է¹��� ���ڿ�
			for(int j = 0; j < r; j++) {
				System.out.println(s.charAt(j));
			}
		}
	}
}
