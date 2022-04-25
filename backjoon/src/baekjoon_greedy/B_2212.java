package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2212 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//k���� ���߱�
		//n���� ������ ��� �ϳ��� ���߱����� ����� ����
		//���߱��� ������ ������ ���� �� ���߱��� ���Ű��� ������ ������ ���� �ּ�ȭ
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		String str= br.readLine();
		String[] str2 = str.split(" ");
		int[] arr = new int[str2.length];
		
		for(int i = 0; i < str2.length; i++) {
			arr[i] = Integer.parseInt(str2[i]);
		}
		//arr[]�� �� �������� ��ǥ�� �������
		
		Arrays.sort(arr);
		//������������ ����
		int[] arr2 = new int[arr.length-1];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (arr[i+1] - arr[i]);
		}
		
		Arrays.sort(arr2);
		int sum = 0;
		for(int i = 0; i < arr.length-k; i++) {
			sum += arr2[i];
		}
		System.out.println(sum);
	}
}
