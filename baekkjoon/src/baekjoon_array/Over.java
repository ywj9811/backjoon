package backjoon_array;

import java.util.Scanner;

public class Over {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���̽��� �Է��� ���ΰ� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		double avg;
		
		for(int i = 0; i < n; i++) {
			System.out.println("�л��� : ");
			int a = sc.nextInt();         //a�� �л���.
			int student[] = new int[a];
			
			for(int j = 0; j < a; j++) {
				student[j] = sc.nextInt(); //a���� ���� �л����� ������ �ش�.
				sum += student[j];
			}
			avg = sum / (double)a;
			int cnt = 0;
			for(int k = 0; k < a; k++) {
				if(student[k] > avg)
					cnt++;
			}
			
			double avg2 = (double)cnt / a * 100;
			String avg3 = String.format("%.4f", avg2); //có�� .3f �ϸ� 3��° �ڸ�����...
			//���Ŀ� �ٽ� ����.
		}
	}
}
