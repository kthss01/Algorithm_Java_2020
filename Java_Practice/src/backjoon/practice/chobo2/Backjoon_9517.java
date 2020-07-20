package backjoon.practice.chobo2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 아이 러브 크로아티아
 * 	네덜란드의 인기 티비 프로그램 I love my country의 포맷 라이센스를 수입해 만든 크로아티아의 티비쇼
 *  이 티비쇼에서 가장 인기 있는 게임은 Happy Birthday이며 이 게임에 대한 문제를 풀게 된다.
 *  
 *  플레이어 8명이 원을 이루어 앉아있다.
 *  한 사람은 게임이 시작한지 3분 30초가 지나면 터지는 폭탄을 들고 있다.
 *  폭탄을 들고 있는 사람에게 질문을 하면서 게임은 시작된다.
 *  어떤 문제의 정답을 맞추지 못한 경우나, 문제를 스킵한 경우에는 그 즉시 다음 문제를 받게 된다.
 *  문제의 정답을 맞춘 경우에는 폭탄을 바로 왼쪽에 있는 플레이어에게 넘겨주고,
 *   넘겨받은 플레이어에게 다음 질문이 나가게 된다.
 *   
 *  게임이 시작했을 때 폭탄을 들고 있는 사람의 번호와 처음 N개의 질문을 대답할 때까지 걸린 시간이 주어진다.
 *  이때, 폭탄을 터뜨린 사람의 번호 구하기
 *  
 *  각 사람이 질문을 듣고 대답할 때까지 걸린 시간과, 그 사람의 대답이 맞았는지(T), 틀렸는지(V), 스킵했는지(P)
 *  가 주어진다. 정답을 말하는 시간, 질문을 듣는 시간 모두 0이라고 가정하며, 박스를 전달하는 시간도 0이라 가정
 *  항상 사람이 폭탄을 들고 있었을 때 터지는 입력만 주어지낟.
 *  
 *  K (게임이 시작했을 때 폭탄을 들고 있는 사람의 번호 (1 <= K <= 8)
 *  N (질문의 개수 (1 <= N <= 100)
 *  i번째 질문을 대답하기까지 걸린 시간(단위: 초) T (1 <= T <= 100),
 *  	그 플레이어의 대답 Z  (T, N, P 중 하나)가 주어진다.
 *  
 *  폭탄을 터뜨린 사람의 번호 출력
 *  
 * 
 */

class Pair {

	private Integer time;
	private String answer;

	public Pair(Integer time, String answer) {
		this.time = time;
		this.answer = answer;
	}

	public Integer getTime() {
		return time;
	}

	public String getAnswer() {
		return answer;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}

/*
 * T 맞음 N 틀림 P 스킵 맞으면 왼쪽에 있는 플레이어에게 넘어감 (-1) N or P 다음 문제
 */

public class Backjoon_9517 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();

		Queue<Pair> list = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			String z = sc.next();

			list.add(new Pair(t, z));
		}
		
		sc.close();

		int time = 0;

		while (true) {
			Pair p = list.poll();
			time += p.getTime();
			
			if (time >= 210) {
				System.out.println(k);
				break;
			}
			
			if (p.getAnswer().equals("T")) {
				k++;
				if (k == 9)
					k = 1;
			}
		}
	}

}
