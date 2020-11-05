import java.util.List;
import java.util.Scanner;

public class MainAdmin {


public static void main(String args[]) throws TravelsNotFoundException{
	
	ITravelsService serviceobj=new ITravelsServiceImpl();
	Travels travelobj=new Travels();
	Scanner sc=new Scanner(System.in);
	System.out.println("Select the option which you want :-");
	
	System.out.println("1.Adding");
	System.out.println("2.UPDATE");
	System.out.println("3.REMOVE");
	System.out.println("4.SEARCH");
	System.out.println("5.VIEW");
	int n=sc.nextInt();
	
	
	switch(n){
		case 1:
			System.out.println("Enter the travel id:");
			int travelsId=sc.nextInt();
			System.out.println("Enter the travels name");
			String travelsName=sc.next();
			System.out.println("Enter the agent name");
			String agentName=sc.next();
			System.out.println("Enter the address");
			String address=sc.next();
			System.out.println("Enter the contact");
			String contact=sc.next();
			travelobj.setTravelsId(travelsId);
			travelobj.setTravelsName(travelsName);
			travelobj.setAgentName(agentName);
			travelobj.setAddress(address);
			travelobj.setContact(contact);
			Travels trav1=serviceobj.addTravels(travelobj);
			System.out.println(trav1.getTravelsId());
			System.out.println(trav1.getTravelsName());
			System.out.println(trav1.getAgentName());
			System.out.println(trav1.getAddress());
			System.out.println(trav1.getContact());
			System.out.println("added succesfully");
			break;
		case 2:
			System.out.println("Enter id");
			int id=sc.nextInt();
			travelobj.setTravelsId(id);
			System.out.println("Enter the travels name");
			String travelsName1=sc.next();
			travelobj.setTravelsName(travelsName1);
			System.out.println("Enter the agent name");
			String agentName1=sc.next();
			travelobj.setAgentName(agentName1);
			System.out.println("Enter the address");
			String address1=sc.next();
			travelobj.setAddress(address1);
			System.out.println("Enter the contact");
			String contact1=sc.next();
			travelobj.setContact(contact1);
			Travels trav2=serviceobj.updateTravels(travelobj);
			System.out.println(trav2.getTravelsId());
			System.out.println(trav2.getTravelsName());
			System.out.println(trav2.getAgentName());
			System.out.println(trav2.getAddress());
			System.out.println(trav2.getContact());
			System.out.println("updated succesfully");
			break;
		case 3:
			System.out.println("Enter to id of the row to be deleted");
			int travelsId1=sc.nextInt();
			travelsId=travelsId1;
			Travels travels=serviceobj.removeTravels(travelsId);
			System.out.println("Record Deleted");
		break;
		case 4:
			System.out.println("Enter id");
			int id1=sc.nextInt();
			travelobj.setTravelsId(id1);
			Travels trav3=serviceobj.searchTravels(id1);
			System.out.println(trav3.getTravelsName());
			System.out.println(trav3.getAgentName());
			System.out.println(trav3.getAddress());
			System.out.println(trav3.getContact());
			System.out.println("The data retived succesfully");
			break;
		case 5:
			List<Travels> i=serviceobj.viewTravels();
			for(Travels travel : i){
				System.out.println(travel);
			}
			break;
			
	}	
	
}
}