package baekjoon.practice.chobo2;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Do Not Touch Anything
 * 
 * R행 C열의 직사각형 형태로 좌석이 배치되어 있을 때
 * 모든 좌석을 전부 촬영하도록 CCTV 배치하려할 때, 최소 몇 개의 CCTV가 필요한지
 * 각 CCTV는 N행 N열의 직사각형 영역의 좌석을 촬영할 수 있음
 * 
 * R, C, N (1 <= R, C, N <= 1,000,000)
 * 
 * 최소 개수 출력
 */

public class Baekjoon_13136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int v = sc.nextInt();
		sc.close();

		int row = r / v + (r % v != 0 ? 1 : 0);
		int col = c / v + (c % v != 0 ? 1 : 0);

		System.out.println((long) row * (long) col);
	}

}
