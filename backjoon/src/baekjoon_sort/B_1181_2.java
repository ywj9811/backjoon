package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B_1181_2 {
	public static void main(String args[]) throws IOException{
	   	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   	 
	   	 	int n = Integer.parseInt(br.readLine());
	   	 	
	   	 	String[] arr = new String[n];
	   	 	
	   	 	for(int i =  0 ; i < n ; i++) {
	   	 		arr[i] = br.readLine();
	   	 	}
	   	 	
	   	 	
	   	 	Arrays.sort(arr, 
	   	 	new Comparator<String>() { //arr��� �迭�� �޾Ƽ� �̰��� Comparator<String>()�� ���ؼ� ������ ��
	   	 							   //�̶� Coparator�� ���ؼ� ������ �ϴµ� Comparotr�� �������Ͽ� ������ ���� �����
	   	 		@Override
	   	 		public int compare(String s1, String s2) { //compare�޼ҵ��� ��� ���� ������ ���� int�� ��ȯ�� ��
		   	 		if(s1.length() == s2.length()) {
		   	 			return s1.compareTo(s2); //���ٸ� 0 s1�� ũ�ٸ� 1 s2�� ũ�ٸ� -1 --> ���̰� ������� ������
		   	 		}else {
		   	 			return s1.length() - s2.length(); //s1�� ũ�ٸ� ���, �۴ٸ� ����
		   	 		}
	   	 		
	   	 		}
	   	 	});//Comparator������ �� �̿� ���ؼ� ������ ��
	   
	   	 	System.out.println(arr[0]);
	   	 	for(int i = 1; i < n; i++) {
		   		if (!arr[i].equals(arr[i - 1])) {
					System.out.println(arr[i]);
				}
		}
	}
}
