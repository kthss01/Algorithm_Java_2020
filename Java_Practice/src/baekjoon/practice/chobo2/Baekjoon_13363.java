package baekjoon.practice.chobo2;

import java.util.Scanner;

/*
 * Jumbled Compass
 * 
 * Jumbled 뒤죽박죽
 * Compass 나침반
 * animating ~에 움직임을 주다
 * convinced 확신을 가진
 * diametrically 직경으로
 * 
 * 나침반 바늘 방향 가리킴 (0 ~ 359
 * 0 north east 90 
 * + 시계방향으로 회전
 * - 반시계방향으로 회전
 * 
 * n1 (0 <= n1 <= 359) current direction
 * n2 (0 <= n2 <= 359) correct direction
 * 
 * 현재 방향이 올바른 방향이 되기위해 가장 빠른 거리 출력하기
 * 어디든 같으면 시계방향으로 회전
 * 	ex) 180 -180보다는 180으로 출력
 * 
 * 쉬운 문제인데 굉장히 헷갈리는 문제임
 */

public class Baekjoon_13363 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cur = sc.nextInt();
		int cor = sc.nextInt();
		sc.close();

		/*
		 * solution 찾아서 이거 보고 구현해봄
		 */

//		if (cor - cur > 180)
//			System.out.println(cor - cur - 360);
//		else if (cor - cur > -180)
//			System.out.println(cor - cur);
//		else
//			System.out.println(cor - cur + 360);

		// 더 좋은 풀이도 있음
		int x = (cor - cur + 360) % 360; // 시계 방향
		int y = (cur - cor + 360) % 360; // 반시계 방향
		System.out.println(x > y ? -y : x);

		// 했는데 틀린 거
//		int clockwiseDir = 0;
//		// 시계방향 회전
//		if (cur < cor) {
//			clockwiseDir = cor - cur;
//		}
//
//		else {
//			clockwiseDir = 360 - cur + cor;
//		}
//
//		int counterClockwiseDir = 0;
//		// 반시계방향 회전
//		if (cur < cor) {
//			counterClockwiseDir = -cur - (360 - cor);
//		} else {
//			counterClockwiseDir = cor - cur;
//		}
//		
//		// test
////		System.out.println(clockwiseDir);
////		System.out.println(counterClockwiseDir);
//
//		if (clockwiseDir <= -counterClockwiseDir)
//			System.out.println(clockwiseDir);
////		else if(clockwiseDir == -counterClockwiseDir)
////			System.out.println(Math.abs(clockwiseDir));
//		else
//			System.out.println(counterClockwiseDir);
	}
}
