package Introduction;
import java.util.Scanner;

/**
 * @author Kay Static initialization blocks (정적 초기화 블럭) are executed when the
 *         class is loaded, and you can initialize static variables in those
 *         blocks.
 * 
 *         parallelogram 평행 사변형
 * 
 *         Task area of a parallelogram with breadth B and height H if B <= 0 or
 *         H <= 0 output shoudle be "java.lang.Exception: breadth and height
 *         must be positive" without quotes
 * 
 *         -100 <= B, H <= 100
 */
public class StaticInitializerBlock {

	static int B, H;
	static boolean flag;

	static {
		java.util.Scanner scan = new Scanner(System.in);

		B = scan.nextInt();
		H = scan.nextInt();

		flag = B > 0 && H > 0;
		if (!flag)
			System.out.println("java.lang.Exception: Breadth and height must be positive");

		scan.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}

}
