package dataStructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * set is an abstract data type that can store certain values
 * 	without any particular order, and no repeated values(Wikipedia)
 * ex)
 * 	{1,2,3} set
 * 	{1,2,2} not set
 * 
 * n pairs of strings
 * Two pairs (a, b) and (c, d) are identical if a == c and b == d 
 * That also implies (a,b) is not same as (b,a)
 * 
 * After taking each pair as input, 
 * you need to print number of unique pairs you currently have
 * 
 * 1 <= T <= 100000 pairs
 * Length of each string is atmost 5 and 
 * 	will consist lower case letters only
 * 
 */

public class JavaHashset {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String [] pair_left = new String[t];
		String [] pair_right = new String[t];
		
		for (int i = 0; i < t; i++) {
			pair_left[i] = sc.next();
			pair_right[i] = sc.next();
		}
		
		/*
		 *  이거 String pair 넣는 방법이 클래스 만들어야 된다고 생각했는데
		 *  그냥 문자열을 합쳐서 만들면 되는 거였음
		 *  항상 조금만 더 생각해보자
		 */
		
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < t; i++) {
			set.add(pair_left[i] + "_" + pair_right[i]);
			System.out.println(set.size());
		}
		
	}

}
