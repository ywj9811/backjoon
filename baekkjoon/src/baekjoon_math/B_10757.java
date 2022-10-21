package baekjoon_math;

import java.math.BigInteger;
import java.util.Scanner;

public class B_10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		BigInteger bi1 = new BigInteger(a);
		BigInteger bi2 = new BigInteger(b);
		
		System.out.println(bi1.add(bi2));
	}
}

//long���� Ŀ������ �ʴ� ������ ���� BigInteger�̶�� Ŭ������ �̿��Ͽ��� �Ѵ�.
//�ٸ� Ŭ���� ��ü ������ ���������� BigInteger �̸� = new BigInteger("��") �� ���ؼ� �����.
//����� Ŭ�����̱� ������ +,-,%���� �����ڰ� �ȵǰ� .add, .subtract, .multiply���� ����ؾ� �Ѵ�.