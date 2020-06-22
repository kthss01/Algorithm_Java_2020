

import java.util.Scanner;

/**
 * @author Kay
 * Output Formatting
 * printf 말하는듯
 * 
 * System.out.printf
 * 
 * Input
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of 10 alphabetic characters,
 * and each integer will be in the inclusive range from 0 to 999
 * 
 * Output
 * In cach line of output there should be two columns:
 * first column contains the String and is left justified using exactly 15 characters
 * second column contains the integer, expressed in exactly 3 digits;
 * if the original input has less than three digits,
 * you must pad your output's leading digits with zeroes.
 * 
 * ex)
 * java 100
 * cpp 65
 * python 50
 * 
 * ================================
 * java           100 
 * cpp            065 
 * python         050 
 * ================================
 */
public class OutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================================");
		
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			
			System.out.printf("%-15s%03d\n", s1, x);
			
		}
		
		System.out.println("================================");
		
		sc.close();
	}

}
