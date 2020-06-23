// Java Loops 1
/*
    Task
    Given an integer, N, print its first 10 multiples
    Each mutliple N x i (where 1 <= i <= 10) should be printed on a new line in the form
    N x i = result
    
    2 <= N <= 20
    
    ex)
    2
    2 x 1 = 2
    ...
    2 x 10 = 2
*/

import java.util.*;

public class Loops_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf(n + " x " + i + " = " + n * i + "\n");

		}

		scan.close();
	}

}
