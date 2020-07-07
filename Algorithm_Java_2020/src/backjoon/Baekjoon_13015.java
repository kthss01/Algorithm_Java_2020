package backjoon;

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
 * 잘한 사람꺼 코드 willook 이분꺼 보고있는 중
 */

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();
		
		int n = 2 * k - 1;
		int m = 4 * k - 3;
		
		char[][] map = new char[n][m];
	} 
}

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
