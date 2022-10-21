package baekjoon_sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_10989 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		//int[] arr = new int[n]; //�����迭
		int[] count = new int[10001]; //�� ���� count
		//int[] result = new int[n]; //���� �� ��� �迭
		
		for(int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine())]++;
			//count�迭�� ���ʿ� �� ���� index�� �Ǿ� �� ���� ������� ����Ǵ� �迭�� �ٷ� �̷��� ����� �� �ִ�.
			//�׸��� index������� ��>0 �϶����� ��--�� ���ָ� index�� �״�� ������ָ� ������ �Ǿ �� ��µǰ� �ȴ�. 
		}
		
		br.close();
		
		for(int i = 1; i < count.length; i++) {
			while(count[i] > 0) {
				bw.write(String.valueOf(i)); //int���� �ٷ� ��½��ѹ����� x�ڽ��� ����
				bw.newLine();
				count[i]--;
			}
		}
		
		bw.flush();
		bw.close();
	}
}
