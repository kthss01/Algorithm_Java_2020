package introduction;

import java.util.Scanner;

/*
 * 문자열과 범위 start end-1이 주어질 때 부분 문자열 구하기
 * 
 * 1 <= |s| <= 100
 * 0 <= start < end <= n
 * 
 * ex)
 * Helloworld
 * 3 7
 * 
 * lowo
 */
public class Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		
		System.out.println(s.substring(start, end));
	}

}
