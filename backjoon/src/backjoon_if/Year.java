package backjoon_if;

import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("������ �Է��Ͻÿ� : ");
		year = sc.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 != 0) {
				System.out.println(1);
			}
			else if(year % 400 == 0)
				System.out.println(1);
		}
		else
			System.out.println(0);
		
		sc.close();
	}
}
