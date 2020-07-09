package objectOrientedProgramming;

/*
 * 자식 클래스가 부모 클래스를 상속 받을 때
 * 그들의 method까지 상속받음
 * 그러나  부모 method를 오버라이딩 할 수 있음
 * 	또한 선언이나 새로운 interface를 구현할 수 잇음
 * 
 * 오버라이딩 할 때 @Override annotation(주석) 써줘야함
 * precede 앞서다
 * 	파라미터와 리턴 타입은 오버라이딩된 method와 같아야함
 * 
 * 오버라이딩 해보기
 */

class Sports {
	String getName() {
		return "Geenric Sports";
	}
	
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n player in " + getName());
	}
}

class Soccer extends Sports {
	@Override
	String getName() {
		return "Soccer Class";
	}
	
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}

public class JavaMethodOverriding {

	public static void main(String[] args) {
		Sports c1 = new Sports();
		Soccer c2 = new Soccer();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}

}
