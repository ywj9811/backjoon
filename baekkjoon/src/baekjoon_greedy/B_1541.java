package baekjoon_greedy;

import java.util.Scanner;

public class B_1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine(); //���� �Է¹���.
		String[] arr1 = str.split("-"); //-�� ���� ����
		
		int sum = Integer.MAX_VALUE; //�ʱⰪ���� �ִ밪�� �ϴ� ������. ù��°���� �� �� �ֵ���.
		
		for(int i = 0; i < arr1.length; i++) {
			String[] arr2 = arr1[i].split("\\+"); //arr2���� -�� �������� ���� �ĵ��� �������. ex 50, 50+40, 40 �� ������ ��� ���ָ� ��. 
											      //+�� ���� �����ְ� ���ָ� ��.
			int add = 0;
			
			for(int j = 0; j < arr2.length; j++) {
				add = Integer.parseInt(arr2[j]) + add; //50���� ���� ��� �׳� add = 50�� �迭�� ���̰� 1�̴ϰ�.
			}										   //50+40���� ���� ��� add = 50 + 0, add = 50 + 40 ������ ������ �ȴ�.
			
			if(sum == Integer.MAX_VALUE)//sum�� �ǵ������ �����ϰ� ù��° ����.
				sum = add;
			else
				sum = sum - add;
		}
		//�� ó������ -�� �������� �� �������� ���ڿ��� �� +�� ���� ��츸 �����ְ� �� ������ ��� ù��° ������ ���ָ� ����� ���´�.
			
			System.out.println(sum);
	}
}