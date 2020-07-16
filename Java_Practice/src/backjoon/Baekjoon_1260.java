package backjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * DFS와 BFS
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하기
 * 단, 방문할 수 잇는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
 * 더 이상 방문할 수 없는 점이 없는 경우 종료
 * 정점 번호 1 ~ N
 * 
 * 정점의 개수 N (1 <= N <= 1000)
 * 간선의 개수 M (1 <= M <= 10000)
 * 탐색을 시작할 정점의 번호 V
 * 입력으로 주어지는 간선은 양방향
 * 
 * DFS 수행 결과, BFS 수행 결과 출력
 * V부터 방문된 점을 순서대로 출력
 */

public class Baekjoon_1260 {

	public static void dfs(ArrayList<ArrayList<Integer>> g, boolean[] c, int x) {
		c[x] = true;

		System.out.print(x + " ");

		for (Integer y : g.get(x)) {
			if (c[y] == false) {
				dfs(g, c, y);
			}
		}

	}

	// stack으로 맞는지 조금 체크 필요
	public static void dfs2(ArrayList<ArrayList<Integer>> g, boolean[] c, int x) {
		Stack<Integer> st = new Stack<>();

		st.push(x);
		c[x] = true;
		System.out.print(x + " ");

		boolean flag = false;

		while (!st.empty()) {
			x = st.peek();

			flag = false;

			for (int y : g.get(x)) {
				if (c[y] == false) {
					st.push(y);
					System.out.print(y + " ");

					c[y] = true;
					flag = true;
					break;
				}
			}
			if (!flag)
				st.pop();
		}
	}

	public static void bfs(ArrayList<ArrayList<Integer>> g, boolean[] c, int x) {
		Queue<Integer> q = new LinkedList<>();
		c[x] = true;
		q.add(x);

		while (!q.isEmpty()) {
			x = q.poll();
			System.out.print(x + " ");
			for (int y : g.get(x)) {
				if (c[y] == false) {
					c[y] = true;
					q.add(y);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, V;
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();

		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for (int i = 0; i <= N; i++)
			a.add(new ArrayList<Integer>());
		boolean[] c = new boolean[N + 1];

		for (int i = 0; i < N; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a.get(u).add(v);
			a.get(v).add(u);
		}
		
		sc.close();

		dfs(a, c, V);
//		dfs2(a, c, V);
		Arrays.fill(c, false);
		System.out.println();
		bfs(a, c, V);
	}

}
