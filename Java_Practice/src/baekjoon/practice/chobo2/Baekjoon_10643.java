package baekjoon.practice.chobo2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
 * FUNGHI 
 * funghi - 버섯
 * wicked - 사악한
 * 
 * 피자를 반으로 잘라서 8조각으로 나뉜걸 4조각씩 갖는데
 * 그 안에 버섯을 가장 많이 갖을 수 있는 경우 출력하기
 * 
 * Si (0 <= Si <= 50, i = 1,2,...,8) 시계방향 순
 */

public class Baekjoon_10643 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] slices = new int[8];
		for(int i=0;i<8;i++)
			slices[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i=0; i<8; i++) {
			int sum = slices[i] 
					+ slices[(i+1) % 8]
							+ slices[(i+2) % 8]
									+ slices[(i+3) % 8];
			if(ans < sum)
				ans = sum;
		}
		
		System.out.println(ans);
	}

}
