package backjoon.practice.chobo2;

import java.util.Scanner;

/*
 * Monitor DPI
 * 	Dots Per Inch (DPI) of the screens 
 * 	계산식에 맞게 계산해서 dpi 구하기
 * 
 * 입력
 * 	D, Resolution H, Resoulution W 주어짐
 * 	
 * 출력
 * 	Horizontal DPI
 * 	Vertical DPI 출력
 * 
 */

public class Backjoon_9317 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			double d = sc.nextDouble();
			int rH = sc.nextInt();
			int rV = sc.nextInt();

			if (d == 0.0 && rH == 0 && rV == 0)
				break;

			double w = (16 * d) / Math.sqrt(337);
			double h = (9.0 / 16.0) * w;

			System.out.printf("Horizontal DPI: %.2f\n", rH / w);
			System.out.printf("Vertical DPI: %.2f\n", rV / h);
		}
		
		sc.close();
	}

}
