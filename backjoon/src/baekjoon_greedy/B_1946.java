package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class B_1946 {
	public static void main(String[] args) throws IOException {
		//������ ���� ���� ������ ������ ������ ���� �Ѵ� ���ٸ� ���� ���� �� ����.
		//���� ������ �־�����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(br.readLine());//case�� ����
		
		ArrayList<Integer> cnt = new ArrayList<Integer>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		int arr[][]; //���� ���� ���� ����
		for(int i = 0; i < n; i++) {
			num.add(Integer.parseInt(br.readLine()));//������ �� �Է¹���
			
			int c = num.get(i);
			arr = new int[c][2];
			
			for(int j = 0; j < c; j++) { //ù��° ���̽��� �����ڵ� ���� �Է�
				for(int k = 0; k < 2; k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			for(int t = 0; t < c; t++) {
				for(int f = 0; f < c; f++) {
					if(arr[t][0] < arr[f][0] && arr[t][1] < arr[f][1])
						c--;
				}
			}
			
			cnt.add(c);
		}
		
		for(int i = 0; i < cnt.size(); i++)
			System.out.println(cnt.get(i));
	}
}
