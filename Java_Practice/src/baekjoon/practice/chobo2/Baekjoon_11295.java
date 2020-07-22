package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Exercising
 * 
 * pedometer 보수계 (만보계)
 * reasonably 합리적으로
 * 
 * 사용자 보폭 cm 단위 제공 L (10 < L < 100)
 * N 걸음 수 제공 (20000 이하) 
 * 출력은 km 단위로
 * d.ddddd로 표기
 * 
 * L 0이면 끝
 */

public class Baekjoon_11295 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int i = 1;
		while (true) {
			int l = Integer.parseInt(br.readLine().trim());
			if (l == 0)
				break;

//			System.out.printf("User %d\n", i++);
			sb.append("User " + i++ + "\n");
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				int step = Integer.parseInt(br.readLine());
				double result = (l * step) / 100000.0;
//				System.out.printf("%.5f\n", result);
				sb.append(String.format("%.5f\n", result));
			}
		}
		System.out.println(sb);
	}
}
