package baekjoon.practice.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Buffoon 
 * 
 * buffoon - 익살 광대
 * nourish 키우다
 * court 코트
 * relieve 안심시키다
 * rejoicing 기쁨
 * 
 * buffoon 을 뽑는다고함 가장 많이 vote 받으면 되고
 * 만약 동률이면 먼저 등록한 사람이 buffoon이 됨
 * 
 * young Carlos가 당선되는지 확인하기
 * 	가장 먼저 등록한 상황
 * 
 * N (1 <= N <= 10^4)
 * 전체표는 100,000를 넘지 않음
 */

public class Baekjoon_17530 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int s = Integer.parseInt(br.readLine());
		boolean isElected = true;

		for (int i = 1; i < n; i++) {
			int v = Integer.parseInt(br.readLine());
			if (s < v) {
				isElected = false;
				break;
			}
		}

		if (isElected == true)
			System.out.println("S");
		else
			System.out.println("N");
	}

}
