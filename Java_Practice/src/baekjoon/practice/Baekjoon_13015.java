package baekjoon.practice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 별 찍기 - 23
 * 
 * N (2 <= N <= 100)
 * 
 * ex)
 *  2
 * 	** **
 	 ***
 	** **
 *  5
 *	*****       *****
	 *   *     *   *
	  *   *   *   *
	   *   * *   *
	    *   *   *
	   *   * *   *
	  *   *   *   *
	 *   *     *   *
	*****       *****
	
 */

/*
 * 잘한 사람꺼 코드 참고 구현
 */

//class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
//		sc.close();
//
//		StringBuilder sb = new StringBuilder();
//		int n = 2 * k - 1; // 세로 길이 절반
//		int m = 4 * k - 3; // 가로 길이
//
//		char[][] map = new char[n][m];
//
//		for (int i = 0; i < n; i++)
//			Arrays.fill(map[i], ' ');
//
//		for (int i = 0; i < n; i += (n - 1)) {
//			// 위 **** **** 이거
//			for (int j = 0; j < k; j++)
//				map[i][j] = '*';
//			// 아래 **** **** 이거
//			for (int j = m - k; j < m; j++)
//				map[i][j] = '*';
//		}
//
//		for (int i = 0; i < k; i++) {
//			// 제일 왼쪽 대각선
//			map[i][i] = '*';
//			// 그 옆의 왼쪽 대각선
//			map[i][i + k - 1] = '*';
//			map[i + k - 1][i + 2 * k - 2] = '*';
//			map[i + k - 1][i + 3 * k - 3] = '*';
//
//			map[i][m - k - i] = '*';
//			map[i][m - i - 1] = '*';
//			map[i + k - 1][m - k - i - 2 * k + 2] = '*';
//			map[i + k - 1][m - i - 1 - 2 * k + 2] = '*';
//		}
//		
//		for(int i=0; i<k; i++) {
//			for(int j=0; j<m-i; j++)
//				sb.append(map[i][j]);
//			sb.append('\n');
//		}
//		for(int i=k; i<n;i++) {
//			for(int j=0; j<m-k+i-k+2;j++)
//				sb.append(map[i][j]);
//			sb.append('\n');
//		}
//		
//		System.out.println(sb.toString());
//	}
//}

public class Baekjoon_13015 {

	public static void createStar(int n) {
		char star = '*';
		char blank = ' ';

		String sideStar = "";
		for (int i = 0; i < n; i++)
			sideStar += star;
		String fixBlank = "";
		for (int i = 0; i < n - 2; i++)
			fixBlank += blank;

		// 위쪽 pattern
		for (int i = n; i >= 1; i--) {
			// sideStar(fix) blank sideStar(fix)
			if (i == n) {
				System.out.print(sideStar);
				// blank 1,3,5,7 ... (n = 2,3,4,5 일 때)
				// 2n-3
				int k = 2 * i - 3;
				for (int j = 0; j < k; j++)
					System.out.print(blank);
				System.out.print(sideStar);
			}
			// leftBlank star blank(fix) star
			// 계속) centerBlank star blank(fix) star
			else {
				// leftBlank 1 2 3 4 (n = 4 3 2 1 일 때)
				for (int j = 0; j < n - i; j++)
					System.out.print(blank);
				System.out.print(star);
				System.out.print(fixBlank);
				System.out.print(star);
				// blank 1,3,5,7 ... (n = 2,3,4,5 일 때)
				// 2n-3
				int k = 2 * i - 3;
				for (int j = 0; j < k; j++)
					System.out.print(blank);
				if (i != 1)
					System.out.print(star);
				System.out.print(fixBlank);
				System.out.print(star);
			}
			System.out.println();
		}

		// 가운데 -> 위쪽에 포함시킴
		// leftBlank star blank(fix) star blank(fix) star

		// 아래쪽 pattern 위쪽 반대
		for (int i = 2; i <= n; i++) {
			// sideStar(fix) blank sideStar(fix)
			if (i == n) {
				System.out.print(sideStar);
				// blank 1,3,5,7 ... (n = 2,3,4,5 일 때)
				// 2n-3
				int k = 2 * i - 3;
				for (int j = 0; j < k; j++)
					System.out.print(blank);
				System.out.print(sideStar);
			}
			// leftBlank star blank(fix) star
			// 계속) centerBlank star blank(fix) star
			else {
				// leftBlank 1 2 3 4 (n = 4 3 2 1 일 때)
				for (int j = 0; j < n - i; j++)
					System.out.print(blank);
				System.out.print(star);
				System.out.print(fixBlank);
				System.out.print(star);
				// blank 1,3,5,7 ... (n = 2,3,4,5 일 때)
				// 2n-3
				int k = 2 * i - 3;
				for (int j = 0; j < k; j++)
					System.out.print(blank);
				if (i != 1)
					System.out.print(star);
				System.out.print(fixBlank);
				System.out.print(star);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		createStar(n);
	}

}
