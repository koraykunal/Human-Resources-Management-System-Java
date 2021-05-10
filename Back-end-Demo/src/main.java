import business.abstracts.CustomerService;
import business.concrete.AuthManager;
import business.validation.concrete.RegisterValidation;
import entities.cocnrete.Customer;

public class main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setEmail("koraykunal85@gmail.com");
		customer.setFirstName("Koray");
		customer.setId(1);
		customer.setLastName("Kunal");
		customer.setPassword("123456");
		AuthManager authManager = new AuthManager();
		RegisterValidation registerValidation = new RegisterValidation();
		
		authManager.register(registerValidation, customer);
		
		

	}

}
