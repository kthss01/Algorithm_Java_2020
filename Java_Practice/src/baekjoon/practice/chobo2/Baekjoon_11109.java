package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 괴짜 교수
 * 
 * 병렬버전과 직렬버전의 시간을 측정해서 병렬화가 좋은지 확인하기
 * 
 * T 테스트 케이스 (T <= 1000)
 * d, n, s, p 
 * 	d (0 <= d <= 1000000) 병렬 버전을 개발하는데 걸리는 시간
 *  n (0 <= n <= 1000000) 다음해 동안 이 프로그램이 실행되는 횟수
 *  s, p (0 <= s, p <= 1000)는 각 직렬버전과 병렬버전의 실행 시간
 * 
 * 병렬화 하는게 좋으면 parallelize 출력
 * 아니면 do not parallelize 출력
 * 같으면 dose not matter
 */

public class Baekjoon_11109 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());

		while (t-- != 0) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(token.nextToken());
			int n = Integer.parseInt(token.nextToken());
			int s = Integer.parseInt(token.nextToken());
			int p = Integer.parseInt(token.nextToken());

			if (d + n * p == n * s)
				System.out.println("does not matter");
			else if (d + n * p > n * s)
				System.out.println("do not parallelize");
			else
				System.out.println("parallelize");
		}
	}

}
