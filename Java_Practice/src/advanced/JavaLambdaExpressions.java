package advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Lambda 식 써보기
 * 
 */

interface PerformOperation {
	boolean check(int a);
}
class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
}

public class JavaLambdaExpressions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	}

}
