package business.abstracts;
import business.validation.*;
import business.validation.abstracts.Validation;
import business.validation.concrete.LoginValidation;
import business.validation.concrete.RegisterValidation;
import entities.cocnrete.Customer;

public interface AuthService {
	
	public void register(Validation validation, Customer customer);
	public void login(LoginValidation validation);
}
