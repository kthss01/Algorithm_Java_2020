package baekjoon.practice.chobo2;

import java.util.Scanner;

/*
 * Badminton
 * 
 * 배드민턴 경기 승부 계산하기
 * 	3 경기 중 2 경기 이겨야함
 * 	21점 먼저 얻으면 이김
 * 		20-20 tie는 고려 안함
 * 	serve 상관없이 포인트 얻음
 * 	한 게임 후의 새 게임은 0-0으로 시작
 * 
 * A or B로 연속된 문자열 입력 받음
 * 누가 이겼는지 점수와 승자 출력
 * 
 * ex)
 * AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
 * 
 * 21-0
 * 21-0
 * A
 */

public class Baekjoon_13216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] score = sc.nextLine().toCharArray();
		sc.close();

		StringBuilder sb = new StringBuilder();
		
		int scoreA = 0;
		int scoreB = 0;
		int sumA = 0;
		int sumB = 0;

		for (char c : score) {
			if (c == 'A') {
				scoreA++;
				if (scoreA == 21) {
					sb.append(String.format("%d-%d\n", scoreA, scoreB));
					sumA++;
					scoreA = 0;
					scoreB = 0;
				}
			} else {
				scoreB++;
				if (scoreB == 21) {
					sb.append(String.format("%d-%d\n", scoreA, scoreB));
					sumB++;
					scoreA = 0;
					scoreB = 0;
				}
			}
		}
		
		if(sumA > sumB)
			sb.append("A\n");
		else
			sb.append("B\n");
			
		System.out.println(sb);
	}

}
