package baekjoon_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1181 {
	static void swap(String[] a, int idx1, int idx2){
		String t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		//�ΰ��� �ٲ�
	}
	
	static void quicksort(String[] a, int left, int right) {
		int pl = left; //���� Ŀ��
		int pr = right; //������ Ŀ��
		String x = a[(pl+pr)/2]; //��� ��ġ�� : ���ذ�
		
		do {
			while(a[pl].length() < x.length())
				pl++; //���ʺ��� �˻��ϸ� ������� ���̰� ª���� pl�� �ϳ� ����, ũ�ٸ� while�� Ż��
			while(a[pr].length() > x.length())
				pr--; //�ݴ�
			if(pl <= pr)
				swap(a, pl++, pr--); //�� pl�� ���ų� �� ũ��, �� pr�� �۰ų� �����Ƿ� �ٲ��� �׸��� �ϳ��� ������
		} while(pl <= pr); //pr�� pl�� �����Ҷ� ���� �ݺ�
		
		if(left < pr) //pr�� ���� left���� �������̶�� right�� pr�� �ϰ� ���ο��� �ٽ��ѹ� ����
			quicksort(a, left, pr);
		if(pl < right) //pl�� ���� right���� �����̶�� left�� pl�� ���ο��� �ٽ��ѹ� ����
			quicksort(a, pl, right);
	} //���� ������ ��Ϳ��� �ݺ������� ������ �ϰԵȴ�. �Ϸ��ϸ� ���̺��� ������ �Ϸ��
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //��� �ܾ �Է¹�����.
		String str[] = new String[n];
		//���̰� ª������ 1����
		//������ ����������
		for(int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		
		quicksort(str, 0, n-1);
		
		for(int i = 0; i < str.length-1; i++) {
			if(str[i].length() == str[i+1].length()) {
				out : for(int j = 0; j < str[i].length(); j++) {
					int a = str[i].charAt(j);
					int b = str[i+1].charAt(j);
					if(a > b) {
						swap(str, i, i+1);
						break out;
					}
				}
			}
		}
		
		for(int i = 0; i < str.length-1; i++) {
			if(str[i].equals(str[i+1]))
				continue;
			System.out.println(str[i]);
		}
	}
}

