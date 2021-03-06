package advanced;

import java.security.Permission;
import java.util.Scanner;

/*
 * Wikipedia에 따르면 a factory is simply an object 
 * 	that returns another object from some other method call,
 * 	which is assumed to be "new"
 * 
 * Factory Pattern 사용해보기
 * 
 */

interface Food {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone orderd a Fast Food!";
	}
}

class Cake implements Food {
	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory {
	public Food getFood(String order) {
		if (order == null)
			return null;
		else if (order.equals("pizza"))
			return new Pizza();
		else if (order.equals("cake"))
			return new Cake();

		return null;
	}
}

public class JavaFactoryPattern {

	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();

		try {
			Scanner sc = new Scanner(System.in);

			// creating the factory
			FoodFactory foodFactory = new FoodFactory();

			// factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());

			System.out.println("The factory returned " + food.getClass());
			System.out.println(food.getType());

			sc.close();
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!");
		}
	}

}

class Do_Not_Terminate {
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
