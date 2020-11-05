
public class BookingNotFoundException extends Exception {
	String message;
	public BookingNotFoundException(String message) {
		super();
		this.message = message;
	}
}
