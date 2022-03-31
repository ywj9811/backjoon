package baekjoon_greedy;

import java.util.Scanner;

public class B_13305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //������ ����
		
		int dis[] = new int[n-1]; //�� ���� ������ �Ÿ�
		for(int i = 0; i < dis.length; i++) {
			dis[i] = sc.nextInt();
		}
		
		int val[] = new int[n]; //�� �������� ����
		for(int i = 0; i < val.length; i++) {
			val[i] = sc.nextInt();
		}
		
		int now;
		long sum = val[0]*(long)dis[0]; //ū ���� ��� long ����
		
		for(now = 0; now < val.length-2; now++) {
			for(int i = now + 1; i < val.length-1; i++) {
				if(val[now] <= val[i])
					sum = sum + ((long)dis[i] * val[now]);
				else {
					sum = sum + ((long)dis[i] * val[i]);
					now = i - 1;
					break;
				}
				now = i - 1; //else�� �Ȱ�ġ�� ������ ���� �� now�� ��ȭ�� ���� ������ now�� �������� �ٽ� �ݺ��� ���� ����
			}
		}
		
		System.out.println(sum);
	}
}
