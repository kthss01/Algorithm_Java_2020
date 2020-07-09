package introduction;

// Java Datatypes

/*
    Java has 8 primitive data types: char, boolean, byte, short, int , long, float, and double
    For thie exercies, integer values (bytes, short, int, and long)
    byte 8-bit sigend integer.
    short 16-bit sigend integer
    int 32-bit sigend integer
    long 64-bit sigend integer
    
    Given ans input integer, you must determine which primitive data types are capable of properly storing that input
    
    Input
    integer T test cases
    integer n which can be arbitrarily large or small.
    
    Output
    n can be fitted in:
    * dataType
    
    If there is more than one appropriate data type, print each one on its own line and order them by size 
        (byte < short < int < long)
    if the number cannot be stored in one of the four aforementioned(�ռ� ����) primitives, print the line:
        n can't be fitted anywhere.
    
    long long - BigInteger �̿�
        https://www.acmicpc.net/blog/view/3
    BigIntegers compare
        https://riptutorial.com/ko/java/example/4918/bigintegers-%EB%B9%84%EA%B5%90%ED%95%98%EA%B8%B0
    https://pridiot.tistory.com/62
*/

import java.util.*;
import java.math.*;

public class Datatypes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		for (int j = 0; j < T; j++) {
			BigInteger bI = scan.nextBigInteger();

			if (!bI.equals(BigInteger.valueOf(bI.longValue())))
				System.out.printf("%s can't be fitted anywhere.\n", bI.toString());
			else {
				System.out.printf("%s can be fitted in:\n", bI.toString());

				if (bI.equals(BigInteger.valueOf(bI.intValue()))) {
					int integer = bI.intValue();
					if (integer == (short) integer) {
						short s = (short) integer;
						if (s == (byte) s) {
							System.out.println("* byte");
						}
						System.out.println("* short");
					}
					System.out.println("* int");
				}
				System.out.println("* long");
			}
		}

		scan.close();

	}

}
