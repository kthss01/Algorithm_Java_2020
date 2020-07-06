package objectOrientedProgramming;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * instanceof operator is used to test 
 * 	if the object or instance 
 * 		is an instacneof the specified type
 * 
 * instanceof 사용해보기
 * 
 */

class Student {}
class Rockstar {}
class Hacker {}

public class JavaInstanceofKeyword {

	static String count(ArrayList mylist) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < mylist.size(); i++) {
			Object element = mylist.get(i);
			// TODO 코드 구현
			// 이상하게 안되었는데 a,b,c를 아래로 내리니 되었음
			// 왜그런지는 모르겠음
			if (element instanceof Student) a++;
			if (element instanceof Rockstar) b++;
			if (element instanceof Hacker) c++;
		}
		String ret = Integer.toString(a) + " " 
		+ Integer.toString(b) + " " + Integer.toString(c);
		return ret;
	}

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			if(s.equals("Student")) mylist.add(new Student());
			if(s.equals("Rockstar")) mylist.add(new Rockstar());
			if(s.equals("Hacker")) mylist.add(new Hacker());
		}
		System.out.println(count(mylist));
	}

}
