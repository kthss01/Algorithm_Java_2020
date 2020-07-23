package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Centauri Prime (Small 2)
 * small 1과 같은 문제라고 봄
 * 근데 틀림 이유 찾아봐야함
 * 
 * at most 최대
 */

public class Baekjoon_12526 {

	static String Case = "Case #";
	static String Colon = ": ";
	static String Ruled = " is ruled by ";
	static String K = "a king.";
	static String Q = "a queen.";
	static String N = "nobody.";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = new Integer(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			String country = br.readLine().trim();

			sb.append(Case)
			  .append(i + 1)
			  .append(Colon)
			  .append(country)
			  .append(Ruled)
			  .append(find(country.charAt(country.length() - 1)))
			  .append("\n");
		}

		System.out.println(sb);
	}

	public static String find(char c) {
		switch (c) {
		case 'y':
		case 'Y':
			return N;
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			return Q;
		default:
			return K;
		}
	}

}
