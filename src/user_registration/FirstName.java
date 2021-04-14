package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
	public void checkPatternFirstName() {
		String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the First Name: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(firstNamePattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail! please try again!!!");
	}

}
