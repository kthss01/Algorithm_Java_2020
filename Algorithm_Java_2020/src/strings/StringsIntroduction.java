package strings;

import java.util.Scanner;

/*
 * 두개의 소문자로 된 영어 글자 문자열이 주어질 때
 * 다음을 수행
 * 1. sum of the lengths of A and B
 * 2. A가 B보다 lexicographically (사전적으로) 큰지 비교
 * 3. 각 문자열의 첫글자 대문자로 바꾸고 빈칸으로 띄어서 A B 출력
 * 
 */
public class StringsIntroduction {

	public static void main(String[] args) {
		// test
//		System.out.println("abc".substring(0,1));
		
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		String B = scan.nextLine();
		
		System.out.println(A.length() + B.length());
		if(A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		A = A.substring(0,1).toUpperCase() + A.substring(1);
		B = B.substring(0,1).toUpperCase() + B.substring(1);
		System.out.println(A + " " + B);
		
		scan.close();
	}

}
