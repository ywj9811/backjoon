package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_11497 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int n = Integer.parseInt(br.readLine()); //���̽��� ����
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine()); //�볪���� ���� �Է�
			int max = 0;
			String[] str = new String[k];
			int[] arr = new int[k];			
			
			String height = br.readLine();
			
			str = height.split(" ");
			for(int j = 0; j < arr.length; j++)
				arr[j] = Integer.parseInt(str[j]);

			Arrays.sort(arr); //�볪�� ���� �������� ����
			//���������� �翷�� ��ġ
			
			for(int t = 2; t < arr.length; t++) {
				if((arr[t] - arr[t-2]) > max)
					max = (arr[t] - arr[t-2]);
			}
			
			System.out.println(max);
		}
	}
}