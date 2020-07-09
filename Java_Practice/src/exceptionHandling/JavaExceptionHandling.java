package exceptionHandling;

import java.util.Scanner;

/*
 * calculator interface를 구현하여 
 * 	숫자의 power(거듭제곱) 를 계산하려고함
 * 		square 제곱, cube 세제곱
 * 
 * long power (int, int) method를 포함한 
 * 	MyCalculator 클래스를 만들기
 * 이 method는 n, p 파라미터 받는데
 * 	만약 n, p 음수면 method는 exception throw 해줘야함
 * 		"n or p should not be negative."
 * 	또한 n, p 둘다 0이면 method는 exception throw 해줘야함
 * 		"n and p should not be zero."
 * 
 * ex)
 *  -4 -5 일 때
 * 	java.lang.Exception: n or p should not be negative.
 * 
 *  -10 <= n <= 10
 *  -10 <= p <= 10
 */

class MyCalculator {

	public long power(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throw new Exception("n or p should not be negative.");
		if (n == 0 && p == 0)
			throw new Exception("n and p should not be zero.");
		return (long) Math.pow(n, p);
	}

}

public class JavaExceptionHandling {

	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
