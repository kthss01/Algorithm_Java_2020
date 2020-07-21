package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * STROJOPIS
 * 
 * 문자열 입력 받았을 때 
 * 적절한 타이핑시 어떤 손가락으로 했는지 출력하기
 * 
 * 1 ~ 최대 50자
 * 	띄어쓰기 안들어감, 오직 이미지에 나온 문자만 나옴
 * 
 * 출력
 * 엄지 제외하고 각 손가락 위치 몇번 썻는지 출력
 * ex)
 * AON=BOO;
 * 1 0 0 1 1 0 3 2
 */

public class Baekjoon_10551 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String typing = br.readLine();

		int[] fingers = new int[8];

		String[] keys = { "1QAZ", "2WSX", "3EDC", "4RFV5TGB", "6YHN7UJM", "8IK,", "9OL.", "0P;/-=[]'" };

		for (int j=0; j<typing.length(); j++) {
			for (int i = 0; i < keys.length; i++)
				if (keys[i].indexOf(typing.charAt(j)) != -1)
					fingers[i]++;
		}

		for (int i : fingers) {
			System.out.println(i);
		}
	}

}
