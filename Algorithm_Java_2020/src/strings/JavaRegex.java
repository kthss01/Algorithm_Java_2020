package strings;

import java.util.Scanner;

/*
 * string pattern을 가지고 있는 MyRegex 클래스 작성
 * 
 * 아스키 코드가 포함된 문자열이 주어졌을 때 정규식에 맞는 valid한 IPs 찾기 
 * 유효하면 true 아니면 false 출력]
 * MyRegex 클래스는 pattern String 포함해야함
 * 
 * 정규표현식 작성 문제였음
 * String에 있는 matches()는 정규표현식과 비교하여 같은지 틀렷는지 알 수 잇음
 * 
 * IP address 정규식
 * A.B.C.D range 0 ~ 255 (0 허용)
 * A,B,C,D 길이 3보다 크면 안됨
 */

class MyRegex {
	// 잘못 생각함 0~255 처리 안함 .은 \\.로 해줘야함
	// 0 ~ 255 처리
	/*
	 * zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	 * 잘하는 사람 참고
	 * \\d{1,2} 모든 1 or 2 자리 숫자
	 * (0|1)\\d{2} 0과 1로 시작하는 모든 3자리 숫자 (앞에 있어서 뒤에는 2만)
	 * 2[0-4]\\d 200 ~ 249 (20,21,23,24)(0~9)
	 * 25[0-5] 250 ~ 255 (25)(0~5)
	 */
	String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}

public class JavaRegex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String IP = sc.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

		sc.close();
	}

}
