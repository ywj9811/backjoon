package backjoon_array;

import java.util.HashSet;
import java.util.Scanner;

public class Na2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 9; i++) {
			set.add(sc.nextInt() % 42);
		}
		
		int cnt = 0;
		for(int j = 0; j < set.size(); j++) {
			cnt++;
		}
		
		System.out.println(cnt);
	}
}

//�迭 ��ſ� hashset�� ����Ͽ� �ߺ��Ǵ� ���ڸ� �������� �ʰ���.
//���� �ߺ��� �������� ���Ե��� �ʾƼ� ���� �ٸ� �������� ���� ��.
//=> ���� �ٸ� �������� ������ �ٷ� �� �� �ִ�.
