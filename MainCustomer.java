import java.util.List;
		import java.util.Scanner;
		
		public class MainCustomer {

					public static void main(String[] args) throws Exception {
						// TODO Auto-generated method stub
						ICustomerService serviceobj= new CustomerServiceImpl();
					Customer customerobj = new Customer();
						Scanner sc = new Scanner(System.in);
						System.out.println("Select the option which you want:-");
						
						System.out.println("1.Adding");
						System.out.println("2.Update");
						System.out.println("3.Delete");
						System.out.println("4.view");
						System.out.println("5.viewAll");
						System.out.println("6.viewList");
						int n = sc.nextInt();
						
					 switch(n) {
						case 1: System.out.println("Enter the customerId");
						        int customerId = sc.nextInt();
						        System.out.println("Enter the customerName");
						        String customerName = sc.next();
						        System.out.println("Enter the customerPassword");
						        String customerPassword = sc.next();
						        System.out.println("Enter the address");
						        String address = sc.next();
						        System.out.println("Enter the mobileNo");
						        String mobileNo = sc.next();
						        System.out.println("Enter the email");
						        String email = sc.next();
						        
						  customerobj.setCustomerId(customerId);       
						  customerobj.setCustomerName(customerName);
						  customerobj.setCustomerPassword(customerPassword);
						  customerobj.setAddress(address);       
						  customerobj.setMobileNo(mobileNo);
						  customerobj.setEmail(email);
						  
						  
						  Customer Customer1 = serviceobj.addCustomer(customerobj);
						  System.out.println(Customer1.getCustomerId());
						  System.out.println(Customer1.getCustomerName());
						  System.out.println(Customer1.getCustomerPassword());
						  System.out.println(Customer1.getAddress());
						  System.out.println(Customer1.getMobileNo());
						  System.out.println(Customer1.getEmail());
						  
					      System.out.println("added successfully");
					      
					  break;
						case 2: System.out.println("Enter the CustomerId");
						        int customerId1 = sc.nextInt();
						        customerobj.setCustomerId(customerId1);
						        System.out.println("Enter the CustomerName");
						        String customerName1 = sc.next();
						        customerobj.setCustomerName(customerName1);
						        System.out.println("Enter the CustomerPassword");
						        String customerpassword1 = sc.next();
						        customerobj.setCustomerPassword(customerpassword1);
						        System.out.println("Enter the address");
						        String Address1 = sc.next();
						        customerobj.setAddress(Address1);
						        System.out.println("Enter the mobileNo");
						        String MobileNo1 = sc.next();
						        customerobj.setMobileNo(MobileNo1);
						        System.out.println("Enter the email");
						        String Email1 = sc.next();
						        customerobj.setEmail(Email1);
						        
						 Customer customer2 = serviceobj.updateCustomer(customerobj);
						  System.out.println(customer2.getCustomerId());
						  System.out.println(customer2.getCustomerName());
						  System.out.println(customer2.getCustomerPassword());
						  System.out.println(customer2.getAddress());
						  System.out.println(customer2.getMobileNo());
						  System.out.println(customer2.getEmail());
					      System.out.println("updated successfully");
					      
					 break;
						case 3: 
								System.out.println("Enter the user id to delete");
								int customerId2 =sc.nextInt();
								customerobj.setCustomerId(customerId2);
						        serviceobj.deleteCustomer(customerobj);
						        System.out.println("Record Deleted");	        
						    
				     break;
						case 4:System.out.println("Enter the customerId");
				                int customerId3 = sc.nextInt();
				                customerobj.setCustomerId(customerId3);
				                customerId=customerId3;
				              				        
				       Customer customer3 = serviceobj.viewCustomer(customerId3);
				       System.out.println(customer3.getCustomerId());
				       System.out.println(customer3.getCustomerName());
				       System.out.println(customer3.getCustomerPassword());
				       System.out.println(customer3.getAddress());
					   System.out.println(customer3.getMobileNo());
					   System.out.println(customer3.getEmail());
				       System.out.println("view successfully");
			      
				     break;
				
				case 5:	
					System.out.println("Enter PackageId to view");
					int PackageId=sc.nextInt();
					List<Customer> i=serviceobj.viewAllCustomers(PackageId);
				for (Customer customer1 : i) {
					System.out.println(customer1);	
				}
					break;
				case 6:
					System.out.println("Enter RouteId to viewlist");
					int RouteId=sc.nextInt();
				List<Customer> customerobjList1=serviceobj.viewCustomerList(RouteId);
				for (Customer customer1 : customerobjList1) {
					System.out.println(customer1);	
				}
				  break;
					 }
			}
		}
