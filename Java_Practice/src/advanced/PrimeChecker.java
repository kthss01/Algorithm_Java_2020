package advanced;

// 이렇게 쓸 수도 있음 참고하자
import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 소수 체크하기 (prime nubmer : 소수)
 * 
 * Prime 클래스의 checkPrime method 구현
 * 오버로딩은 하지말기
 * 
 * 5개 입력, 오직 1자리수 소수 (2,3,5,7) -> 이거 아님
 */

class Prime {
	public void checkPrime(int... nums) {
		int[] primes = { 2, 3, 5, 7 };

		Set<Integer> set = new HashSet<>();
		for (int n : nums) {
			if (n == 1)
				continue;
			boolean isPrime = true;
			for (int j = 2; j * j <= n; j++) {
				if (n % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				set.add(n);
		}

//		List<Integer> list = new ArrayList<>(set);
//		Collections.sort(list);
//
//		for (Integer integer : list) {
//			System.out.print(integer + " ");
//		}
		for (Integer integer : set) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}
}

public class PrimeChecker {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());
			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
