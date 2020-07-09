package objectOrientedProgramming;

/*
 * 코드 작성하기
 * Arithmetic 이란 클래스의
 * 	2 integers 파라미터로 받는 그들의 합을 반환하는 method add 추가하기
 * 
 * Adder class는 Arithmetic을 상속받게 해서 추가
 * 
 */

class Arithmetic {
	public int add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {
	
}

public class JavaInheritance_2 {

	public static void main(String[] args) {
		Adder a = new Adder();
		
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		
		System.out.println(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10));
	}

}
