package baekjoon_math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String all = br.readLine();
		
		String arr[] = (all.split(" ")); //나눠서 가지고 있을놈
		int a = Integer.parseInt(arr[0]); //낮에 올라감.
		int b = Integer.parseInt(arr[1]); //밤에 내려옴.
		int v = Integer.parseInt(arr[2]); //높이.
		
		int n = 0;
		do {
			n++;
			if(v - (a - b)*n <= a) {
				bw.write(String.valueOf((n+1)));//왜 안나오는가
				System.out.println(n + 1);
				break;
			}
		} while(true);
	}
}
//나중에writer 질문!