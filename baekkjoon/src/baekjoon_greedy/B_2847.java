package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_2847 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //��� ������ ������ΰ�
		
		int[] lev = new int[n];
		for(int i = 0; i < n; i++) {
			lev[i] = Integer.parseInt(br.readLine());
		}
		//�������� ��� �Է¹���
		
		int cnt = 0;
		int max = lev[n-1];
		
		for(int i = n - 2; i >= 0; i--) {
			if(lev[i] >= max) {
				while(lev[i] >= max) {
					lev[i]--;
					cnt++;
				}
				max = lev[i];
			}
			else
				max = lev[i];
		}
		
		System.out.println(cnt);
	}
}
