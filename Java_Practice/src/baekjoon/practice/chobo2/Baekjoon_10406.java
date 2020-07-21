package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * The fellowship of the ring
 * 	fellowship 친교
 *  compensate 보상하다
 *  chivalry 기사도
 *  atop 꼭대기에
 *  code of conduct 행동 강령
 *  conduct 행위
 *  waist 
 *  	가슴과 히프 사이의 잘록한 부분, 허리
 *  wrist 손목
 *  above 이상
 *  
 *  허리부터 목까지의 높이가 주어질 때 
 *  	정당한 펀치 계산하기
 *  
 *  1 <= W < N <= 200 W waist N neck 
 *  1 <= P <= 100 punches
 *  
 *  정당한 펀치 수 출력
 */

public class Baekjoon_10406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());

		int w = Integer.parseInt(token.nextToken());
		int n = Integer.parseInt(token.nextToken());
		int p = Integer.parseInt(token.nextToken());

		int ans = 0;

		token = new StringTokenizer(br.readLine());
		while (token.hasMoreTokens()) {
			int t = Integer.valueOf(token.nextToken());
			if (w <= t && t <= n)
				ans++;
		}

		System.out.println(ans);
	}

}
