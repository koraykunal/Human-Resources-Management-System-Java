package business.validation.abstracts;

import entities.cocnrete.Customer;

public interface Validation {
	public boolean checkValid(Customer customer);
}
