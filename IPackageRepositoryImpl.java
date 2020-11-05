//Repository class implementation
import java.util.List;
import javax.persistence.*;
import org.hibernate.MappingException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class IPackageRepositoryImpl implements IPackageRepository{
	EntityManager manager;
	public IPackageRepositoryImpl() {
		// TODO Auto-generated constructor stub
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		manager = f.createEntityManager();
	}
	@Override
	public Package addPackage(Package pack) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(pack);
		manager.getTransaction().commit();
		return pack;
	}
	@Override
	public Package searchPackage(int packageId) throws PackageNotFoundException {
	// TODO Auto-generated method stub
		Package packobj2=manager.find(Package.class,packageId);
		return packobj2;
	}
	
	@Override
	public Package deletePackage(int packageId) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		Package packobj=manager.find(Package.class,packageId);
		manager.remove(packobj);
		manager.getTransaction().commit();
		return packobj;
	} 
	
		
	@Override
	public  List<Package> viewAllPackages(){
		return manager.createQuery("from Package").getResultList();
	}
	
	}


