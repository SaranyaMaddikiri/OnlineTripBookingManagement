public class UserServiceImpl implements IUserService {
	IUserRepository userr;
	public UserServiceImpl() {
		userr = new UserRepositoryImpl();
	}
	
	@Override
	public User addNewUser(User user) {
		return userr.addNewUser(user);
	}
	@Override
	public User updateUser(User user) {
		return userr.updateUser(user);
	}
	@Override
	public User deleteUser(User user) {
		return userr.deleteUser(user);
	}
	@Override
	public User signIn(User user) {
		return userr.signIn(user);
	}
	@Override
	public User signOut(User user) {
		return userr.signOut(user);
	}

}