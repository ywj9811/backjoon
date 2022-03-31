package baekjoon_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_10610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next(); //�Է� ����
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		boolean tf = false;//0�� �����ϴ���
		int sum = 0;
		
		for(int i = 0; i < n.length(); i++) {
			int a = n.charAt(i)-'0';
			arr.add(a);
			//char������ -'0'�� �ϰų� Ȥ��
			//(Character.getNumericValue(n.charAt(i)))�� ����ص� �ȴ�.
			sum += a;
			if(a == 0)
				tf = true;			
		}
		if(sum%3 != 0)
			tf = false;
		
		if(tf == true) {
			Collections.sort(arr);
			for(int i = arr.size()-1; i >= 0; i--) {
				System.out.print(arr.get(i));
			}
		}
		else
			System.out.println(-1);
	}
}
//arr[0~9]0���� ������� 1���ڸ� 10���ڸ� .... �ö󰣴�.
//30�� ����� �Ǳ� ���ؼ��� 1�� �ڸ� = 0, 3�� ���.
//���� : 0�� �����ؾ��ϰ� �� �ڸ����� �� = 3�� ���.