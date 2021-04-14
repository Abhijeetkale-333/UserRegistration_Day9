package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailId {
	public void checkPatternEmailId() {
		String EmailIdPattern = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the Email address: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(EmailIdPattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail! please try again!!!");
	}

}
