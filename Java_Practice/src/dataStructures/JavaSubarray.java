package dataStructures;

import java.util.Scanner;

/*
 * 부분 배열
 * ex) arr = [1,2,3]
 * -> [1][2][3][1,2][2,3][1,2,3][1,3] 
 * 
 * 배열이 주어질 때 배열의 부분 배열 중 합이 음수인 부분 배열의 개수찾기
 * 
 * ex)
 * 5
 * 1 -2 4 -5 1
 * 9
 * 
 * 1 <= n <= 100 배열 길이
 * -10^4 <= ai <= 10^4
 *
 */

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		// 부분 집합 문제랑 헷갈림
		// 그냥 단순하게 합을 구하는거라 쉽게 구할 수 있음
		
		int negativeCnt = 0;
		
		// brute force O(n^2)
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j]; // 이게 누적합이었음 이러면 말이됨
				if(sum < 0) negativeCnt++; // 누적될때마다 체크
			}
		}
		
		// dp 이용한 kadanes-algorithm (카데인 알고리즘)
		// 이거는 여기서는 못써먹을 듯
		
		System.out.println(negativeCnt);
	}

}
