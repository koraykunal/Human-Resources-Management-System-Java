
public class UserManager {
	public void add(User user) {
		System.out.println("User Added : " + user.getFirstName() +" "+ user.getLastName());
	}
	public void remove(User user) {
		System.out.println("User Removed : " + user.getFirstName() +" "+ user.getLastName());
	}
	public void update(User user) {
		System.out.println("User Updated : " + user.getFirstName() +" "+ user.getLastName());
	}
}
