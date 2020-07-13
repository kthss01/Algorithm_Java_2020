package advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Permission;

/*
 * Solution 클래스와 그안에 있는 inner class Inner.Private이 있음
 * Solution 클래스가 integer num을 입력값으로 받을 때
 * 
 * The powerof2in class Inner.Private checks whether a number is power of 2
 * You have to call the method powerof2 of the class Inner.Private from
 * the main method of the class Solution
 * 
 * 1 <= num <= 2^30
 * 
 */

public class CanYouAccess {

	public static void main(String[] args) throws NumberFormatException, IOException {
		DoNotTerminate.forbidExit();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			// Must be used to hold the reference
			// of the instance of the class Solution.Inner.Private
			// 이거 참고하자
			Object o = new Inner().new Private();
			System.out.println(num + " is " + 
					((Inner.Private)o).powerof2(num));
			
			System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		} // end of try

		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	} // end of main

	static class Inner {
		private class Private {
			private String powerof2(int num) {
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	} // end of Inner
} // end of Solution

class DoNotTerminate { // This class prevents exit(0)

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
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