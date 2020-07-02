package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Map 연습
 * 
 * 1 <= n <= 100000 phone book의 적힌 사람 수
 * 2줄에 걸쳐 이름 폰번호 입력
 * 1 <= Query <= 100000 같은 수만큼 query
 * 사람 이름 입력 있으면 
 * 	포맷에 맞게 번호 출력
 * 아니면 Not found 출력
 */

public class JavaMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		Map<String, Integer> phoneBooks = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			int phone = sc.nextInt();
			phoneBooks.put(name, phone);
			sc.nextLine();
		}

		// read end-of file!
		while (sc.hasNext()) {
			String name = sc.nextLine();
			if (phoneBooks.containsKey(name))
				System.out.printf("%s=%d\n", name, phoneBooks.get(name));
			else
				System.out.println("Not found");
		}

		sc.close();
	}

}
