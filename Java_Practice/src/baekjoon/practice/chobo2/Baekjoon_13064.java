package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Cameras 
 * 
 * traffic cameras 교통 카메라
 * 
 * 차 번호가 규칙에 맞게 작성되어있는지 확인하기
 * 	It is 8 characters long
 * 	The two leftmost characters are identical(동일한) digits between 1 to 9,
 * 		which indicate in which city the car number is issued.
 * 	The following two characters are two digits between 1 to 9.
 *  The following characters is a capital English(대문자) letter.
 *  The three rightmost characters are also digits between 1 to 9
 *  
 *  88 35 R 551
 *  
 *  n 1 <= n <= 1000
 *  8 numerical or English alphabetical characters
 *  
 *  맞게 나온 자동차 번호 출력
 *  중복되서 나오면 다 출력
 */

public class Baekjoon_13064 {

	public static boolean checkNumber(char c) {
		return c >= '1' && c <= '9';
	}

	public static boolean checkAlphabet(char c) {
//		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'); 
		// 대문자만임
		return (c >= 'A' && c <= 'Z');
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = new Integer(br.readLine());

		for (int i = 0; i < n; i++) {
			char[] num = br.readLine().trim().toCharArray();

			//
			if (!((num[0] == num[1]) && checkNumber(num[0]) && checkNumber(num[1])))
				continue;
			//
			if (!(checkNumber(num[2]) && checkNumber(num[3])))
				continue;

			//
			if (!(checkAlphabet(num[4])))
				continue;

			//
			if (!(checkNumber(num[5]) && checkNumber(num[6]) && checkNumber(num[7])))
				continue;

			sb.append(new String(num) + "\n");
		}

		System.out.println(sb);
	}
}
