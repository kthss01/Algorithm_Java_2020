package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception handling 
 * 	is the process of responding to the occurrence(발생)
 * 	during computation, of exceptions 
 * 	- anomalous(변칙) or exceptional conditions 
 * 	requiring special processing - 
 * 	often changing the normal flow of program execution. (Wikipeida)
 * 
 * try-catch 문 사용해보기 
 * x, y integer input
 * 	compute x / y
 * 	if x and y are not 32 bit signed integers 
 * 	or if y is zero, 
 * 		exception will occur and you have to report it.
 * 
 * 
 */

public class JavaExceptionHandling_Try_catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x / y);
		/* 틀린 이유
		 * InputMismatchException만 나와야하는데 뒤에가 더 붙어서
		 */
		} 
		catch (InputMismatchException e){
//			System.out.println("java.util.InputMismatchException");
			// Java 8버전부터는 이렇게 써도 되는 것 같음
			System.out.println(e.getClass().getName());
		}
		catch (Exception e) {
//			e.printStackTrace(); // 오류 출력
			System.out.println(e.toString());
		}
		sc.close();

	}

}
