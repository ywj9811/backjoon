package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_14659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		String kill[] = new String[n];
		String num = br.readLine();
		kill = num.split(" ");//������ �������� ������ kill�迭�� ����
		//���� ���������θ� �̵� ����
		//���� �� ���� ���츮�� ������ out
		int cnt[] = new int[n];
		int max = 0;
		//���� ������ ���� ���� �ƹ��� ���� �� ����
		for(int i = 0; i < kill.length; i++) {
			for(int j = i; j < kill.length; j++) {
				if(Integer.parseInt(kill[i]) < Integer.parseInt(kill[j]))
					break;
				else
					cnt[i]++;
			}
			if(max < cnt[i]-1)
				max = cnt[i]-1;
		}
		
		bw.write(String.valueOf(max));
		bw.flush();
//		bw.close();
	}
}