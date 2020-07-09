package bigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Java BigDecimal class 는 아래를 다룸
 * arbitrary(임의의)-precision(정확) 
 * 	signed decimal(소수) numbers
 * 
 * n개의 실수 문자열을 가진 배열 s가 주어질 때 
 * 내림차순으로 정렬하기
 * 그리고 각각의 숫자는 정확히 같은 format으로 출력되야함
 * ex)
 * .1 -> .1
 * 0.1 -> 0.1로
 * 
 * .1 == 0.1 같음 따라서 같은 순서로 정렬해얗마
 */

public class JavaBigDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++)
			s[i] = sc.next();
		sc.close();

		// n+2로 배열 잡은거라 sort 할 때 0, n까지 sort해야함
		
//		Comparator<String> myComparator = new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return new BigDecimal(s2).compareTo(new BigDecimal(s1));
//			}
//		};
//
//		Arrays.sort(s, 0, n, myComparator);

		// 이렇게 적어도 됨
		Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				BigDecimal a = new BigDecimal(o1);
				BigDecimal b = new BigDecimal(o2);
				return a.compareTo(b);
			}
			
		}));
		
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}

}
