package business.validation.concrete;

import business.validation.abstracts.Validation;
import entities.cocnrete.Customer;

public class LoginValidation implements Validation{
	private static boolean isLoginInfoTrue(Customer customer, String email, String password) {
		if(customer.getEmail()==email && customer.getPassword()==password) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkValid(Customer customer) {
		return false;
	}
}
