package baekjoon_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //�� �迭�� ����.

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		//a, b �� ���� ArrayList�� ���ؼ� �������

		for(int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		for(int i = 0; i < n; i++) {
			b.add(sc.nextInt());
		}

		Collections.sort(a);
		//�������� ���� !! Collections.sort�Լ�!!
		int sum = 0;

		out : for(int i = 0; i < a.size();) {
			int max = 0; //max�� 0���� ���ο��� �ʱ�ȭ. b�� ��� ���� ū������ ���ؾ���.
			int t = 0; //�ε��� �����
			
			for(int j = 0; j < b.size(); j++) {
				if(b.get(j) >= max) {
					max = b.get(j);
					t = j;
				}
			}
			
				if(a.size() > 1) {
					sum = sum + (a.get(0)*max);
					a.remove(0);
					b.remove(t);
				}
				else {
					sum = sum + (a.get(0)*(b.get(0)));
					break out;
				}
		
		}

		System.out.println(sum);
		sc.close();
	}
}