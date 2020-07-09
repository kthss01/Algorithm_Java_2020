package bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * 큰 숫자 더하기 곱하기
 * 원시 데이터 타입(primitive type)으로는 담을 수 없는 숫자 계산
 * BigInteger 클래스 사용
 * 
 * a,b non-negative integers and maximum 200 digits
 * 
 * a+b
 * axb 
 */

public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		
		BigInteger A = new BigInteger(a);
		BigInteger B = new BigInteger(b);
		
		System.out.println(A.add(B));
		System.out.println(A.multiply(B));
	}

}
