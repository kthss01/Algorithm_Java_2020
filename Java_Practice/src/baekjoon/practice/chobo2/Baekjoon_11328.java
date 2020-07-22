package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Strfry
 * 
 * C 언어 프로그래밍에서 문자열(string)은 native한 자료형이 아니다.
 * 사실, 문자열은 그저, 문자열의 끝을 표시하기 위한 말단의 NULL이 사용된, 문자들로 이루어진 문자열일 뿐이다.
 * 하지만 프로그래밍 언어에서 문자열을 다루는 것은 매우 중요하기 때문에,
 * C 표준 라이브러리는 문자열을 다루는 데에 매우 유용한 함수들을 제공하고 있다.
 * 	strcpy, strcmp, strtol, strtok, strlen, strcat
 * 
 * 하지만, 잘 알려져 있지 않으며 잘 사용되지도 않는 함수가 하나 있다.
 * 	strfry 함수다
 * 	strfry 함수는 입력된 문자열을 무작위로 재배열하여 새로운 문자열을 만들어낸다.
 * 
 * 두 개의 문자열에 대해, 2번째 문자열이 1번째 문자열에 strfry함수를 적용하여 얻어질 수 있는지 판단하기
 * 
 * 테스트 케이스 0 < N < 1001
 * 영어 소문자들로만 이루어진 두 개의 문자열 한 개의 공백으로 구분
 * 	각각의 문자열의 길이는 최대 1000
 * 
 * Impossible Possible로 나타내기
 */

public class Baekjoon_11328 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			String[] strs = br.readLine().split(" ");

			// 이렇게 말고 그냥 alphabet int 배열 만들어서 넣어두고 비교해도 좋을 듯
//			char[] ch1 = strs[0].toCharArray();
//			char[] ch2 = strs[1].toCharArray();
//
//			Arrays.sort(ch1);
//			Arrays.sort(ch2);

			int[] ch1 = new int[26];
			int[] ch2 = new int[26];
			
			for(char c : strs[0].toCharArray()) 
				ch1[c - 'a']++;
			for(char c : strs[1].toCharArray()) 
				ch2[c - 'a']++;
			
			boolean isSame = true;
			for (int j = 0; j < ch1.length; j++) {
				if (ch1[j] != ch2[j]) {
					isSame = false;
					break;
				}
			}
			sb.append(isSame ? "Possible" : "Impossible");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
