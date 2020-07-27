package baekjoon.practice.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Manhattan
 * 
 * rectilinear 직선
 * cardinal 추기경, 주요한
 * 
 * 멘하탄 거리 측정으로 가장 가까운 택시로부터의 거리 찾기
 * 택시는 항상 교점에 있고 중복해서 있지 않음 (한 대씩만 있음)
 * 
 * x, y 내 위치
 * N (1 <= N <= 100) 택시 갯수
 * 	택시 위치들
 * 
 * 가장 가까운 택시 위치 출력
 */

public class Baekjoon_13221 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] xy = br.readLine().trim().split(" ");
		int x = new Integer(xy[0]);
		int y = new Integer(xy[1]);

		int distance = -1;
		int taxiX = 0;
		int taxiY = 0;

		int n = Integer.valueOf(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			xy = br.readLine().trim().split(" ");
			int x2 = Integer.parseInt(xy[0]);
			int y2 = Integer.parseInt(xy[1]);

			int newDistance = Math.abs(x - x2) + Math.abs(y - y2);
			if (distance > newDistance || distance == -1) {
				distance = newDistance;
				taxiX = x2;
				taxiY = y2;
			}
		}

		System.out.println(taxiX + " " + taxiY);
	}

}
