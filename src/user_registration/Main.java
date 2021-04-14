package user_registration;

import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to user registration file.");

		FirstName firstName = new FirstName();
		LastName lastName = new LastName();
		EmailId emailId = new EmailId();
		PhoneNumber phoneNumber = new PhoneNumber();
		Password password = new Password();

		firstName.checkPatternFirstName();
		lastName.checkPatternLastName();
		emailId.checkPatternEmailId();
		phoneNumber.checkPatternPhoneNumber();
		password.checkPatternPassword();

	}

}
