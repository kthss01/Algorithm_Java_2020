package backjoon.practice.kingchobo;

import java.util.Scanner;

/*
 * Tri-du (영어가 아니라서 번역기 돌림 - 포르투칼어였음)
 * 	인기 있는 Truco 게임에서 파생된 카드 게임
 * 	이 게임은 표준 52장의 카드 덱을 사용하며 각 소송마다 13장의 카드가 사용되지만 소송은 무시됨
 * 	1에서 13까지의 정수로 간주되는 카드 값만 사용됨
 * 
 * 게임에서 각 플레이어는 3장의 카드를 받음
 * 	트리오 (같은 순위의 3장의 카드)는 2배 (같은 순위의 2장)을 이김
 * 	고 가치 카드의 트리오가 저 가치 카드의 트리오보다 승리
 * 	더 높은 가치의 카드로 구성된 쌍은 더 낮은 가치의 카드로 구성된 쌍보다 승리
 * 
 * 많은 상황에서 게임에 승자가 없을 수도 있음 이 경우, 처리된 카드는 덱으로 돌아와 섞여 새로운 게임 시작
 * 플레이어는 이미 2장의 카드를 받았으며 자신의 가치를 알고 있음
 * 당신의 임무는 플레이어가 게임에서 이길 확률을 최대화하는 세 번쨰 카드의 가치를 결정하는 프로그램을 작성하는 것
 * 
 * A (1 <= A <= 13) B (1 <= B <= 13)
 * 플레이어가 게임에서 이길 확률을 최대화하는 카드의 값을 나타내는 정수로 한 줄을 생성
 */

public class Backjoon_13597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int c = 0;
		// 트리오
		if (a == b) {
			c = a;
		} else if (a > b) {
			c = a;
		} else
			c = b;

		System.out.println(c);
	}

}
