package baekjoon_greedy;

import java.util.Scanner;

public class B_2847 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//������ �������.
		int n = sc.nextInt();//n���� ������ ����
		//Ŭ���� �Ҷ����� ������ �־�����.
		
		//������ ���̵� ������ ��ġ��, �Ǽ��� ���� ������ ����� �������� ������ ���� �޴� ��츦 �������.
		int level[] = new int[n];
		for(int i = 0; i < n; i++) {
			level[i] = sc.nextInt();
		}
	}
}
//�ٽ�����