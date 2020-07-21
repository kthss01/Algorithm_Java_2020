package baekjoon.practice.chobo2;

import java.util.Scanner;

/*
 * Automated Checking Machine
 * 
 * 두 개의 connection points를 받아서 둘이 맞으면 Y 틀리면 N 출력
 * 5개 씩 입력받음
 * 
 */

public class Baekjoon_10395 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		int[] b = new int[5];
		for (int i = 0; i < 5; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < 5; i++)
			b[i] = sc.nextInt();

		sc.close();

		boolean isConnect = true;
//		for (int i = 0; i < 5; i++) {
//			if (((a[i] == 1 || b[i] == 1) && a[i] * b[i] != 0)
//					|| (a[i] == 0 && b[i] == 0)){
//				isConnect = false;
//				break;
//			}
//		}

		// 이 방법도 있음
		for (int i = 0; i < 5; i++) {
			if (a[i] + b[i] != 1) {
				isConnect = false;
				break;
			}
		}

		System.out.println(isConnect ? "Y" : "N");
	}

}
