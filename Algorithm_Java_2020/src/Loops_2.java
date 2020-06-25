// Java Loops 2
/*
    integers a, b, and n to create the following sereis:
    (a + 2^0*b), (a + 2^0*b + 2^1*b), ... , (a + 2^0*b + ... + 2^n-1*b)
    
    0 <= q <= 500 queries
    0 <= a, b <= 50
    1 <= n <= 15
    
    ex)
    2
    0 2 10
    5 3 5
    
    2 6 14 30 62 126 254 510 1022 2046
    8 14 26 50 98
*/

import java.util.*;

public class Loops_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int q;
		q = scan.nextInt();

		for (int i = 0; i < q; i++) {

			int a, b, n;
			a = scan.nextInt();
			b = scan.nextInt();
			n = scan.nextInt();

			int ans = a;
			for (int j = 0; j < n; j++) {
				ans += b * (int) Math.pow(2, j);
				System.out.print(ans + " ");
			}
			System.out.println();

		}

		scan.close();
	}

}
