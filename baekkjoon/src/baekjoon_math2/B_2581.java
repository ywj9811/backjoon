package baekjoon_math2;

import java.util.ArrayList;
import java.util.Scanner;

public class B_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); //m�̻�
		int n = sc.nextInt(); //n����.
		int sum = 0; //m ~ n�� �Ҽ��� ��.

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for(int i = m; i <= n; i++) {
			arr.add(i); //�� �־�����.
		}
		//�������� ù��° �Ҽ��� �̾Ƴ��� ���� ��������.
		int cnt = 0;
		int k = 0;

		out : for(int i = 0; i < arr.size(); i++) {
			for(int j = 2; j < arr.get(i); j++) {
				if(arr.get(i) % j == 0)
					continue out;
			}
			if(arr.get(i) != 1) {
				cnt++;
				sum = sum + arr.get(i);
			}
			if(cnt == 1)
				k = i;
		}
		
		if(sum != 0) {
			System.out.println(arr.get(k));
			System.out.println(sum);
		}
		else
			System.out.println(-1);
	}
}