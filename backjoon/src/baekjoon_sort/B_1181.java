package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_1181 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = arr;

		for(int i = 0; i < n; i++) {
			arr.add(br.readLine());
		}

		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; ) {
				System.out.println(arr.get(i));
				System.out.println(arr2.get(j));
				
				if(arr2.get(j).equals(arr.get(i))) {
					System.out.println("!!!!!!!!!!!!");
					arr2.remove(j);
					j = i+1;
					if(j == arr2.size()) {
						break;
					}
				}
				
				else {
					j++;
					if(j == arr2.size()) {
						j = i+1;
						break;
					}
				}
			}
		}
		System.out.println(arr2.size());
		System.out.println(arr2);
	}
}
