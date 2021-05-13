
public class main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Koray");
		student.setLastName("Kunal");
		UserManager manager=new UserManager();
		manager.add(student);

	}

}
