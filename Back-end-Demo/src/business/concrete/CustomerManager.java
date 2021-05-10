package business.concrete;

import business.abstracts.CustomerService;

public class CustomerManager implements CustomerService{

	@Override
	public void add() {
		System.out.println("Added");
		
	}

	@Override
	public void delete() {
		System.out.println("Deleted");
		
	}

	@Override
	public void update() {
		System.out.println("Update");
		
	}

}
