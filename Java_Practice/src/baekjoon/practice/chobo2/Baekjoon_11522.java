package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Sum Kind of Problem
 * 
 * 다양한 합을 구해볼 꺼
 * s1 = The sum of the first N positive integers
 * s2 = The sum of the first N odd integers
 * s3 = The sum of the first N even integers
 * 
 * P (1 <= P <= 10000) number of data sets
 * K 				   data set number
 * N (1 <= N <= 10000) number
 * 
 * data set number s1 s2 s3 출력
 * 
 * 수의 합 (n*(n+1)) / 2
 * 홀수의 합 n^2
 * 짝수의 합 n^2 + n
 */

public class Baekjoon_11522 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < p; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			String k = token.nextToken();
			int n = Integer.parseInt(token.nextToken());

//			sb.append(String.format("%d %d %d %d\n", 
//					i + 1, (n * (n + 1)) / 2, n * n, n * n + n));
			sb.append(k + " " + 
					((n * (n + 1)) / 2) + " " + 
					(n * n) + " " + (n * n + n) + "\n");
		}

		System.out.println(sb);
	}

}
