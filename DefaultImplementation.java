package java8;

import java.util.Optional;

public interface DefaultImplementation {
	public static final String company="Infosys";
Optional<User> findByUserName(String userName);
public default boolean isUserNameTaken(String userName) {
	return findByUserName(userName).isPresent();
	
}
 public void credentialsList();
}

