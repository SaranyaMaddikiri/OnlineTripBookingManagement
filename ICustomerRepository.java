import java.util.List;
public interface ICustomerRepository {
public Customer addCustomer(Customer customer) throws CustomerNotFoundException ;
public Customer updateCustomer(Customer customer)throws CustomerNotFoundException;
public Customer deleteCustomer(Customer customer)throws CustomerNotFoundException;
public Customer viewCustomer(Customer CustomerId)throws CustomerNotFoundException;
public List<Customer> viewAllCustomers(int PackageId)throws CustomerNotFoundException;
public List<Customer> viewCustomerList(int RouteId)throws CustomerNotFoundException;
}