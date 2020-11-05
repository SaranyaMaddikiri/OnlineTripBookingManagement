import java.util.List;
public interface IUserRepository {
public  User addNewUser(User user);
public User updateUser(User user);
public User deleteUser(User user);
public User signIn(User user);
public User signOut(User user);
}