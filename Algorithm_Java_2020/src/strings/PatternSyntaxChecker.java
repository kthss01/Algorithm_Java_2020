package strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
 * Regular Expression이고 줄여서 Regex, Regexp - 정규표현식
 * 
 * 패턴이 주어지면 주어진 패턴의 syntax(문법)가 valid한지 확인 
 * 이 문제에서 정규표현식은 무조건 맞고(is only valid = 유효하다)
 * 	Pattern.compile method 활용해야함
 * 
 * 정수 N - test cases
 * 다음 N줄
 * string of nay printable characters representing the pattern of a regex.
 * 
 * 각 경우에 따라 Valid or Invalid 출력
 * 
 * ex)
 * 3
 * ([A-Z]))(.+)
 * (AZ[a-z](a-z)
 * batcatpat(nat 
 * 
 * Valid
 * Invalid
 * Invalid
 */

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.next();

		// 거의 처음으로 try catch 써봄
		for (int i = 0; i < N; i++) {
			String pattern = sc.nextLine();

			try {
				Pattern p = Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}

		sc.close();
	}

}
