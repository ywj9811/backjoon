package baekjoon_math;

import java.util.Scanner;

public class B_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //��� ���̽��� �ұ�.
		for(int i = 0; i < n; i++) {
			int h = sc.nextInt(); //ȣ�ڹ�
			int w = sc.nextInt(); //ȣ�ڳ���		
			int p = sc.nextInt(); //���° �մ��δ�.
			
			out : for(int x = 0; x < w; x++) {
				for(int y = 1; y <= h; y++) {
					if(x*h + y == p) {
						System.out.printf("%d%02d \n", y, x+1);
						break out;
					}
				}
			}
		}
	}
}