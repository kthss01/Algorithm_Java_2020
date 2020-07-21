package baekjoon.practice.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 와글와글 숭고한
 * 
 * 세 대학교의 참여도를 수치화하고 세 대학교의 참여도의 합이 100이상이면 일처리가 잘 되고
 * 100미만이면 참여도가 가장 낮은 대학의 동아리에게 압박을 넣을 거
 * 
 * 0 <= S,K,H <= 100
 * 세 대학의 참여도는 모두 다름
 * 
 * 잘되면 OK
 * 안되면 가장 참여도가 낮은 대학의 영문 이름의 첫 단어 출력
 */

public class Baekjoon_17388 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = br.readLine().split(" ");
		int s = Integer.parseInt(tokens[0]);
		int k = Integer.parseInt(tokens[1]);
		int h = Integer.parseInt(tokens[2]);
		
		if(s + k + h >= 100)
			System.out.println("OK");
		else if(s < k && s < h){
			System.out.println("Soongsil");
		}
		else if(k < s && k < h) {
			System.out.println("Korea");
		}
		else
			System.out.println("Hanyang");
	}

}
