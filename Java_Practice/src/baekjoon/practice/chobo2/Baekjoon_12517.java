package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Centauri Prime (Small 1)
 * 	원시 센타우르스
 * consonant 자음
 * vowel 모음
 * coincidence 우연의 일치
 * turmoil 소란
 * 
 * 자음으로 끝나면 king
 * 모음으로 끝나면 queen
 * y로 끝나면 nobody
 * 이름보고 누가 다스리는지 출력
 * 
 * 1 <= T <= 300 test cases
 * each country name 3 ~ 20 letters
 * 
 * 오타 조심 엄청 틀리고 있음
 */

public class Baekjoon_12517 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = new Integer(br.readLine());
		for (int i = 0; i < t; i++) {
			String country = br.readLine().trim();
			char lastCh = country.charAt(country.length() - 1);
			sb.append(String.format(
					"Case #%d: %s is ruled by ", i + 1, country));
			if (lastCh == 'y')
				sb.append("nobody.\n");
			else if (lastCh == 'a' 
					|| lastCh == 'e' || lastCh == 'i' 
					|| lastCh == 'o' || lastCh == 'u')
				sb.append("a queen.\n");
			else
				sb.append("a king.\n");
		}
		System.out.println(sb);
	}

}
