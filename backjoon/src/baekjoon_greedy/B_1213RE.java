package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1213RE {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		//�Է¹ޱ�
		
		int alpha[] = new int[26];
		//A~Z 26��
		char a = 'A';
		for(int i = 0; i < alpha.length; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == a)
					alpha[i]++;
				//���ĺ� A~Z�� ������ �ε����� ������ �Ǿ�����
				//���� �ϳ��� ����.
			}
			a++;
		}
		
		int center = 0;
		int cnt = 0;
		
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] > 0) {
				if(alpha[i] % 2 == 1) {
					center = i;
					cnt++;
				}
			}
		}
		
		if(cnt > 1)
			System.out.println("I'm Sorry Hansoo");
		
		else {
			for(int i = 0; i < alpha.length; i++) {
				if(alpha[i] > 0) {
					for(int j = 0; j < alpha[i]/2; j++)
						System.out.print((char)(i+'A'));
				}
			}
			
			if(cnt == 1)
				System.out.print((char)(center + 'A'));
			
			for(int i = alpha.length-1; i >= 0; i--) {
				if(alpha[i] > 0) {
					for(int j = 0; j < alpha[i]/2; i++)
						System.out.print((char)(i+'A'));
				}
			}
		}
	}
}
