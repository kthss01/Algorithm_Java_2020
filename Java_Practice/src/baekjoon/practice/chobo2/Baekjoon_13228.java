package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * The REAL Manhattan distance
 * 
 * preliminary 예비
 * take into account ~을 고려하다
 * 
 * 멘하탄 거리 계산하기
 * ex)
 * 3,4,3 -> 3,5,2
 * down 3 
 * x 0
 * y 1
 * up 2
 * = 6
 * 
 * T (1 <= T <= 100) test cases
 * x1 y1 z1 x2 y2 z1 (0 <= x,y, floor <= 10000)
 */

public class Baekjoon_13228 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());

		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int x1 = new Integer(token.nextToken());
			int y1 = new Integer(token.nextToken());
			int f1 = new Integer(token.nextToken());
			int x2 = new Integer(token.nextToken());
			int y2 = new Integer(token.nextToken());
			int f2 = new Integer(token.nextToken());

			sb.append(f1 + f2 + Math.abs(x1 - x2) + Math.abs(y1 - y2) + "\n");
		}

		System.out.println(sb);
	}

}
