import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

class UserTesting {
	UserRepositoryImpl userr = new UserRepositoryImpl();
	@Test
	public void addNewUser() {
		User user1 = new User();
		user1.setUserId(1);
		user1.setUserType("parent");
		user1.setPassword("vara");
		assertEquals(user1,userr.addNewUser(user1));
		System.out.println("true");
	}
	@Test
	public void updateUser() {
		User user2 = new User();
		user2.setUserId(1);
		user2.setUserType("parent");
		user2.setPassword("vara");
		assertEquals(user2,userr.updateUser(user2));
		System.out.println("true");
	}
	@Test
	public void deleteUser() {
		User user3 = new User();
		user3.setUserId(1);
		user3.setUserType("parent");
		user3.setPassword("vara");
		assertEquals(user3,userr.deleteUser(user3));
		System.out.println("true");
	}
	@Test
	public void signInUser() {
		User user4 = new User();
		user4.setUserId(1);
		user4.setUserType("parent");
		user4.setPassword("vara");
		assertEquals(user4,userr.signIn(user4));
		System.out.println("true");
	}
	@Test
	public void signOutUser() {
		User user5 = new User();
		user5.setUserId(1);
		user5.setUserType("parent");
		user5.setPassword("vara");
		assertEquals(user5,userr.signOut(user5));
		System.out.println("true");
	}
}


