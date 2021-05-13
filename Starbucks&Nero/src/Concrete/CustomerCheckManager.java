package Concrete;

import Abstract.ICustomerChechkService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerChechkService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return false;
	}

}
