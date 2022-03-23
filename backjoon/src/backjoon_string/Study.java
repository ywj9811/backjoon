package backjoon_string;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String abc = "abcdefghijklmnopqrstuvwxyz";
		int cnt[] = new int[26];
		//���ڿ� �Է¹ޱ�� a~z���� �񱳿�, �׸��� a~z���� Ƚ�� ī��Ʈ

		int max = 0;	  //���� �ִ밪���� ���� �����
		char max2 = ' ';  //���� ������ ������ ?�� �����ϱ� ����
		char max3 = ' ';  //� ���ڰ� �ִ����� ����(max �̿�)
		int count = 0;    //�ִ밪�� ������ �������� ī��Ʈ

		for(int i = 0; i < abc.length(); i++) {
			for(int j = 0; j < input.length(); j++) {
				if(abc.charAt(i) == input.charAt(j))
					cnt[i]++;
				else if((int)abc.charAt(i) == ((int)input.charAt(j) + 32))
					cnt[i]++;
			}
			
			if(cnt[i] > max) {
				max = cnt[i]; //�̰� ����������� �˰� �Ǵ°�. ������ ���� ���� ���Ӵ��� �˾ƾ���.
				max3 = abc.charAt(i); //������ ���� ���� ���Դ��� �ذ�.
			}
		} //���� �ִ밪 Ȯ��
		
		for(int i = 0; i < abc.length(); i++) {
			if(max == cnt[i])
				count++;
			if(count > 1) {
				max2 = '?';
				break;
			}
		}//���������� üũ

		if(max2 != '?')
			if('A' <= max3 && max3 <= 'Z')
				System.out.println(max3);
			else
				System.out.println((char)(max3-32));
		else
			System.out.println(max2);
	}
}
