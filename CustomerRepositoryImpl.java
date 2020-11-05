import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CustomerRepositoryImpl implements ICustomerRepository {
	EntityManager manager;
	public CustomerRepositoryImpl() {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		manager= f.createEntityManager();
		//manager= JPA-PU.getEntityManager();
	}
	@Override
	public Customer addCustomer(Customer customer)throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(customer);
		manager.getTransaction().commit();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.merge(customer);
		manager.getTransaction().commit();
		return customer;
	}

	@Override
	public Customer deleteCustomer(Customer customer)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		customer=manager.find(Customer.class, customer);
		manager.remove(customer);
		manager.getTransaction().commit();
		return customer;
	}
	@Override
	public Customer viewCustomer(int customerId)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		Customer customerobj1=manager.find(Customer.class, customerId);
		return customerobj1;
	}

	@Override
	public List<Customer> viewAllCustomers(int PackageId)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		/*TypedQuery<Customer> query=manager.createQuery("select customer from Customer customer where customer.PackageId=:name",Customer.class);
		query.setParameter("name",PackageId);
		List<Customer> list=query.getResultList();*/
		return manager.createQuery("from Customer").getResultList();
	}
	@Override
	public List<Customer> viewCustomerList(int RouteId)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		TypedQuery<Customer> query=manager.createQuery("select customer from Customer customer where customer.RouteId=:name",Customer.class);
		query.setParameter("name",RouteId);
		List<Customer> list=query.getResultList();
		return list;
	}
}