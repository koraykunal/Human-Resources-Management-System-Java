package business.concrete;

import business.abstracts.AuthService;
import business.validation.concrete.*;
import entities.cocnrete.Customer;
import business.validation.abstracts.*;
import entities.cocnrete.*;

public class AuthManager implements AuthService{

	@Override
	public void login(LoginValidation validation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(Validation validation, Customer customer) {
		if(validation.checkValid(customer)) {
			System.out.println("Succesfully registered");
		}
		
	}
}

