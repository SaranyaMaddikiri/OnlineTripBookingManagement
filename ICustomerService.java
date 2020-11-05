import java.util.List;

public interface ICustomerService {
	
		public Customer addCustomer(Customer customer)throws CustomerNotFoundException;
		
		public Customer updateCustomer(Customer customer)throws CustomerNotFoundException;
		
		public Customer deleteCustomer(Customer customer)throws CustomerNotFoundException;
		
		public Customer viewCustomer(int customerId)throws CustomerNotFoundException;
		
		public List <Customer> viewAllCustomers(int PackageId)throws CustomerNotFoundException;
		
		public List<Customer> viewCustomerList(int RouteId)throws CustomerNotFoundException;

	}