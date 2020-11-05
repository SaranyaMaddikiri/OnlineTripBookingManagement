import java.util.Scanner;


public class MainUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUserService serviceobj= new UserServiceImpl();
		User userobj = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the option which you want:-");
		
		System.out.println("1.Adding");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.signIn");
		System.out.println("5.signOut");
		int n = sc.nextInt();
		
	 switch(n) {
		case 1: System.out.println("Enter the userId");
		        int userId = sc.nextInt();
		        System.out.println("Enter the userType");
		        String userType = sc.next();
		        System.out.println("Enter the password");
		        String password = sc.next();
		        userobj.setUserId(userId);
		        
		  userobj.setUserType(userType);
		  userobj.setPassword(password);
		  
		  User user1 = serviceobj.addNewUser(userobj);
		  System.out.println(user1.getUserId());
		  System.out.println(user1.getUserType());
		  System.out.println(user1.getPassword());
	      System.out.println("added successfully");
	      
	  break;
		case 2: System.out.println("Enter the userId");
		        int userId1 = sc.nextInt();
		        userobj.setUserId(userId1);
		        System.out.println("Enter the userType");
		        String userType1 = sc.next();
		        userobj.setUserType(userType1);
		        System.out.println("Enter the password");
		        String password1 = sc.next();
		        userobj.setPassword(password1);
		  User user2 = serviceobj.updateUser(userobj);
		  System.out.println(user2.getUserId());
		  System.out.println(user2.getUserType());
		  System.out.println(user2.getPassword());
	      System.out.println("updated successfully");
	      
	 break;
		case 3:  System.out.println("Enter the userId");
                 int userId2 = sc.nextInt();
                 userobj.setUserId(userId2);
                        
       User user3 = serviceobj.deleteUser(userobj);
       System.out.println(user3.getUserId());
       System.out.println(user3.getUserType());
       System.out.println(user3.getPassword());
       System.out.println("deleted successfully");
    break;
		case 4: System.out.println("Enter the userId");
                int userId3 = sc.nextInt();
                userobj.setUserId(userId3);
                System.out.println("Enter the userType");
                String userType3 = sc.next();
                userobj.setUserType(userType3);
                System.out.println("Enter the password");
                String password3 = sc.next();
                userobj.setPassword(password3);
        
      User user4 = serviceobj.signIn(userobj);
       System.out.println(user4.getUserId());
       System.out.println(user4.getUserType());
       System.out.println(user4.getPassword());
       System.out.println("signIn successfully");
       
       
     break;
		case 5: System.out.println("Enter the userId");
                int userId4 = sc.nextInt();
                userobj.setUserId(userId4);
                System.out.println("Enter the userType");
                String userType4 = sc.next();
                userobj.setUserType(userType4);
                System.out.println("Enter the password");
                 String password4 = sc.next();
                 userobj.setPassword(password4);

      User user5 = serviceobj.signOut(userobj);
      System.out.println(user5.getUserId());
      System.out.println(user5.getUserType());
      System.out.println(user5.getPassword());
      System.out.println("signOut successfully");
      
	   
		  System.out.println(userobj);
		 break;
	 }
	 
	 
	}
}