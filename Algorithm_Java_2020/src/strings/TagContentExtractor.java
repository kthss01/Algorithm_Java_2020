package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * tag-based 언어인 XML or HTML은 <tag>contents</tag>로 묶여있음
 * 
 * tag-based language 문자열이 주어질 때
 * parse this text and retrieve the contents
 * 근데 태그가 올바르게 되있는걸 해야함
 * <h1>Hello World</h2> is not valid
 * Tag can be nested,
 * 	but content between nested tags is considered not valid
 * ex)
 * 	<h1><a>contents></a>invalid</h1>
 * 	여기서 "contents" is valid but "invalid" is not valid
 * Tags can consist of any printable characters
 * 
 * 1 <= N <= 100 (the number of lines)
 * 각 줄은 10^4 출력 가능한 문자
 * 모든 문자의 갯수는 10^6 안넘음
 * 
 * valid content만 출력하기
 * 
 * Regex로 풀어야하는 문제 같음
 */

public class TagContentExtractor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		// [^<] 의미 문자열 시작이 <를 제외한거 
		String regex = "<(.+)>([^<]+)</\\1>";
		Pattern p = Pattern.compile(regex);
		
		while(testCases > 0) {
			String line = in.nextLine();
			
			Matcher m = p.matcher(line);
			boolean isFind = false;
			while(m.find()) {
				System.out.println(m.group(2));
				isFind = true;
			}
			if(isFind == false)
				System.out.println("None");
			
			testCases--;
		}
	}

}
