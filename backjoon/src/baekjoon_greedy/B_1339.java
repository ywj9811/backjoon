package baekjoon_greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B_1339 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//�ܾ��� ���� ���ϱ�.
		int alpha[] = new int[26]; //a~z���� �� 26��
		String num[] = new String[n];

		for(int i = 0; i < n; i++) {
			num[i] = sc.next(); //�ϳ��� ����.

			int temp = (int)Math.pow(10, num[i].length()-1); //pow�� double��ȯ.

			for(int j = 0; j < num[i].length(); j++) {
				alpha[(int)num[i].charAt(i)-65] += temp;
				//num[i].charAt(i)-65��, A�� ��� 0, B�� ��� 1 ...
				//�̷��� ������ �ȴ�. ���� �� ���ĺ� ��ġ�� �迭�� ���� ���ϰ� �Ǵ°��̴�.
				//temp = 10000 1000 100 �̷�������.
				temp = temp/10;
			}
		}//alpha�迭�� �̷��� �ϸ� n������ �ܾ ������ a~z������ ������ ���� ���� ����ִ�

		int sum = 0;
		int mul = 9;
		Arrays.sort(alpha);
		//alpha�迭�� ������, ������������
		for(int i = alpha.length-1; i >= 0; i--) {
			sum = sum + alpha[i] * mul;
			if(alpha[i] == 0)
				break;
			mul--;
		}
		
		System.out.println(sum);
	}
}