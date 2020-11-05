import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
	import org.junit.jupiter.api.BeforeAll;

	public class TripManagementtest {
		static CustomerRepositoryImpl icre;
		static Customer customer;
		
		@BeforeAll
		public static void initialize() {
			System.out.println("in before class");
			icre = new CustomerRepositoryImpl();
			customer = new Customer();
		}
		@Test
		public void testAddCustomer()  {
			
			assertNotNull(icre.addCustomer(customer));
		}
		@Test
		public void testAddCustomer1() {

			customer.setCustomerId(1);
	        customer.setCustomerName("sai");
			customer.setCustomerPassword("123");
			customer.setAddress("TKstreet");
	        customer.setMobileNo("9836582190");
			customer.setEmail("sai123@gmail.com");
			
			
			assertSame(customer,icre.addCustomer(customer));

		}
		@Test
		public void testupdateUser()  {
			
			assertNotNull(icre.updateCustomer(customer));
		}
		@Test
		public void testupdateCustomer1() {

			customer.setCustomerId(1);
	        customer.setCustomerName("sai");
			customer.setCustomerPassword("123");
			customer.setAddress("TKstreet");
	        customer.setMobileNo("9836582190");
			customer.setEmail("sai123@gmail.com");
			assertSame(customer,icre.updateCustomer(customer));
		}
		@Test
		public void testdeleteCustomer()  {
			
			assertNotNull(icre.deleteCustomer(customer));
		}
		@Test
		public void testdeleteUser1() {

		customer.setCustomerId(1);
	        customer.setCustomerName("sai");
			customer.setCustomerPassword("123");
			customer.setAddress("TKstreet");
	        customer.setMobileNo("9836582190");
			customer.setEmail("sai123@gmail.com");
			assertSame(customer,icre.deleteCustomer(customer));
		}
	@Test
	public void testviewCustomer()  {
		
		assertNotNull(icre.viewCustomer(customer));
	}
	@Test
	public void testviewCustomer1() {

	customer.setCustomerId(1);
        customer.setCustomerName("sai");
		customer.setCustomerPassword("123");
		customer.setAddress("TKstreet");
        customer.setMobileNo("9836582190");
		customer.setEmail("sai123@gmail.com");
		assertSame(customer,icre.viewCustomer(customer));
	}
	}
	
	/*@Test
	public void testviewAllCustomers(){
	assertNotNull(icre.viewAllCustomer(customer));
	}
	@Test
	public void testviewAllCustomers1(){
	customer.setCustomerId(1);
		List<Customer> customer1 = repo.viewAllCustomers();
		assertNotNull(customer1);
	}


	@Test
	public void testviewCustomerList(){
	assertNotNull(icre.viewAllCustomer(customer));
	}
	@Test
	public void testviewCustomersList1(){
	customer.setCustomerId(1);
		List<Customer> customer1 = repo.viewCustomerList();
		assertNotNull(customer1);
		}
	*/