package advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Lambda 식 써보기
 * 
 * 합성수 composite number 
 */

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return (int a) -> a % 2 != 0;
	}

	// interface를 반환하도록 하고 (return에 람다식으로 구현한거)
	public PerformOperation isPrime() {
//		return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
		return (int a) -> {
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

	public PerformOperation isPalindrome() {
//		return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
		return (int a) -> {
			int rev= 0; int r= 0; int n =a;
			while(n != 0) {
				r = n%10;
				rev = rev*10 + r;
				n /= 10;
			}
			return (rev == a);
		};
	}
}

public class JavaLambdaExpressions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALLINDROME";
			}
			System.out.println(ans);
		}
	}

}
