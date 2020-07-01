package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 문자열과 정수가 주어졌을 때
 * 정수의 길이인 
 * 사전순으로 가장 작은 부분무자열과과 가장 큰 부분문자열을 찾기 
 * 
 * ex)
 * abc 부분문자열
 * a b c ab bc abc
 * 
 * 1 <= |s| <= 1000
 * 문자열 s는 [a-zA-Z]로만 되어있음
 * 
 * ex)
 * welcometojava
 * 3
 * 
 * ava
 * wel
 */

public class SubstringComparisons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		sc.close();

		String smallest = "";
		String largest = "";

		/*
		 * 문자열의 길이가 최대 1000이면 가능한 부분 문자열은 1자리 : 1000-0 개 2자리 : 1000-1 개 3자리 : 1000-2 개
		 * ... 1000자리 : 1000-999개 총합 : 1부터 1000까지의 합 = (1000)(1000+1)/2 = 500500 임
		 * http://melonicedlatte.com/algorithm/2018/08/12/230648.html
		 */

		String[] arr = new String[s.length() - k + 1];

		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i + k - 1 >= s.length())
				break;
			arr[cnt] = s.substring(i, i + k);
			cnt++;
		}

		smallest = arr[0];
		largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(smallest) < 0)
				smallest = arr[i];
			if (arr[i].compareTo(largest) > 0)
				largest = arr[i];
		}

		// import 불가 문제였음
		// ArrayList, Collections 못씀
		// compareTo로 비교해야하는 거 같음

//		ArrayList<String> arr = new ArrayList();
//
//		for (int i = 0; i < s.length(); i++) {
//			if (i + k - 1 >= s.length())
//				break;
//			arr.add(s.substring(i, i + k));
//		}
//
//		Collections.sort(arr);
//
//		smallest = arr.get(0);
//		largest = arr.get(arr.size() - 1);

		// test
//		for (String string : arr) {
//			System.out.print(string + " ");
//		}
//		System.out.println();

		System.out.println(smallest + "\n" + largest);
	}

}
