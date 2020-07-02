package dataStructures;

import java.util.Scanner;

/*
 * 메모리의 연속적인 블락에 데이터를 담는게 배열
 * 각각의 요소는 index를 사용해 접근
 * 메모리에 연속적이라 쉽게 찾음
 * 배열 저장할 때 얼마나 필요한지 알아야함
 * 
 * ex)
 * 	int[] myArray = new int[4];
 * 0부터 시작
 * 
 * Task
 * n 정수의 갯수
 * a0 ~ an-1 val 읽어와서 출력하기
 * 
 */

public class Java1DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		for (int i : arr) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
