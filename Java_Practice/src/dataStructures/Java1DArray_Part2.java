package dataStructures;

import java.util.Scanner;

/*
 * 게임 규칙이 있음
 * 길이가 n인 배열 name의 0번째 위치에 잇음
 * i (0 <= i < n) 인덱스가 주어질 때 다음과 같이 수행을 함
 * 
 *  i-1이 있고 그 값이 0일 때 i-1로 이동 가능
 *  i+1이 있고 그 값이 0일 때 i+1로 이동 가능
 *  i+leap 값이 0이면 i+leap 값으로 jump 가능
 *  
 *  내가 n-1 번째 값이나 i+leap가 n이상인 값이면 게임에서 이김
 *  
 *  leap와 game이 주어질 때 이기는지 지는지 구하기
 *  
 *  1 <= q <= 5000 query
 *  2 <= n <= 100 배열의 길이
 *  0 <= leap <= 100 (점프)
 *  game[0] 0임을 보장
 * 
 * 
 * ex)
 * 4
 * 5 3
 * 0 0 0 0 0
 * 6 5
 * 0 0 0 1 1 1
 * 6 3
 * 0 0 1 1 1 0
 * 3 1
 * 0 1 0
 * 
 * YES
 * YES
 * NO
 * NO
 * 
 * 이거 greedy 알고리즘인거 같은 느낌이 듬 쉬운 문제는 아님
 * -> 재귀 호출로 구현해야할 것 같음
 * 갓던데 또 못가게해야함 대충 구현해보니 stack 터짐 
 */

public class Java1DArray_Part2 {

	public static boolean canWin(int index, int leap, int[] game) {
		if (index + leap >= game.length)
			return true;

		if (index - 1 >= 0 && game[index + 1] == 0)
			canWin(index - 1, leap, game);
		if (index + 1 < game.length && game[index + 1] == 0)
			canWin(index + 1, leap, game);
		if (game[index + leap] == 0)
			canWin(index + leap, leap, game);

		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(0, leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}

}
