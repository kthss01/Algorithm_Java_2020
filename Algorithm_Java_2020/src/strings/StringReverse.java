package strings;

import java.util.Scanner;

/*
 * 문자열 A가 주어질 때 palindrome인지 아닌지 확인
 * 맞으면 Yes 아니면 No 출력
 * A 50보다 작은 소문자
 * 
 * ex) 
 * madam
 * Yes
 * 
 */

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		sc.close();

		// test 이거 안됨 .charAt으로 접근
//		String a = "123";
//		System.out.println(a[1]);

		boolean isPalindrome = true;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != A.charAt(A.length() - i - 1))
				isPalindrome = false;
		}
		if (isPalindrome)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
