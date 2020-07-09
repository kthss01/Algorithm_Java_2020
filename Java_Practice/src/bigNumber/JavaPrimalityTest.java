package bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Primality Test (소수 판별법)
 * prime number is a natural number greater than 1 whose only positive divisors are 1 and itself.
 * ex) 2, 3, 5, 7, 11, 13 ...
 * 
 * given a large integer, n 
 * use the Java Biginteger class' isProbablePrime method
 * to determine and print whether it's prime or not prime
 * 
 * n contains at most 100 digits
 * 
 * if n is a prime number, print prime otherwise, print not prime
 * 
 * ex)
 * 13
 * prime
 * 
 */

public class JavaPrimalityTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		sc.close();

		BigInteger bigNum = new BigInteger(num);
		if (bigNum.isProbablePrime(1)) { // certainty 확실성
			/*
			 * (간단히 설명하면 소수가 확실히 아닌 경우에는 false를 return, 소수가 맞을 확률이 1-(1/2)^certainty 이상인 경우
			 * true를 return 한다.)
			 */
			System.out.println("prime");
		} else
			System.out.println("not prime");

	}

}
