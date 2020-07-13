package dataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Dequeue 사용해보기
 * In computer science, a double-ended queue 
 * 	(dequeue, often abbreviated(약식) to deque, pronounced deck) 
 * 	is an abstarct data type that generalizes a queue,
 *	for which elements can be added to or removed
 *	from either the front (head) or back (tail)
 *
 *	Deque는 LinkedList나 ArrayDeque class로 구현 가능
 *		Deque deque = new LinkedList<>(); 
 *		Deque deque = new ArrayDeque<>();
 * 정수 N이 주어질 때
 * 길이가 M인 가능한 부분배열들 중에서 unique number(유일한 숫자)의 최대값을 찾기 
 * contiguous 연속적인
 * 시간 제한 3초
 * 
 * 1 <= N, M <= 100000
 * M <= N 
 * 
 * ex)
 * 6 3 
 * 5 3 5 2 3 2
 * <5 3 5> (3, 5) 2
 * <3 5 2> (2 3 5) 3
 * <5 2 3> (2 3 5) 3
 * <2 3 2> (2 3) 2
 * 
 * 따라서 정답 3
 */

public class JavaDequeue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		Set<Integer> set = new HashSet<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int maxUniqueNum = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();

			/*
			 * 이렇게하면 시간 초과남 매번 새로 set을 만들어서 넣어버려서 풀이 보니까 같이 넣어버리고 뺄 때 deque에서 빼버리면 set에서도
			 * 빼버리는 걸로 해결함
			 */

			deque.addLast(num);
			set.add(num);
			if (m == deque.size()) {
				if (set.size() > maxUniqueNum)
					maxUniqueNum = set.size();
				int first = deque.removeFirst();
				if (!deque.contains(first))
					set.remove(first);
			}
		}

		in.close();
		System.out.println(maxUniqueNum);
	}

}