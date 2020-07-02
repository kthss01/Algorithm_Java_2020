package strings;

import java.util.Scanner;

/*
 * 회사 내부의 네트워킹 플랫폼에서 유저이름 정책을 업데이트 하고 있음  
 * 유저이름은 다음과 같은 제한사항을 따라야 유효함
 * 
 * 8 ~ 30 characters inclusive(포함한)
 *  8보다 적나 30보다 크면 invalid
 * contain alphanumeric characters and underscores(_)
 * 	alphanumeric characters [a-z], [A-Z], [0-9]
 * first character of the username must be alphabetice character
 * 	[a-z] or [A-Z]
 * 
 * ex)
 *  Julia INVALID
 *  Samantha VALID
 *  Samantha_21 VALID
 *  1Samantha INVALID
 *  Samntha?10_2A INVALID
 *  
 * Update the value of regularExpression field in the UsernameValidator class
 * 
 * 1 <= n <= 100 total number of usernames
 */

class UsernameValidator {

	public static final String regularExpression = "[a-zA-Z]\\w{7,29}";
}

public class ValidUsernameRegularExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String userName = sc.nextLine();
			if (userName.matches(UsernameValidator.regularExpression))
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}

}
