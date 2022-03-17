package backjoon_function;

import java.util.ArrayList;

public class Self {
	static int sum(int a) {
		if(a > 0 && a < 10) {
			return a + a;
		}
		else if(a >= 10 && a < 100) {
			return a + (a/10);
		}
		else if(a >= 100 && a < 1000) {
			return a + (a/10 - a/100) + (a/100);
		}
		else
			return a + (a/10 - a/100 - a/1000) + (a/100 - a/1000) + (a/1000);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < 10000; i++) {
			arr.add(i+1);
		}
		
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < arr.size(); j++) {
				if(Self.sum(arr.get(i)) == arr.get(j)) {
					arr.remove(j);
				}
			}
		}
		System.out.println(arr);
	}
}