package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * retain 유지
 * regular expression을 이용해서 한번 이상 반복된 단어들 제거해볼꺼
 * 그러나 처음 한번 반복된 거는 유지할 거
 * 
 * ex)
 * I love Love to To tO code
 * I love to code
 * 
 * 10^4 English alphabetic letters and white spaces
 * 1 <= n <= 100 문장 갯수
 * 
 * ex)
 * 5
 * Goodbye bye bye world world world
 * Sam went went to to to his business
 * Reya is is the the best player in eye eye game
 * in inthe
 * Hello hello Ab aB
 * 
 * Goodbye bye world
 * Sam went to his business
 * Reya is the best player in eye game
 * in inthe
 * Hello Ab
 */

public class JavaRegex2_DuplicateWords {

	public static void main(String[] args) {
		/*
		 * regex = “\\b(\\w+)(\\s+\\1\\b)+” 
		 * 여기서 \\1은 subpattern (\\w+)을 의미함 
		 * \\b 는 단어의 경계(공백) 
		 * \\w Alphanumeric을 제외한 문자 (alphabet, 숫자) 문자, [a-zA-z_0-9]와 동일 
		 * \\s whitespace 1개  
		 * +1회이상 반복 
		 * -> (\\s+\\1\\b)+ 이 패턴이 1 이상이면 
		 * -> 앞에 공백있고 문자오고 공백1개이상 오고 문자뒤 공백 있는 패턴 찾는다는 얘기
		 * 추가로 discussion에 있는 해답에서 
		 * ?:는 이것을 non-capturing group 이라는 거로 만드는 거로 
		 * group을 얻을 때 group()을 할 수 없다는 의미로 성능 향상이 있다고 함 (이건 넘어가자)
		 */
		String regex = "\\b(\\w+)(?:\\s+\\1\\b)+";
		
		// Pattern.CASE_INSENSITIVE 대소문자 구분 x
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());
		
		while(numSentences-- > 0) {
			String input = in.nextLine();
			
			Matcher m = p.matcher(input);
			
			while(m.find()) {
//				System.out.println(m.group());
//				System.out.println(m.group(1));
				// m.group() 찾은거 전체를 말하는거 그걸 group 1번째로 바꾸겠다는거
				input = input.replaceAll(m.group(), m.group(1));
			}
			
			System.out.println(input);
		}
		
		in.close();
	}

}
