package baekjoon.practice.kingchobo;

import java.util.Scanner;

/*
 * FYI
 *	FYI = For Your Information - 참고바람
 *
 * 미국에서 전통적으로 앞자리 555면 directory information and assistance 제공해왔음 
 * 전화번호 7자리에서 앞자리 3자리가 555인거 찾기
 * 
 * 7 digit (1000000 <= N <= 9999999) 받을 때 앞자리가 555면 YES 아니면 NO
 */

public class Baekjoon_17863 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		sc.close();

		if (number.subSequence(0, 3).equals("555"))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
