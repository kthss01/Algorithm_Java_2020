package objectOrientedProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * collection의 element면 Java Iterator class 사용가능
 * 
 * iterator 사용해보기
 * 
 * ### 문자열 이후를 출력하기
 * 
 * ex)
 * element[0]=>42
 * element[1]=>10
 * element[2]=>"###"
 * element[3]=>"Hello"
 * element[4]=>"Java"
 * 
 * Hello
 * Java
 * (###은 빼고)
 */

public class JavaIterator {

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			// TODO 코드 구현
			Object element = it.next();

			// hints: use instanceof operator
			if (element instanceof String)
				break;
		}

		return it;
	}

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}

		mylist.add("###");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
	}

}
