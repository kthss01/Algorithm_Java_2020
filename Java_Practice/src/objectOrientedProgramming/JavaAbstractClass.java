package objectOrientedProgramming;

import java.util.Scanner;

/*
 * A Java abstract class is a class that can't be instantiated.
 * 
 * 추상 클래스 사용하기
 */

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitile() {
		return title;
	}
}

class MyBook extends Book {

	@Override
	void setTitle(String s) {
		title = s;
	}
	
}

public class JavaAbstractClass {

	public static void main(String[] args) {
		//Book new_novel = new Book(); 
		// This line prHMain.java:25 error: Book is abstract; cannot be instantiated
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitile());
		sc.close();
	}

}
