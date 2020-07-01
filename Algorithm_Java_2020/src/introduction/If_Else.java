package introduction;


import java.util.Scanner;

/**
 * @author Kay
 * conditional statements 
 * ����� �׳� ������ �Ѿ��
 */
public class If_Else {

	/**
	 * Task
	 * integer n
	 * if n is odd, print Weird
	 * if n is even and in the inclusive range 2 to 5, print Not Weird
	 * if n is even and in the inclusive range 6 to 20, print Weird
	 * if n is even and greater than 20, print Weird
	 * 
	 * 1 <= n <= 100
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String W = "Weird";
		String notW = "Not Weird";
		
		if (n % 2 == 0) {
			if (n >= 2 && n <= 5)
				System.out.println(notW);
			else if (n >= 6 && n <= 20)
				System.out.println(W);
			else
				System.out.println(notW);
		}
		else {
			System.out.println(W);
		}
		
		scan.close();
	}

}
