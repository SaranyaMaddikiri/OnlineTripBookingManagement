import java.util.Scanner;



public class MainBooking {

	public static void main(String[] args) throws BookingNotFoundException {
		IBookingService ser = new BookingServiceImpl();
		
		Booking boo=new Booking();
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Booking Id:");
		int id=sc.nextInt();
		System.out.println("Enter Booking Type");
		String type=sc.next();
		System.out.println("Enter description");
		String descr=sc.next();
		System.out.println("Enter Booking title");
		String title=sc.next();
		
		
		
		boo.setBookingId(id);				
		boo.setBookingType(type);
		boo.setDescription(descr);
		boo.setBookingTitle(title);
		
		

		Booking method=ser.makeBooking(boo);
		System.out.println(method.getBookingId());
		System.out.println(method.getBookingType());
		System.out.println(method.getDescription());
		System.out.println(method.getBookingTitle());*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id that to be deleted:");
		int id=sc.nextInt();
		boo.setBookingId(id);
		
		Booking method = ser.cancelBooking(id);
		System.out.println("record deleted");
		
		
		

	}

}
