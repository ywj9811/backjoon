package baekjoon_greedy;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		//������������ �����ϸ� �ּ����� �ð��� �����°� ����.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //����� �ִ°�.
		int arr[] = new int[n]; //������ ����鿡 ���� ��ٸ��� �ð�.
		int t; //�������� �����ϱ� ���� ��.
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length - 1; j++) {
				if(arr[i] > arr[j+1]) {
					t = arr[j+1];
					arr[j+1] = arr[i];
					arr[i] = t;
				}
			}
		}
		//�������� ���� �Ϸ�.
		
		int sum3 = 0; //��� ��.
		int sum2 = 0; //������ ��������� ��.
		int sum[] = new int[n]; //�� ������ ��������� ���� ������ �迭
		for(int i = 0; i < arr.length; i++) {
			sum2 = sum2 + arr[i];
			sum[i] = sum2;
			sum3 = sum3 + sum[i];
		}
		System.out.println(sum3);
		
		sc.close();
	}
}
