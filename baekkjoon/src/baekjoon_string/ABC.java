package backjoon_string;

import java.util.ArrayList;
import java.util.Scanner;

public class ABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 'a'; i <= 'z'; i++) {
			arr.add(i-97, -1);
			for(int j = 0; j < s.length(); j++) {
				if(i == (int)s.charAt(j)) {
					arr.set((i-97), j); //set�� �ؾ� ���� �ٲ��ֱ� ������
										//add�� �� ��� ���� �߰��Ǿ� size�� Ŀ���� �ȴ�.
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i));
			System.out.print(" ");
		}
	}
}