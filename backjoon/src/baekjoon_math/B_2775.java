package baekjoon_math;

import java.util.Scanner;

public class B_2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //n kg�� ����Ұ�.
		
		int a = 0;
		int b = 0; //a�� 5, b�� 3 �� �ǹ��Ѵ�.
		int sum;
		for(b = 0; b*3 <= n; b++) {
			if((n - b*3) % 5 == 0) {
				a = (n-b*3)/5;
				sum = a + b;
				System.out.println(sum);
				break;
			}
		}
		if( b*3 > n)
			System.out.println(-1);
	}
}
