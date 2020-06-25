package Introduction;

import java.util.Scanner;
import java.util.Calendar;

/**
 * @author Kay Calendar class 이용해서 날짜 받았을 때 요일 반환하기
 * 
 *         Input MM DD YYYY 2000 < year < 3000 correct day in capital letters
 * 
 *         ex) 08 05 2015 WEDNESDAY
 * 
 */

class Result {
	public static String findDay(int month, int day, int year) {

		Calendar cal = Calendar.getInstance(); // 현재 날씨와 시간의 객체를 얻어올 수 있음
		cal.set(year, month - 1, day); // month는 0 ~ 11이 1 ~ 12월임

		switch (cal.get(Calendar.DAY_OF_WEEK)) { // 요일 의미
		case 1:
			return "SUNDAY";
		case 2:
			return "MONDAY";
		case 3:
			return "TUESDAY";
		case 4:
			return "WEDNESDAY";
		case 5:
			return "THURSDAY";
		case 6:
			return "FRIDAY";
		case 7:
			return "SATURDAY";

		}

		return "";
	}
}

public class Data_And_Time {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int month, day, year;
		month = scan.nextInt();
		day = scan.nextInt();
		year = scan.nextInt();

		System.out.println(Result.findDay(month, day, year));

		scan.close();

	}

}
