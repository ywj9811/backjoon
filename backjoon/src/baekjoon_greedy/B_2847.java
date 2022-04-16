package baekjoon_greedy;

import java.util.Scanner;

public class B_2847 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//게임을 만들었다.
		int n = sc.nextInt();//n개의 레벨이 존재
		//클리어 할때마다 점수가 주어진다.
		
		//레벨을 난이도 순으로 배치함, 실수로 쉬운 레벨이 어려운 레벨보다 점수를 많이 받는 경우를 만들었다.
		int level[] = new int[n];
		for(int i = 0; i < n; i++) {
			level[i] = sc.nextInt();
		}
	}
}
//다시하자