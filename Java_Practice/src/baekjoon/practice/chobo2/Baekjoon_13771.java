package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Presents
 * 
 * 선물 살때 제일 싼거 말고 2번째 싼거 삼
 * 2번째 싼거 찾기
 * 
 * N number of prices (2 <= N <= 100)
 * 	No price will be duplicated
 * 소수점 2자리 실수
 * 
 * 2번째로 싼거 출력
 */

public class Baekjoon_13771 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		
		ArrayList<Double> gifts = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			gifts.add(new Double(br.readLine()));
		}
		
		Collections.sort(gifts);
		System.out.printf("%.2f", gifts.get(1));
		
		// 많이 느림
//		System.out.printf("%.2f", gifts.stream().sorted().toArray()[1]);
	}
}
