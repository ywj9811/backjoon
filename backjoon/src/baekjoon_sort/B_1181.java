package baekjoon_sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1181 {
	void swap(String[] a, int idx1, int idx2){
		String t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		//�ΰ��� �ٲ�
	}


	void quicksort(String[] a, int left, int right) {
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

	//quicksort�޼ҵ带 ���ؼ� �켱 ���̼����� ������

	void sort(String[] str, int i, int j) {
		int a = str[i].charAt(j);
		int b = str[i+1].charAt(j);
		if(a > b) {
			swap(str, i, i+1);
			return;
		}
		else if(a < b) {
			return;
		}

		j++;
		if(j >= str[i].length())
			return;
		sort(str, i, j); //���
	}

	void check(String str[], int i) {
		if(str[i].length() == str[i+1].length()) {
			int j = 0;
			sort(str, i, j);
		}
		i++;
		if(i == str.length-1)
			return;
		check(str, i); //���
	}

	public static void main(String[] args) throws Exception{
		
		B_1181 b = new B_1181();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); //��� �ܾ �Է¹�����.
		String str[] = new String[n];
		//���̰� ª������ 1����
		//������ ����������
		for(int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}

		b.quicksort(str, 0, n-1); //���̼����� ������ ��

		for(int t = 0; t < str.length; t++) {
			int i = 0;
			b.check(str, i);
		}//�ӵ��� ���� ��ͷ� ����

		for(int i = 0; i < str.length-1; i++) {
			if(str[i].equals(str[i+1]))
				continue;
			bw.write(str[i]);
			bw.newLine();
			bw.flush();
			
		}

		bw.close();
		
	}
}
