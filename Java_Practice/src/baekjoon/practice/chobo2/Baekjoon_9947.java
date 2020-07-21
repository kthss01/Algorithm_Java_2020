package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Coin tossing
 * 
 * 코인 던져서 맞추는 게임 진행
 * 몇 점씩 얻었는지 구하기
 * 
 * 2 names (no more than 20 letters each and separated by a space)
 * coin tosses (0 <= n <= 1000)
 * H or T 2 characters
 * 
 * 끝은 # # 으로
 * 누가 몇점 땃는지 출력
 * 
 */

public class Baekjoon_9947 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String[] names = br.readLine().split(" ");
			if (names[0].equals("#") && names[1].equals("#"))
				break;
			int[] scores = new int[2];
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				String[] toss = br.readLine().split(" ");
				if (toss[0].equals(toss[1])) {
					scores[0]++;
				} else
					scores[1]++;
			}

			sb.append(String.format(
					"%s %d %s %d\n", names[0], scores[0], names[1], scores[1]));
		}

		System.out.println(sb);
	}

}
