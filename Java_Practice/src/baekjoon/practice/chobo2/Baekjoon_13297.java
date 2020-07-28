package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Quick Estimates
 * 
 * Estimates 견적
 * not that handy 그렇게 편리하지 않다.
 * magnitude 크기
 * 
 * 견적 계산해주기
 * -> 숫자 입력받았을 때 숫자의 자리수 출력
 * 
 * N (1 <= N <= 100)
 * 	cost 0 ~ 10^100
 */

public class Baekjoon_13297 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			String cost = br.readLine();
			sb.append(cost.length() + "\n");
		}

		System.out.println(sb);
	}

}
