package backjoon;

import java.util.Arrays;
import java.util.Scanner;

// Test용 

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

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		StringBuilder sb = new StringBuilder();
		int n = 2 * k - 1; // 세로 길이 절반
		int m = 4 * k - 3; // 가로 길이

		char[][] map = new char[n][m];

		for (int i = 0; i < n; i++)
			Arrays.fill(map[i], ' ');

		for (int i = 0; i < n; i += (n - 1)) {
			// 위 **** **** 이거
			for (int j = 0; j < k; j++)
				map[i][j] = '*';
			// 아래 **** **** 이거
			for (int j = m - k; j < m; j++)
				map[i][j] = '*';
		}

		for (int i = 0; i < k; i++) {
			// 제일 왼쪽 대각선
			map[i][i] = '*';
			// 2번째 왼쪽 대각선
			map[i][i + k - 1] = '*';
			// 3번째 왼쪽 대각선
			map[i + k - 1][i + 2 * k - 2] = '*';
			// 4번째 왼쪽 대각선
			map[i + k - 1][i + 3 * k - 3] = '*';

			// 아래 반절
			map[i][m - k - i] = '*';
			map[i][m - i - 1] = '*';
			map[i + k - 1][m - k - i - 2 * k + 2] = '*';
			map[i + k - 1][m - i - 1 - 2 * k + 2] = '*';
		}
		
		for(int i=0; i<k; i++) {
			for(int j=0; j<m-i; j++)
				sb.append(map[i][j]);
			sb.append('\n');
		}
		for(int i=k; i<n;i++) {
			for(int j=0; j<m-k+i-k+2;j++)
				sb.append(map[i][j]);
			sb.append('\n');
		}
		
		System.out.println(sb.toString());
	}
}