package strings;

import java.util.Scanner;

/*
 * 두 문자열 a b가 주어질 때 anagrams인지 확인
 * anagram
 * CAT is 
 * 	CAT ACT TAC TCA ATC CTA
 * 돌려서 썻을 때 갯수 같으면 됨
 * anagram이면 Anagrams 아니면 Not Anagrams
 * 
 * 1 <= length(a), length(b) <= 50
 * a, b 영어 알파벳으로 구성
 * 
 * ex)
 * anagram
 * margana
 * Anagrams
 * 
 * anagramm
 * marganaa
 * Not Anagrams
 * 
 * case sensitive 대소 문자 구분
 * 이 비교 대소문자 구분 안함
 */

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();

		int[] alphabetA = new int[26];
		int[] alphabetB = new int[26];

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c >= 'A' && c <= 'Z')
				alphabetA[c - 65]++;
			if (c >= 'a' && c <= 'z')
				alphabetA[c - 97]++;
		}
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (c >= 'A' && c <= 'Z')
				alphabetB[c - 65]++;
			if (c >= 'a' && c <= 'z')
				alphabetB[c - 97]++;
		}

		boolean isAnagram = true;
		for (int i = 0; i < 26; i++) {
			if (alphabetA[i] != alphabetB[i]) {
				isAnagram = false;
				break;
			}
		}
		System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
	}

}
