	import static org.junit.jupiter.api.Assertions.*;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import org.junit.jupiter.api.Test;

	class TripManagementtest {
		CustomerRepositoryImpl customerr = new CustomerRepositoryImpl();
		@Test
		public void addCustomer() {
			Customer customer1 = new Customer();
			assertEquals(customer1,customerr.addCustomer(customer1));
			System.out.println("true");
		}
		@Test
		public void updateCustomer() {
			Customer customer1 = new Customer();
			assertEquals(customer1,customerr.updateCustomer(customer1));
			System.out.println("true");
		}
		@Test
		public void deleteCustomer() {
			Customer customer1 = new Customer();
			assertEquals(customer1,customerr.deleteCustomer(customer1));
			System.out.println("true");
		}
		@Test
		public void viewCustomer() {
			Customer customer1 = new Customer();
			assertEquals(customer1,customerr.viewCustomer(customer1));
			System.out.println("true");
		}
		/*@Test
		public void viewAllCustomers() {
			List<Customer> customer1 =repo.viewAllCustomers(customer1);
			assertNotNull(customer1);
		}
	
	@Test

		public void viewCustomersList() {
			List<Customer> customer1 =repo.viewCustomersList(customer1);
			assertNotNull(customer1);
		}*/
	}