package backjoon_if;

import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		/*
		  a == b
		  �϶�
		  	b == c ��� -> 3�� ����
		  	b != c ��� -> 2�� ����
		  
		  a != b
		  �϶�
		  	a != c�ΰ�?
		  		b == c�ΰ�. -> 2�� ����.
		  		b != c�ΰ�. -> �� �ٸ�.
		  	a == c -> 2�� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int sum;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b) {
			if(b == c) {
				sum = 10000 + a*1000;
				System.out.println(sum);
			}
		}
		
		else
			if(a != c) {
				if(b == c) {
					sum = 1000 + b*100;
				}
				else {
					if(a > b)
						if(a > c)
							sum = 100 * a;
						else if(a < c)
							sum = 100 * c;
				}
			}
	}
}
