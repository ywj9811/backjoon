package baekjoon_greedy;

import java.util.Scanner;

public class B_2864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n1 = sc.next();
		String n2 = sc.next();
		//5�� 6�� �򰥸���.
		//�� ������ ���� �ִ�, �ּڰ�
		//�ּ� -> 6�� 5��, �ִ� -> 5�� 6����
		
		//max ���ϱ�
		n1 = n1.replace('5', '6');
		n2 = n2.replace('5', '6');
		int max = Integer.parseInt(n1) + Integer.parseInt(n2);
		
		n1 = n1.replace('6', '5');
		n2 = n2.replace('6', '5');
		int min = Integer.parseInt(n1) + Integer.parseInt(n2);
		
		System.out.println(min + " " + max);
	}
}
