package baekjoon_math;

import java.util.Scanner;

public class B_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //���� �ö�.
		int b = sc.nextInt(); //�㿡 ������.
		int v = sc.nextInt(); //����.
		
		int n = 0;
		do {
			n++;
			if(v - (a - b)*n <= a) {
				System.out.println(n + 1);
				break;
			}
		} while(true);
	}
}
//���߿� BufferedReader ����ϱ�.
