package dataStructures;

import java.util.Scanner;

/*
 * 2차원 배열
 * hourglass 모래시계
 * 
 * 모래시계 0 1 로 표현하는데
 * 111
 *  1
 * 111
 * 
 * 110
 *  0
 * 110
 * 
 * 100
 *  0
 * 100
 * 
 * 7 4 2 정답 7
 * 이런식으로 모래시계를 만들 수 있는데
 * 6 x 6 배열에서 만들어지는 모래시계 중 합이 가장 큰 값을 구하기
 */

public class Java2DArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		scanner.close();

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int sum = 0;
				if (i > 3 || j > 3)
					continue;
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];
				if (sum > maxSum)
					maxSum = sum;
			}
		}
		System.out.println(maxSum);
	}

}
