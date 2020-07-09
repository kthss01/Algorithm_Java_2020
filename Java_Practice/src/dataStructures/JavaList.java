package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 2 types of queries
 * 
 * Insert 
 * x y 
 * 
 * Delete
 * x
 * 
 * 리스트와 정수 쿼리가 주어졌을 때 모든 쿼리가 수행된 후
 * 수정된 리스트 출력하기 빈칸 띄어서
 * 
 * 1 <= N <= 4000 리스트의 사이즈
 * 1 <= Q <= 4000 쿼리의 갯수
 * 각각의 요소는 32-bit integer
 */

public class JavaList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int element = sc.nextInt();
			list.add(element);
		}

		int q = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < q; i++) {
			String query = sc.next();
			int index = sc.nextInt();
			if(query.equals("Insert")) {
				int value = sc.nextInt();
				list.add(index, value);
			}
			else if(query.equals("Delete")) {
				list.remove(index);
			}
		}

		sc.close();
		
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
		
	}

}
