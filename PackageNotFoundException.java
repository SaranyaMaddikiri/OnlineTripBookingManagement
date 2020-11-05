//Exception
public class PackageNotFoundException extends RuntimeException{
	String message;

	public PackageNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super();
		this.message = message;
	}
}
