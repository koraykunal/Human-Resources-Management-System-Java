package googleAuth.concrete;

import entities.cocnrete.Customer;
import googleAuth.abstracts.GoogleAuthService;

public class GoogleAuthManager implements GoogleAuthService{

	@Override
	public void login(Customer customer) {
		System.out.println("Logged in via Google account");
		
	}

}
