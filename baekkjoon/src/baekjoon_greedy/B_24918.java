package baekjoon_greedy;

import java.util.Scanner;

//ȸ�� �ð��� ��ġ�� �ʵ��� ����� �� �ִ� �ִ��� �ð�.
public class B_24918 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //n���� ȸ�ǰ� ����.
		
		int[][] arr = new int[n][2]; //���ο� ����, �� �ΰ��� ����.
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		} //���� �־���.
		
		
	}
}
