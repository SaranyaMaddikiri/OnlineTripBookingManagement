
import java.util.List;

public interface IBookingRepository {

	//add method
	public Booking makeBooking(Booking booking);
	
	
	//delete method
	public  Booking  cancelBooking(int bookingId) throws BookingNotFoundException;
	
	
	
	//view method
	public  Booking  viewBooking(Booking bookingId)throws BookingNotFoundException;


	


	
	
	
	
	
}
