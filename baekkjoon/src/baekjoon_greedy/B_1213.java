package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1213 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		//��� �Է¹޴´�.
		//ȸ������ �Ǳ� ���ؼ��� �ϴ� ���̰� Ȧ��
		//1������ ¦��, ������ �ϳ��� Ȧ��

		int num[] = new int[26];
		char arr[] = new char[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			for(char a = 'A'; a < 'Z'; a++) {
				if(arr[i] == a)
					num[(int)a - 65]++;
			}
		}//arr[]�� str�� �� �ڸ��� ���ڰ� ����ִ�.
		//num[]�� A~Z���� ���� ����
		int center = 0;
		int cnt = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] > 0) {
				if(num[i]%2 != 0) {
					center = i;
					cnt++;
				}
			}
		}

		//arr[]�� str�� �� �ڸ��� ���ڰ� ����ִ�.
		//num[]�� A~Z���� ���� ����
		//arr���� str�� �� �ڸ� ���ڰ� ��������� ���x num�� ���� �̿��ؼ� i+65�� �ƽ�Ű�ڵ� �̿�
		if(cnt > 1)
			System.out.println("I'm Sorry Hansoo");
		else {
			for(int i = 0; i < num.length; i++) {
				if(num[i]>0) {
					for(int j = 0; j < num[i]/2; j++) {
						System.out.print((char)(i+65));
					}
				}
			}
			
			if(cnt == 1)
				System.out.print((char)(center+65));
			
			for(int i = num.length-1; i >= 0; i--) {
				if(num[i]>0) {
					for(int j = 0; j < num[i]/2; j++) {
						System.out.print((char)(i+65));
					}
				}
			}
		}
	}
}
