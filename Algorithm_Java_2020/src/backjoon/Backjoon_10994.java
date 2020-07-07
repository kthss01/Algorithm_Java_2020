package backjoon;

import java.util.Scanner;

/*
 * 별 찍기 - 19
 * 
 * 1 <= N <= 100
 * 
 * ex)
 * 1
 * *
 * 
 * 2
 * *****
 * *   *
 * * * *
 * *   *
 * *****
 * 
 * 3
 * *********
 * *       *
 * * ***** *
 * * *   * *
 * * * * * *
 * * *   * *
 * * ***** *
 * *       *
 * *********
 * 
 * 오랜만에 별찍기 문제 풀기
 * 1 5 9 13 (4씩 증가) 이렇게 가로 세로가 증가함
 * 1 2 3 4
 * 
 * 위에서부터 아래로 감소했다가 다시 증가하는 걸로 보면 될듯
 * N이 3일 때
 * 9 4(n-1) + 1
 * 사이드 11
 * 사이드 11 5
 * 사이드 22
 * 사이드 22 1
 * 사이드 22
 * 사이드 11 5
 * 사이드 11
 * 9
 * 
 * 사이드
 */

/*
 * 백준 문제는 제출시 클래스명 Main으로 바꿔줘야함
 * 
 */

/*
 * 잘하는 사람은 재귀호출로 구현함
 */

class Main {
	static int n, Len;
	static char[][] star;

	// 재귀 호출
	public static void draw(int rc, int len) {
		if (len == 1) {
			// 가운데 점
			star[rc][rc] = '*';
			return;
		}

		for (int i = 0; i < len; i++) {
			// 위쪽
			star[rc][rc + i] = '*';
			// 아래쪽
			star[rc + len - 1][rc + i] = '*';
			// 왼쪽 
			star[rc + i][rc] = '*';
			// 오른쪽
			star[rc + i][rc + len - 1] = '*';
		}
		// 빈칸은 같은 패턴인데 한줄만 밀고
		rc++;
		// len - 2 로해서 2칸 짧게
		for (int i = 0; i < len - 2; i++) {
			star[rc][rc + i] = ' ';
			star[rc + len - 3][rc + i] = ' ';
			star[rc + i][rc] = ' ';
			star[rc + i][rc + len - 3] = ' ';
		}
		// 재귀로 안쪽 그리기
		draw(rc + 1, len - 4);
	}

	public static void print() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < Len; i++)
			buffer.append(star[i], 0, Len).append('\n');
		System.out.print(buffer);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Len = (n << 2) - 3; // 4 * n - 3
		star = new char[Len][Len];
		sc.close();

		draw(0, Len);
		print();
	}
}

public class Backjoon_10994 {

	public static void createStar(int n) {
		int m = 4 * (n - 1) + 1;
		char star = '*';
		char blank = ' ';
		String leftSide = "* ";
		String rightSide = " *";
		int sideCnt = 0;

		// 위쪽
		for (int i = n; i > 1; i--) {
			// side ***** side pattern
			for (int j = 0; j < sideCnt; j++)
				System.out.print(leftSide);
			int k = 4 * (i - 1) + 1;
			for (int j = 0; j < k; j++)
				System.out.print(star);
			for (int j = 0; j < sideCnt; j++)
				System.out.print(rightSide);
			System.out.println();

			// side... blank side... pattern
			for (int j = 0; j <= sideCnt; j++)
				System.out.print(leftSide);
			k = 4 * (i - 2) + 1;
			for (int j = 0; j < k; j++)
				System.out.print(blank);
			for (int j = 0; j <= sideCnt; j++)
				System.out.print(rightSide);
			System.out.println();

			sideCnt++;
		}

		// 가운데
		for (int i = 0; i < m; i++) {
			if (i % 2 == 0)
				System.out.print(star);
			else
				System.out.print(blank);
		}
		System.out.println();

//		sideCnt = 0;
		sideCnt--;
		// 아래쪽
		for (int i = 2; i <= n; i++) {
			int k = 4 * (i - 2) + 1;
			// side... blank side... pattern
			for (int j = 0; j <= sideCnt; j++)
				System.out.print(leftSide);
			for (int j = 0; j < k; j++)
				System.out.print(blank);
			for (int j = 0; j <= sideCnt; j++)
				System.out.print(rightSide);
			System.out.println();

			k = 4 * (i - 1) + 1;
			// side ***** side pattern
			for (int j = 0; j < sideCnt; j++)
				System.out.print(leftSide);
			for (int j = 0; j < k; j++)
				System.out.print(star);
			for (int j = 0; j < sideCnt; j++)
				System.out.print(rightSide);
			System.out.println();

			sideCnt--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		createStar(n);
	}

}
