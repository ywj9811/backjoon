package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1439 {
	public static void main(String[] args)throws IOException {
		//���ڿ�S�� ��� ���ڸ� ���� ���� ������� �Ѵ�
		//S���� ���ӵ� �ϳ� �̻��� ���ڸ� ��� ��� ������ ���̴�.
		//������ ���� 1�� 0���� 0�� 1�� �����°��� �ǹ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int sum = 0;
		int sum2 = 0;
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == '0' && s.charAt(i+1) == '1') {
				sum++;
			}
			else if(s.charAt(i) == '1' && s.charAt(i+1) == '0') {
				sum2++;
			}
		}
		if(s.charAt(s.length()-1) == '1')
			sum2++;
		if(s.charAt(s.length()-1) == '0')
			sum++;
		if(sum >= sum2) {
			System.out.println(sum2);
		}
		else
			System.out.println(sum);
		
		br.close();
	}
}
