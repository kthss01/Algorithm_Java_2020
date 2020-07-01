package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 문자열 s가 주어질 때
 * regular expression [A-Za-z !,?._'@]
 * 이걸 split해라
 * tokens 갯수도 출력
 * 
 * 1 <= length of s <= 4x10^5
 * 문자열에는 ! , ? . _ ' @ 도 들어있음
 * 
 * ex)
 * He is a very very good boy, isn't he?
 * 
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 */

public class StringTokens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		// split으로 하면 공백 추가됨 stringtokenizer 써야함 속도도 더 빠르다고함
//		String regex = " |!|,|\\?|.|_|@";
		// 뭔가 이상함 .이 문제
		String regex = "!|,|\\?|_|@|\\.|'| ";
		// test 잘됨
//		String regex = " |\\?";
//		String[] tokens = s.split(regex);
//		
//		System.out.println(tokens.length);
//		for (String string : tokens) {
//			System.out.println(string);
//		}
		
		StringTokenizer tokenizer = new StringTokenizer(s, regex);
		System.out.println(tokenizer.countTokens());
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}

}
