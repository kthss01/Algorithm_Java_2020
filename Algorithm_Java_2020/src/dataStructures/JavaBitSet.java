package dataStructures;

import java.util.BitSet;
import java.util.Scanner;

/*
 * BitSet class implements a vector of bit values 
 * ex) false(0) or true(1)
 * allowing us to easily manipulate bits 
 * 	while optimizing space (when compared to other collections)
 * Any element having a bit value of 1 is called a set bit
 * 
 * 크기가 N인 BitSet 2개 (B1 B2, 모두 0으로 초기화 된)가 주어질 때
 * 	M operations을 수행하고 나서
 * 	respective(각각의)
 * 	각각의 set bits의 갯수를 출력하기
 * 
 * input
 * 	N M
 * 		1 <= N <= 1000	(the length of both BitSets B1, B2)
 * 		1 <= M <= 10000 (the number of operations to perform)
 * 	
 * 각각의 M
 * AND <set> <set>
 * OR <set> <set>
 * XOR <set> <set>
 * FLIP <set> <index>
 * SET <set> <index>
 * 
 * 의미는 <set> 1 or 2 1 == B1 2 == B2
 * SET 1 4 B1의 index 4을 true로
 * FLIP 2 2 B2의 index 2를 flip
 * 
 * ex)
 * 5 4
 * AND 1 2
 * SET 1 4
 * FLIP 2 2
 * OR 2 1
 * 
 * 0 0
 * 1 0
 * 1 1 
 * 1 2
 */

public class JavaBitSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		for (int i = 0; i < m; i++) {
			String op = sc.next();

			String s1 = sc.next();
			String s2 = sc.next();
			int index = 0;
			
			switch (op) {
			case "AND":
				if (s1.equals("1"))
					b1.and(b2);
				else
					b2.and(b1);
				break;
			case "OR":
				if (s1.equals("1"))
					b1.or(b2);
				else
					b2.or(b1);
				break;
			case "XOR":
				if (s1.equals("1"))
					b1.xor(b2);
				else
					b2.xor(b1);
				break;
			case "FLIP":
				index = Integer.parseInt(s2);
				if(s1.equals("1"))
					b1.flip(index);
				else
					b2.flip(index);
				break;
			case "SET":
				index = Integer.parseInt(s2);
				if(s1.equals("1"))
					b1.set(index);
				else
					b2.set(index);
				break;
			}
			
			// cardinality true인 bit의 숫자 반환
			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
		
		sc.close();
	}

}
