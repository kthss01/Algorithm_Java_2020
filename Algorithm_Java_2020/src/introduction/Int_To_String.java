package introduction;

import java.security.Permission;
import java.util.Scanner;

/**
 * @author Kay 정수 n을 문자열로 바꾸기 converts n into a string s the code will print
 *         "Good job". Otherwise it will print "Wrong answer"
 */
public class Int_To_String {
	public static void main(String[] args) {

		DoNotTerminateClass.forbidExit();

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			// String s=???; Complete this line below

			// Write your code here
//			   String s = String.valueOf(n);
			String s = Integer.toString(n);

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminateClass.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

// The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminateClass {

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}
