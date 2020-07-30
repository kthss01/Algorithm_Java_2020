package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Tarifa
 * 
 * negotiated 협상하다
 * 
 * 처음 몇달간 사용하는 양을 알면 (남는거 이전됨)
 * 다음 달에는 얼마나 사용할 수 있는지 계산하기
 * 
 * X (1 <= X <= 100) 제공되는 양
 * N (1 <= N <= 100) 달 수 
 * 	Pi (0 <= 10000) 처음 몇달 간 사용되는 양
 * 가진거 이상은 사용안함
 */

public class Baekjoon_13484 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = new Integer(br.readLine());
		int n = new Integer(br.readLine());
		
		int left = 0;
		for (int i = 0; i < n; i++) {
			int p = new Integer(br.readLine());
			left += x - p;
		}
		
		System.out.println(left + x);
	}

}
