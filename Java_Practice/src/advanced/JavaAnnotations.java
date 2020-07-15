package advanced;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * annotation can be used to define 
 * 	the metadata of a java class or class element
 * We can use java annotation at the compile time 
 * 	to instruct the compiler about the build process
 * Annotation is also used at runtime 
 * 	to get insight into the properties of class elements
 * 
 * 2 <= N <= 10 test cases
 * 0 <= MoneySpend <= 200
 * |UserRole| = 6
 * Name contains only lowercase English letters. 
 * 
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
	String userRole() default "GUEST";

	int budgetLimit() default 0;
}

class FamilyMember {
	@FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
	public void seniorMebmer(int budget, int moneySpend) {
		System.out.println("Senior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}

	@FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
	public void juniorUser(int budget, int moneySpend) {
		System.out.println("Junior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}
}

public class JavaAnnotations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String role = in.next();
			int spend = in.nextInt();
			try {
				Class annotatedClass = FamilyMember.class;
				Method[] methods = annotatedClass.getMethods();
				for (Method method : methods) {
					if (method.isAnnotationPresent(FamilyBudget.class)) {
						FamilyBudget family = method.getAnnotation(FamilyBudget.class);
						String userRole = family.userRole();
						int budgetLimit = family.budgetLimit();
						if (userRole.equals(role)) {
							if (spend <= budgetLimit) {
								method.invoke(FamilyMember.class.newInstance(), budgetLimit, spend);
							} else {
								System.out.println("Budget Limit Over");
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			testCases--;
		}
	}

}
