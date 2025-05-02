package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryUserRepository implements DefaultImplementation{
	List<User> users=new ArrayList<User>();
public void credentialsList() {
	users.add(new User("ramu", "ramu@123"));
	users.add(new User("chandu", "chandu@123"));
}
	@Override
	public Optional<User> findByUserName(String userName) {
	return	users.stream().
				filter(credentials-> credentials.getUserName().equalsIgnoreCase(userName))
				.findFirst();
	
	}
	public static void main(String[] args) {
		
		DefaultImplementation ref=new InMemoryUserRepository();
		ref.credentialsList();
		boolean fl=ref.isUserNameTaken("chanduqq");
		if(fl) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Please enter the credentials again");
		}
		String company2 = ref.company;
		System.out.println(company2);
		
	}

}
