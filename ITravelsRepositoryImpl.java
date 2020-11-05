import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class ITravelsRepositoryImpl  implements ITravelsRepository{
	EntityManager manager;
	Scanner sc=new Scanner(System.in);
	public ITravelsRepositoryImpl(){
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		manager= f.createEntityManager();
	}

	@Override
	public Travels addTravels(Travels travels) {
		manager.getTransaction().begin();
		manager.merge(travels);
		manager.getTransaction().commit();
		return travels;
	}

	@Override
	public Travels updateTravels(Travels travels) {
		manager.getTransaction().begin();
		manager.merge(travels);
		manager.getTransaction().commit();
		return travels;
	}

	@Override
	public Travels removeTravels(int travelsId) {
		manager.getTransaction().begin();
		Travels temptravelsId=manager.find(Travels.class,travelsId);
		manager.remove(temptravelsId);
		manager.getTransaction().commit();
		return temptravelsId;
	}

	@Override
	public Travels searchTravels(int travelsId) {
		manager.getTransaction().begin();
		Travels temptravelsId=manager.find(Travels.class,travelsId);
		manager.getTransaction().commit();
		return temptravelsId;
	}

	@Override
	public List<Travels> viewTravels() {
		manager.getTransaction().begin();
		TypedQuery<Travels> query=manager.createQuery("select travels from Travels travels",Travels.class);
		List<Travels> list=query.getResultList();
		manager.getTransaction().commit();
		return list;
		
	}
	
}