package advanced;

/*
 * The singleton pattern is a design pattern 
 * 	that restricts the instantiation of a class to one object
 * This is useful when exactly one object is needed to 
 * 	coordinate actions across the system.
 * 
 * 싱글턴 패턴 사용해보기
 * 
 */

class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {
	}

	public String str = null;

	public static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class JavaSingletonPattern {

	public static void main(String[] args) {

	}

}
