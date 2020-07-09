package introduction;


import java.util.Scanner;

/**
 * @author Kay
 * read integer, double, string from stdin
 */
public class Stdin_Stdout_2 {

	/**
	 * @param args
	 * Task
	 * 
	 * Input
	 * three lines of input
	 * 1. first line integer
	 * 2. second line double
	 * 3. third line String
	 * Output
	 * first line, print String: followed by the unaltered String read from stdin
	 * second line, print Double: same
	 * third line, print Int: same
	 * 
	 * ex)
	 * 42
	 * 3.1415
	 * Welcome to HackerRank's Java tutorials!
	 * 
	 * String: Welcome to HackerRank's Java tutorials!
	 * Double: 3.1415
	 * Int:42
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		double d = scan.nextDouble();
		/*
		 * If you use the nextLine() method immediately following the nextInt() method,
		 * recall that nextInt() reads integer tokens;
		 * because of this, the last newline character for that line of integer input is
		 * still queued in the input buffer and the next nextLint() will be reading 
		 * the remainder of the integer line (which is empty)
		 * 
		 */
		// �ٷ� ���� ���� ����
		scan.nextLine(); // �̷��� �ذ��ϸ� �Ǵ� ��
		String s = scan.nextLine();
		
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		
		scan.close();
	}

}
