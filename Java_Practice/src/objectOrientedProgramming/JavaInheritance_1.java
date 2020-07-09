package objectOrientedProgramming;

/*
 * Using inheritance(상속), 
 * 	one class can acquire the properties of others
 * 
 * 코드가 주어질 때
 * Bird class의 sing method 추가
 * 
 */

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}

public class JavaInheritance_1 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
