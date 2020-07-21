package baekjoon.practice.kingchobo;

import java.util.Scanner;

/*
 * 타일 채우기 4
 * 
 * N x M 크기의 벽에 2x1, 1x2 크기의 타일을 채우려고 한다.
 * 겹치지 않게 놓는다면, 최대 몇 개를 채울 수 잇을까?
 * 
 * N, M (1 <= N,M <= 1,000,000,000)
 * 
 * 채울 수 있는 타일의 개수 최댓값 출력
 */

public class Baekjoon_15700 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		System.out.println(n * m / 2);
	}

}
