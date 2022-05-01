package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_14720 {
	public static void main(String[] args) throws Exception {
		//��-��-��-�� �� ������
		//0-�� 1-�� 2-��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());//���� ��;
		int arr[] = new int[n];

		String str = br.readLine();
		String str2[] = str.split(" ");

		int cnt = 0;
		int now = 0;

		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str2[i]);
			if(cnt == 0) {
				if(arr[i] == 0) {
					now = arr[i];
					cnt++;
					continue;
				}
			}

			if(cnt > 0) {
				if(now == 2)
					now = -1;

				if(now+1 == arr[i]) {
					cnt++;
					now++;
				}
			}
		}
		System.out.println(cnt);
	}
}