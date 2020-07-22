package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Making the Grade?
 * 
 * project 점수 비율 15%
 * term paper 20%
 * midterm exam 25%
 * final exam 40% 
 * 
 * project, term paper, midterm exam 주어질 때
 * 90점을 넘으려면 final exam score 계산하기
 * final exam scores 0 ~ 100
 * 
 * 가능하면 점수 출력 불가능하면 impossible 출력
 * 
 * 부동소수점에서 문제가 발생한다고 함
 */

public class Baekjoon_11340 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int project = Integer.parseInt(token.nextToken());
			int termPaper = Integer.parseInt(token.nextToken());
			int midtermExam = Integer.parseInt(token.nextToken());

//			double finalExam = 9000 
//					- (project * 15) 
//					- (termPaper * 20) 
//					- (midtermExam * 25); // 나눗셈 계산이 문제라고함
//			if (finalExam > 4000)
//				sb.append("impossible\n");
//			else
//				sb.append((int)Math.ceil(finalExam * 0.025) + "\n");
			
			int sum = project * 15 + termPaper * 20 + midtermExam * 25;
			double result = (9000 - sum + 39) / 40;
			if (result > 100.0)
				sb.append("impossible\n");
			else
				sb.append((int) Math.ceil(result) + "\n");

		}
		System.out.println(sb);
	}

}
