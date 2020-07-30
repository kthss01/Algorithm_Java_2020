package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Holes
 *	hole 구멍
 * 
 * context에서 hole
 * a o 같이 영역 감싸진거 말함
 * a o 는 hole 1개
 * b 2개
 * c e f 0개
 * 
 * hole 총 개수 구하기
 * 
 * N a line (0 < N <= 30)
 * text only upper case letters and spaces
 * it will contain at least 1 letter
 * The length of the text is no more than 250 characters
 * 
 * 각 줄마다 hole 출력
 */

public class Baekjoon_13772 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		
		// "ABCDEFGHIJKLMNOPQRSUTVWXYZ ";
		
		for (int i = 0; i < n; i++) {
			String text = br.readLine();
			
		}
	}

}
