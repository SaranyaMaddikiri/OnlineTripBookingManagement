import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.List;
public class MainRoute {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
      IRouteService routeS=new RouteServiceImpl();
      Route routeobj=new Route();
      Bus  busesobj=new Bus();
      Travels travelobj=new Travels();
      Scanner sc= new Scanner(System.in);
      System.out.println("Select the option:");
		System.out.println("1.Adding");
		System.out.println("2.Update");
		System.out.println("3.Search");
		System.out.println("4.Remove");
		System.out.println("5.View");
		int n=sc.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("Enter routeId");
			int routeId=sc.nextInt();
			System.out.println("Enter routeFrom");
			String routeFrom=sc.next();
			System.out.println("Enter routeTo");
			String routeTo=sc.next();
			System.out.println("Enter bus Id");
			int busId=sc.nextInt();
      		System.out.println("Enter busType");
			String busType=sc.next();
			System.out.println("Enter busNumber");
			String busNumber=sc.next();
			System.out.println("Enter capacity");
			int capacity=sc.nextInt();
			System.out.println("Enter travels Id");
			int travelsId=sc.nextInt();
      		System.out.println("Enter travelsName");
			String travelsName=sc.next();
			System.out.println("Enter agentName");
			String agentName=sc.next();
			System.out.println("Enter address");
			String address=sc.next();
			System.out.println("Enter contact");
			String contact=sc.next();
            System.out.println("Enter departureTime");
            LocalDateTime departureTime=LocalDateTime.now();
            System.out.println("Enter arrivalTime");
            LocalDateTime arrivalTime=LocalDateTime.now();
            System.out.println("Enter doj");
            LocalDate doj=LocalDate.now();
            System.out.println("Enter pickupPoint");
            String pickupPoint=sc.next();
            System.out.println("Enter fare");
            double fare=sc.nextDouble();
       
            routeobj.setRouteId(routeId);
            routeobj.setRouteFrom(routeFrom);
            routeobj.setRouteTo(routeTo);
            busesobj.setBusId(busId);
            busesobj.setBusType(busType);
            busesobj.setBusNumber(busNumber);
            busesobj.setCapacity(capacity);
            travelobj.setTravelsId(travelsId);
            travelobj.setTravelsName(travelsName);
            travelobj.setAgentName(agentName);
            travelobj.setAddress(address);
            travelobj.setContact(contact);
            routeobj.setDepartureTime(departureTime);
            routeobj.setArrivalTime(arrivalTime);
            routeobj.setDoj(doj);
            routeobj.setPickupPoint(pickupPoint);
            routeobj.setFare(fare);
      
	        Route route=routeS.addRoute(routeobj);
	        System.out.println(route.getRouteId());
	        System.out.println(route.getRouteFrom());
	        System.out.println(route.getRouteTo());
	        System.out.println(busesobj.getBusId());
	        System.out.println(busesobj.getBusType());
	        System.out.println(busesobj.getBusNumber());
	        System.out.println(busesobj.getCapacity());
	        System.out.println(travelobj.getTravelsId());
	        System.out.println(travelobj.getTravelsName());
	        System.out.println(travelobj.getAgentName());
	        System.out.println(travelobj.getAddress());
	        System.out.println(travelobj.getContact());   
	        System.out.println(route.getDepartureTime());
	        System.out.println(route.getArrivalTime());
	        System.out.println(route.getDoj());
	        System.out.println(route.getPickupPoint());
	        System.out.println(route.getFare());
	        break;
	       
		case 2:
			System.out.println("Enter routeId");
			int routeId1=sc.nextInt();
			System.out.println("Enter routeFrom");
			String routeFrom1=sc.next();
			System.out.println("Enter routeTo");
			String routeTo1=sc.next();
			System.out.println("Enter bus Id");
			int busId1=sc.nextInt();
      		System.out.println("Enter busType");
			String busType1=sc.next();
			System.out.println("Enter busNumber");
			String busNumber1=sc.next();
			System.out.println("Enter capacity");
			int capacity1=sc.nextInt();
			System.out.println("Enter travels Id");
			int travelsId1=sc.nextInt();
      		System.out.println("Enter travelsName");
			String travelsName1=sc.next();
			System.out.println("Enter agentName");
			String agentName1=sc.next();
			System.out.println("Enter address");
			String address1=sc.next();
			System.out.println("Enter contact");
			String contact1=sc.next();
            System.out.println("Enter departureTime");
            LocalDateTime departureTime1=LocalDateTime.now();
            System.out.println("Enter arrivalTime");
            LocalDateTime arrivalTime1=LocalDateTime.now();
            System.out.println("Enter doj");
            LocalDate doj1=LocalDate.now();
            System.out.println("Enter pickupPoint");
            String pickupPoint1=sc.next();
            System.out.println("Enter fare");
            double fare1=sc.nextDouble();
            
            routeobj.setRouteId(routeId1);
            routeobj.setRouteFrom(routeFrom1);
            routeobj.setRouteTo(routeTo1);
            busesobj.setBusId(busId1);
            busesobj.setBusType(busType1);
            busesobj.setBusNumber(busNumber1);
            busesobj.setCapacity(capacity1);
            travelobj.setTravelsId(travelsId1);
            travelobj.setTravelsName(travelsName1);
            travelobj.setAgentName(agentName1);
            travelobj.setAddress(address1);
            travelobj.setContact(contact1);
            routeobj.setDepartureTime(departureTime1);
            routeobj.setArrivalTime(arrivalTime1);
            routeobj.setDoj(doj1);
            routeobj.setPickupPoint(pickupPoint1);
            routeobj.setFare(fare1);
            
			Route route2=routeS.updateRoute(routeobj);
	        System.out.println(route2.getRouteId());
	        System.out.println(route2.getRouteFrom());
	        System.out.println(route2.getRouteTo());
	        System.out.println(busesobj.getBusId());
	        System.out.println(busesobj.getBusType());
	        System.out.println(busesobj.getBusNumber());
	        System.out.println(busesobj.getCapacity());
	        System.out.println(travelobj.getTravelsId());
	        System.out.println(travelobj.getTravelsName());
	        System.out.println(travelobj.getAgentName());
	        System.out.println(travelobj.getAddress());
	        System.out.println(travelobj.getContact());   
	        System.out.println(route2.getDepartureTime());
	        System.out.println(route2.getArrivalTime());
	        System.out.println(route2.getDoj());
	        System.out.println(route2.getPickupPoint());
	        System.out.println(route2.getFare());
	        break;
	     
		case 3:
			System.out.println("Enter routeId to search");
			int routeId3=sc.nextInt();	
			routeobj.setRouteId(routeId3);
			Route route1=routeS.searchRoute(routeId3);
			System.out.println(route1.getRouteId());
			System.out.println(route1.getRouteFrom());
			System.out.println(route1.getRouteTo());
			/*System.out.println(busesobj.getBusId());
	        System.out.println(busesobj.getBusType());
	        System.out.println(busesobj.getBusNumber());
	        System.out.println(busesobj.getCapacity());
	        System.out.println(travelobj.getTravelsId());
	        System.out.println(travelobj.getTravelsName());
	        System.out.println(travelobj.getAgentName());
	        System.out.println(travelobj.getAddress());
	        System.out.println(travelobj.getContact());*/   
	        System.out.println(route1.getDepartureTime());
	        System.out.println(route1.getArrivalTime());
	        System.out.println(route1.getDoj());
	        System.out.println(route1.getPickupPoint());
	        System.out.println(route1.getFare());
			System.out.println("The data retrived succesfully");
			break;
			
		case 4:
			System.out.println("Enter route Id to delete:");
			int routeId2=sc.nextInt();
			routeobj.setRouteId(routeId2);
			routeId=routeId2;
			routeS.removeRoute(routeId2);
			System.out.println("Record Deleted");
			break;
		
		case 5:
			
			List<Route> routeList=routeS.viewRouteList();
			for (Route p: routeList) {
				System.out.println(p);		
			}
			break;
         	
		}
         sc.close();
        
        
        
      	
	}
}