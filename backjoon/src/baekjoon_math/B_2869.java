package baekjoon_math;

import java.util.Scanner;

public class B_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //낮에 올라감.
		int b = sc.nextInt(); //밤에 내려옴.
		int v = sc.nextInt(); //높이.
		
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
//나중에 BufferedReader 사용하기.
