package advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/*
 * inspect 점검하다
 * Java reflection is a very powerful tool
 * 	to inspect the attributes of a class in runtime.
 * ex)
 * getDeclaredMethods()로 public fields 리스트 가져올 수 있음
 * 
 * Student 클래스의 모든 methods를 알파벳 순으로 출력하기
 */

class Student{
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getEamil() {
		return eamil;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	private String name;
	private String id;
	private String eamil;
	
}

public class JavaReflection_Attributes {

	public static void main(String[] args) throws ClassNotFoundException {
		//Class student = ~
		// 이렇게 쓰는게 아니라 Student.class 이렇게 써야하는듯
		// 또는 아래처럼 쓰는데 이건 내 프로젝트라서 이렇게 쓰는거
		Class student = Student.class;
//		Class student = Class.forName("advanced.Student");
		
		// Method[] methods = ~
		Method[] methods = student.getDeclaredMethods();
		
		ArrayList<String> methodList = new ArrayList<>();
		/*
		 * for(~) {
		 * 	methodList.add(~)
		 * }
		 * Collections.sort(methodList);
		 * for(String name : methodList) {
		 * 	System.out.println(name);
		 * }
		 */
		
		for (int i = 0; i < methods.length; i++) {
			methodList.add(methods[i].getName());
		}
		
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}

}
