package introduction;


import java.util.Scanner;

/**
 * @author Kay
 * Java Stdin and Stdout 1
 * 
 * Scanner class �̿��ؼ� ��
 * 
 * Scanner scanner = new Scanner(System.in);
 * String myString = scanner.next();
 * int myInt = scanner.nextInt();
 * scanner.close();
 * 
 * System.out.println("myString is : " + myString);
 * System.out.println("myInt is : " + myInt);
 * 
 * input
 * Hi 5
 * output
 * myString is: Hi
 * myInt is: 5
 */
public class Stdin_Stdout_1 {

	/**
	 * Task
	 * 3 integers from stdin and then print them to stdout
	 * Each integer must be printed on a new line
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			int integer = scanner.nextInt();
			System.out.println(integer);
		}
		
		scanner.close();
	}

}
