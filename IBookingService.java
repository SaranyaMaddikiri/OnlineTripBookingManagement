
public interface IBookingService {
	
	public  Booking  makeBooking(Booking booking);
	public  Booking  cancelBooking(int bookingId) throws BookingNotFoundException;
	public  Booking  viewBooking(Booking bookingId)throws BookingNotFoundException;
	
	
	
	

}
