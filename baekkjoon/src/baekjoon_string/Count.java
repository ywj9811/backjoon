package backjoon_string;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); //���ڿ� �Է�
		
		int cnt = 1; //ī��Ʈ��
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ')
				cnt++;
		}
		
		if(input.charAt(0) == ' ')
			cnt = cnt - 1;
		if(input.charAt(input.length() - 1) == ' ')
			cnt = cnt - 1;
		System.out.println(cnt);
	}
}
