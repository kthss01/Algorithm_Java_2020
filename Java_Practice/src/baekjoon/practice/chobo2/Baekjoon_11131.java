package baekjoon.practice.chobo2;

import java.util.Scanner;

/*
 * Balancing Weights
 * 
 * massless support 대규모 지원
 * torque 토크
 * inertia 관성
 * perpendicular 수직
 * perpendicular distance 수직 거리
 * Equilibrium 평형
 * 
 * 0 < T <= 100 test cases
 * 	0 < N <= 100 the number of weights
 * 의미는 중심으로부터의 거리
 * 	lever 무게 2000g 각 weight 100g
 * 거리에 따라 balance 갈릴 듯
 * 그냥 다 더해서 +-0에 따라 출력하면 되는 문제 같음
 * -> 맞음
 * 
 * Left Right Equilibrium 중 출력
 */

public class Baekjoon_11131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();

			int balence = 0;
			for (int j = 0; j < n; j++) {
				int w = sc.nextInt();
				balence += w;
			}
			if (balence < 0)
				sb.append("Left\n");
			else if (balence > 0)
				sb.append("Right\n");
			else
				sb.append("Equilibrium\n");
		}
		
		System.out.println(sb);
		
		sc.close();
	}

}
