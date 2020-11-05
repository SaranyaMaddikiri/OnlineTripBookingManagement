

public class BookingServiceImpl implements IBookingService {
	IBookingRepository ibr;
	public BookingServiceImpl() {
		ibr=new BookingRepositoryImpl();
		}

	@Override
	public Booking makeBooking(Booking booking) {
		// TODO Auto-generated method stub
		return ibr.makeBooking(booking);
	}

	@Override
	public Booking cancelBooking(int bookingId) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return ibr.cancelBooking(bookingId);
	}

	@Override
	public Booking viewBooking(Booking bookingId) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return ibr.viewBooking(bookingId);
	}

	

}
