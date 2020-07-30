package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 시험 감독
 * 
 * N개의 시험장, i번 시험장 응시자의수 Ai명
 * 총감독관, 부감독관
 * 	총감독관 한 시험자에서 감시할 수 있는 응시자의 수 B명
 * 	부감독관 한 시험장에서 감시할 수 있는 응시자의 수 C명
 * 각각의 시험장에 총감독관은 오직 1명, 부감독관은 여러 명
 * 각 시험장마다 응시생들을 모두 감시해야 함
 * 이때, 필요한 감독관 수의 최솟값 구하기
 * 
 * 시험장의 개수 N (1 <= N <= 1,000,000)
 * 응시자의 수 Ai (1 <= Ai <= 1,000,000)
 * B, C
 */

public class Baekjoon_13458 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();

		StringTokenizer token = new StringTokenizer(br.readLine());
		while (token.hasMoreTokens())
			list.add(new Integer(token.nextToken()));

		token = new StringTokenizer(br.readLine());
		int b = new Integer(token.nextToken());
		int c = new Integer(token.nextToken());

		long sum = n;
		for (Integer integer : list) {

			int temp = integer - b > 0 ? integer - b : 0;
			sum += temp % c != 0 ? temp / c + 1 : temp / c;
		}
		System.out.println(sum);
	}

}
