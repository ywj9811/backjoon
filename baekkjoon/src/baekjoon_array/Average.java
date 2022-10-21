package backjoon_array;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		//입력 : n개의 과목, 각각의 점수 3개
		//출력 : 원점수/최대점수 * 100 으로 3개의 평균
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n개의 과목
		int max = 0; //최대값
		
		int arr[] = new int[n]; //원래 점수
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) 
				max = arr[i];
		}
		
		double sum = 0;
		double arr1[] = new double[n]; //새로운 점수.
		for(int j = 0; j < arr.length; j++) {
			arr1[j] = (arr[j]/(double)max) * 100;
			sum = sum + arr1[j];
		}
		
		double average = sum/n;
		
		System.out.println(average);
	}
}
