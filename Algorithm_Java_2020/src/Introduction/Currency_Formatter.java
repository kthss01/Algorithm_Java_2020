package Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Kay
 * Given a double-precision number, payment, denoting an amount of money,
 * use the NumberFormat class's getCurrencyInstance method to convert payment 
 * into US, Indian, Chinese, and French currency formats.
 * 
 * 0 <= payment <= 10^9
 * 
 * ex)
 * 12324.134
 * 
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 */
public class Currency_Formatter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// 이클립스 콘솔 창에서는 제대로 안나옴
		String us, india, china, france;
		us = NumberFormat.getCurrencyInstance(Locale.US).format(payment); 
		india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment); 
		china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment); 
		france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment); 
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
		
	}

}
