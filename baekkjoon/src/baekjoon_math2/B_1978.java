package baekjoon_math2;

import java.util.Scanner;

public class B_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n���� ���� �Է¹ްڴ�.
		int cnt = 0; //�Ҽ� �
		
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}//�� �Է¹ޱ�.
		
		out : for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1)
				continue;
			for(int j = 2; j < arr[i]; j++) {
				if(arr[i] % j == 0)
					continue out;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
