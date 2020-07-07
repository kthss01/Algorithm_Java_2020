package advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/*
 * 오버로딩 문제 같음 -> 오버로딩 하면 안됨
 * 
 * input
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 
 * output
 * 1+2=3
 * 1+2+3=6
 * 1+2+3+4+5=15
 * 1+2+3+4+5+6=21
 * 
 */

class Add {
	// 이런 파라미터 있는거 알아두자
	public void add(int... intArgs) {
		int sum = 0;
		String separator = "";
		for (int i : intArgs) {
			sum += i;
			System.out.print(separator + i);
			separator = "+";
		}
		System.out.println("=" + sum);
	}
}

public class JavaVarargs_SimpleAddition {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			int n6 = Integer.parseInt(br.readLine());

			Add ob = new Add();
			ob.add(n1, n2);
			ob.add(n1, n2, n3);
			ob.add(n1, n2, n3, n4, n5);
			ob.add(n1, n2, n3, n4, n5);
			ob.add(n1, n2, n3, n4, n5, n6);
			Method[] methods = Add.class.getDeclaredMethods();
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
			e.printStackTrace();
		}

	}

}
