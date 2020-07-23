package baekjoon.practice.chobo2;

import java.util.Scanner;

/*
 * Milk Pails (Bronze)
 * pails 양동이
 * 
 * 3개의 양동이가 있음 X Y M
 * 	가장 작은 양동이 X M 넘치지 않을 때까지 채울 수 있음
 * 	중간 양동이 Y로 M이 넘치지 않을 떄까지 채울 수 있음
 * 
 * 양동이 M의 최대로 채울 수 있는 양 구하기
 */

public class Baekjoon_11999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		int ans = 0;

		int temp = 0;
		for (int i = 0; i < m / x + 1; i++) {
			for (int j = 0; j < m / y + 1; j++) {
				temp = i * x + j * y;
				if (temp <= m && temp >= ans)
					ans = temp;
			}
		}

		System.out.println(ans);
	}

}
