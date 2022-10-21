package baekjoon_math;

import java.util.Scanner;

public class Break_even_point {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //�׳� ���� ����
		int b = sc.nextInt(); //�Ѵ�� ���
		int c = sc.nextInt(); //�ǸŰ�

		long n = 1; //�Ǹ� ����

		while(c*n <= (a + b*n)) {
			if(c < b) {
				break;
			}
			n++;
		}

		if(c < b)
			System.out.println("-1");
		else
			System.out.println(n);
	}
}

//���߿� BufferedReader ����ϱ�