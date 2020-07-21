package baekjoon.practice.kingchobo;

import java.util.Scanner;

/*
 * 1998년생인 내가 태국에서는 2541년생?!
 * 
 * 불교 국가인 태구은 불멸기원, 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용함
 * 반면, 우리나라는 서기 연도를 사용하고 있다.
 * 불기 연도가 주어질 떄 이를 서기연도로 바꿔 주는 프로그램 작성
 * 
 * 불기 연도 y (1000 <= y <= 3000)
 * 
 * 2541 - 1998 = 543 
 */

public class Baekjoon_18108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();
		
		System.out.println(y - 543);
	}

}
