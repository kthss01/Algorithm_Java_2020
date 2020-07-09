package dataStructures;

import java.lang.reflect.Method;

/*
 * Generic methods are a very efficient way 
 * 	to handle multiple data types using a single method.
 * 
 *  an integer array and a string array 있을 때
 *  하나의 method printArray로 두 개의 모든 배열의 요소를 출력하려고 함
 *  ex)
 *  1
 *  2
 *  3
 *  Hello
 *  World
 *  Do not use method overloading 
 *  	because your answer will not be accepted. 
 */

class Printer {

	public void printArray(Object[] arr) {
		for (Object object : arr) {
			System.out.println(object);
		}
	}

}

public class JavaGenerics {

	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		int count = 0;

		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();

			if (name.equals("printArray"))
				count++;
		}

		if (count > 1)
			System.out.println("Method overloading is not allowed!");
	}

}
