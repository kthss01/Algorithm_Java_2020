package introduction;

import java.util.Scanner;
import java.util.Calendar;

/**
 * @author Kay Calendar class �̿��ؼ� ��¥ �޾��� �� ���� ��ȯ�ϱ�
 * 
 *         Input MM DD YYYY 2000 < year < 3000 correct day in capital letters
 * 
 *         ex) 08 05 2015 WEDNESDAY
 * 
 */

class Result {
	public static String findDay(int month, int day, int year) {

		Calendar cal = Calendar.getInstance(); // ���� ������ �ð��� ��ü�� ���� �� ����
		cal.set(year, month - 1, day); // month�� 0 ~ 11�� 1 ~ 12����

		switch (cal.get(Calendar.DAY_OF_WEEK)) { // ���� �ǹ�
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