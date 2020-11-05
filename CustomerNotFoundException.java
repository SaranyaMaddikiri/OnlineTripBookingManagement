
public class CustomerNotFoundException extends RuntimeException{
String message;
public CustomerNotFoundException(String message) {
	super();
	this.message=message;
}
}
