public class RouteNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	//int routeId;
	public RouteNotFoundException(String message, int routeId) {
		super();
		this.message = message;
		//this.routeId = routeId;
	}
}