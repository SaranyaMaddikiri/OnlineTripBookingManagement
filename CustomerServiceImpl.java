import java.util.List;
public class CustomerServiceImpl implements ICustomerService {
	
	ICustomerRepository customerr;
	public CustomerServiceImpl() {
		customerr = new CustomerRepositoryImpl();
	}
	@Override
	public Customer addCustomer(Customer customer)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		return customerr.addCustomer(customer);
	}
	
	@Override
	public Customer updateCustomer(Customer customer)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		return customerr.updateCustomer(customer);
	}

	@Override
	public Customer deleteCustomer(Customer customer)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		
		return customerr.deleteCustomer(customer);

	}

	@Override
	public Customer viewCustomer(Customer CustomerId)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		return customerr.viewCustomer(CustomerId);
	}

	@Override
	public List<Customer> viewAllCustomers(int PackageId)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		return customerr.viewAllCustomers(PackageId);
	}

	@Override
	public List<Customer> viewCustomerList(int RouteId)throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		return customerr.viewCustomerList(RouteId);
	}

}

