package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerChechkService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private ICustomerChechkService chechkService;
	
	public StarbucksCustomerManager(ICustomerChechkService chechkService) {
		this.chechkService=chechkService;
	}

	@Override
	public void save(Customer customer) {
		if(chechkService.checkIfRealPerson(customer)== true) {super.save(customer);}
		else {throw new ArithmeticException("Not a valid person.");};
	}
	
	
}
