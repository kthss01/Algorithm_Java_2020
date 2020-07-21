package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * Have you had your birthday yet?
 * 
 * 날짜가 주어질 때 생일이 지났는지 출력하기
 * 
 * 2007년 9월 4일 기준으로 생일 지났으면 Yes
 * 아직이면 No
 * 해당일이면 Happy birthday
 * 2월 29일이면 Unlucky 
 * 출력
 * 0 # 이면 종료
 *  */

public class Baekjoon_9948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> months = new HashMap<>();
		months.put("January", 1);
		months.put("February", 2);
		months.put("March", 3);
		months.put("April", 4);
		months.put("May", 5);
		months.put("June", 6);
		months.put("July", 7);
		months.put("August", 8);
		months.put("September", 9);
		months.put("October", 10);
		months.put("November", 11);
		months.put("December", 12);

		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int day = Integer.parseInt(token.nextToken());
			String month = token.nextToken();

			if (day == 0 && month.equals("#"))
				break;

			if (months.get(month) < months.get("August")) {
				if (months.get(month) == months.get("February") && day == 29) {
					sb.append("Unlucky");
				} else {
					sb.append("Yes");
				}
			} else if (months.get(month) == months.get("August")) {
				if (day == 4) {
					sb.append("Happy birthday");
				} else if (day < 4) {
					sb.append("Yes");
				} else {
					sb.append("No");
				}
			} else {
				sb.append("No");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

}
