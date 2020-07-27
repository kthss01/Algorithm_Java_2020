package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Sums
 * 
 * 합 구하기
 * 	1. 양의 정수의 합
 *  2. 양의 홀수의 합
 *  3. 양의 정수의 합
 *  
 *  1 <= t <= 10000 test cases
 *  1 <= N <= 10000 number
 * 
 * 수의 합 (n*(n+1)) / 2
 * 홀수의 합 n^2
 * 짝수의 합 n^2 + n
 */

public class Baekjoon_13073 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = new Integer(br.readLine());

		while (t-- > 0) {
			int n = new Integer(br.readLine());

			int n1 = (n * (n + 1)) / 2;
			int n2 = n * n;
			int n3 = n * n + n;

			sb.append(n1 + " " + n2 + " " + n3 + "\n");
		}

		System.out.println(sb);
	}

}
