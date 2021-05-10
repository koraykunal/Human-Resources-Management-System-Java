package business.validation.concrete;

import business.validation.abstracts.Validation;
import entities.cocnrete.Customer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegisterValidation implements Validation{
	private static boolean result = true;
	
	public boolean checkValid(Customer customer) {
		passwordLength(customer);
		nameLenght(customer);
		emailFormat(customer);
		return result;
		
	}
	public static void passwordLength(Customer customer) {
		if(customer.getPassword().length() < 6) {
			result = false;
			System.out.println("Your passcode cannot under 6 characters");
		}
	}
	public static void nameLenght(Customer customer) {
		if(customer.getFirstName().length() < 2 | customer.getLastName().length() < 2) {
			result = false;
			System.out.println("Your name cannot be under 2 characters");
		}
	}
	public static void emailFormat(Customer customer) {
		String regex = "^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher control = pattern.matcher(customer.getEmail());
		result = false;
	}
}
