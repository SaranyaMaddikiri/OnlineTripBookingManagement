import java.util.List;
import javax.persistence.*;

public class RouteRepositoryImpl implements IRouteRepository{
	EntityManager manager;
	public RouteRepositoryImpl() {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		manager= f.createEntityManager();
		
	}

	@Override
	public Route addRoute(Route route) {
		manager.getTransaction().begin();
		manager.persist(route);
		manager.getTransaction().commit();
		return route;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Route updateRoute(Route route) throws RouteNotFoundException {
		manager.getTransaction().begin();
		manager.merge(route);
		manager.getTransaction().commit();
		
		return route;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Route removeRoute(int routeId) throws RouteNotFoundException {
		
		manager.getTransaction().begin();
		Route routeobj=manager.find(Route.class,routeId);
		manager.remove(routeobj);
		manager.getTransaction().commit();
		return routeobj;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Route searchRoute(int routeId) throws RouteNotFoundException {
         Route routeobj1=manager.find(Route.class,routeId);
         return routeobj1;
		// TODO Auto-generated method stub
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Route> viewRouteList() {
		return manager.createQuery("from Route").getResultList();
		
		
		// TODO Auto-generated method stub
		
	}

}