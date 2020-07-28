package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Matches
 * matches 성냥
 * 
 * 성냥 크기가 박스에 맞는지 확인하기
 * 
 * N (1 <= N <= 50) the number of matches
 * W H (1 <= W, H <= 100) dimensions(넓이) of box
 *  each N 1 ~ 1000
 *  
 *  YES NO 출력
 * 
 */

public class Baekjoon_13222 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nwh = br.readLine().trim().split(" ");
		int n = new Integer(nwh[0]);
		int w = new Integer(nwh[1]);
		int h = new Integer(nwh[2]);
		int d = (int)Math.sqrt(w * w + h * h);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int m = new Integer(br.readLine().trim());
			// d보다 작으면 일단 되서 이것만 체크하면 됨
			sb.append((m <= d ? "YES" : "NO") + "\n");
		}
		
		System.out.println(sb);

	}

}
