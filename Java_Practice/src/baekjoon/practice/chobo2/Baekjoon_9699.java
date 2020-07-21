package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * RICE SACK
 * 	쌀 자루
 * 
 * 가장 무거운 쌀 자루 찾기
 * 
 * t test cases
 * 5 integers (the weights of 5 rice sacks)
 * 	no sack will have a weight of more than 100 unit.
 */

public class Baekjoon_9699 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int ans = Integer.parseInt(token.nextToken());
			while (token.hasMoreTokens()) {
				int temp = Integer.parseInt(token.nextToken());
				if (ans < temp)
					ans = temp;
			}

			sb.append(String.format("Case #%d: %d\n", i + 1, ans));
		}
		System.out.println(sb);
	}

}
