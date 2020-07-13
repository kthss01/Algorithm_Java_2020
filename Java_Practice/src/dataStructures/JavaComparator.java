package dataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Comparators are used to compare two objects.
 * 	이번에 comparator 만들어서 배열 정렬해보기
 * 
 * Player 클래스 정렬 (name score 2개의 field 있음)
 * 	score 내림차순으로 정렬하고 점수 같으면 name alphabetically 순으로 정렬
 * 
 * 0 <= score <= 1000
 * 2 players 이름 같을 수 있음
 * 이름은 영어 소문자
 */

class Player {
	String name;
	int score;
	
	Player(String name, int score){
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.score == o2.score)
			return o1.name.compareTo(o2.name);
		else
			return Integer.compare(o2.score, o1.score);
	}
	
}

public class JavaComparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Player[] player = new Player[n];
		Checker checker = new Checker();
		
		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();
		
		Arrays.sort(player, checker);
		
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}

}