package baekjoon.practice.chobo2;

import java.util.Scanner;

/*
 * Rectangles 사각형
 * 	triangle - 삼각형
 * 
 * 사각형을 구하는 테이블이 주어질 때 0으로 된 빈칸 채우기
 * 
 * ex)
 * 2 0 6
 * 2 3 6
 * 
 * 0 0 0 종료
 */

public class Baekjoon_9950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 0 && b == 0 && c == 0)
				break;

			if (a == 0)
				a = c / b;
			else if (b == 0)
				b = c / a;
			else
				c = a * b;

			System.out.println(a + " " + b + " " + c);
		}

		sc.close();
	}

}
