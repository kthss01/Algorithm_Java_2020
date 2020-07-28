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
 */

public class Baekjoon_13363 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cur = sc.nextInt();
		int cor = sc.nextInt();
		sc.close();

		if (cur > cor) {
			if (cur - cor > cor + 360 - cur)
				System.out.println(cor + 360 - cur);
			else
				System.out.println(cur - cor);
		} else {
			if (cor - cur < cur + 360 - cor)
				System.out.println(cor - cur);
			else
				System.out.println(cor - (360 + cur));
		}
	}
}
