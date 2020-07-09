package objectOrientedProgramming;

/*
 * 부모 클래스의 method를 자식 클래스가 오버라이딩 할 때
 * super keyword로 부모의 method 호출이 가능함
 * 
 * super keyword 사용해보기
 * 
 */

class BiCylce {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCylce{
	String define_me() {
		return "a cycle with an engine.";
	}
	
	MotorCycle() {
		System.out.println(
				"Hello I am a motorcycle, I am " + define_me());
		
		String temp = super.define_me(); // Fix this line
		
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}

public class JavaMethodOverriding_2 {

	public static void main(String[] args) {
		MotorCycle M = new MotorCycle();
	}

}
