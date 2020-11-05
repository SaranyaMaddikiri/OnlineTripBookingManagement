import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UserRepositoryImpl  implements IUserRepository {
	EntityManager manager;
	
	public UserRepositoryImpl() {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		manager = f.createEntityManager();
	}
	@Override
	public User addNewUser(User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		
		manager.getTransaction().commit();
		return user;
	}
	@Override
	public User updateUser(User user) {
		manager.getTransaction().begin();
		manager.merge(user);
		manager.getTransaction().commit();
		return user;
	}
	@Override
	public User deleteUser(User user) {
		manager.getTransaction().begin();
		manager.remove(user);
		manager.getTransaction().commit();
		return user;
	}
	@Override
	public User signIn(User user) {
		manager.getTransaction().begin();
		//manager.signIn(user);
		manager.getTransaction().commit();
		return user;
	}
	@Override
	public User signOut(User user) {
		manager.getTransaction().begin();
		//manager.signOut(user);
		manager.getTransaction().commit();
		return user;
	}
	
}