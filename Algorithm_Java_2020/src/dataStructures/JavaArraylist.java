package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ArrayList 연습
 * 
 * n줄을 입력 받음
 * 각 줄에는 정수가 0개거나 많을 수 있음 (배열)
 * x번째 줄의 y번째 위치를 출력하기
 * 
 * 1 <= n <= 20000 입력 받을 줄의 갯수
 * 0 <= d <= 50000 정수값
 * 1 <= q <= 1000 물어볼 갯수
 * 1 <= x <= n
 * 
 * 각 숫자는 +,- 
 * 전체 정수의 숫자는 10^5을 넘지 않음
 * 
 * 물어본 x,y가 배열 넘어가면 ERROR! 출력
 */

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			String[] items = sc.nextLine().split(" ");
			for (String string : items) {
				list.add(Integer.valueOf(string));
			}
			lists.add(list);
		}

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt();
			if (lists.get(x).size() <= y)
				System.out.println("ERROR!");
			else
				System.out.println(lists.get(x).get(y));
		}

		sc.close();
	}

}
