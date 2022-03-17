package backjoon_array;

import java.util.Scanner;

public class Ox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���̽� �����Ұ��ΰ� : ");
		int n = sc.nextInt();
		String ox[] = new String[n]; //n���� String���̽�
		
		int cnt = 0;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			ox[i] = sc.next();
			
			for(int j = 0; j < ox[i].length(); j++) {
				if(ox[i].charAt(j) == 'O') {
					if(j > 0) {
						if(ox[i].charAt(j - 1) == 'O')
							cnt++;
						else
							cnt = 1;
					}
					else
						cnt = 1;
				}
				else
					cnt = 0;
				sum = sum + cnt;
			}

			//�� �ٷ� ����� �Ѿ���°�. -> next()�� �ٲ���� ��������. ����
			System.out.println(sum);
			sum = 0;
		}
	}
}
