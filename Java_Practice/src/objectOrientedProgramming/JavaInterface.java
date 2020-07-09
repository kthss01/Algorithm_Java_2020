package objectOrientedProgramming;

import java.util.Scanner;

/*
 * Java interface only contain method signatures and fields.
 * The interface can be used to achieve(이루다) polymorphism(다형성).
 * 
 * 인터페이스 사용해보기
 */

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

// divisor 약수 

class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				sum += i;
				if (i != n / i)
					sum += n / i;
			}
		}
		return sum;
	}

}

public class JavaInterface {

	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

}
