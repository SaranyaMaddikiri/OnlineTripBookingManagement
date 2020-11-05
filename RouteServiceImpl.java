import java.util.List;

public class RouteServiceImpl implements IRouteService{
	IRouteRepository routeR;
	public RouteServiceImpl() {
		routeR= new RouteRepositoryImpl();
	}
	@Override
	public Route addRoute(Route route) {
		// TODO Auto-generated method stub
		return routeR.addRoute(route);
	}

	@Override
	public Route updateRoute(Route route) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return routeR.updateRoute(route);
	}

	@Override
	public Route removeRoute(int routeId) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return routeR.removeRoute(routeId);
	}

	@Override
	public Route searchRoute(int routeId) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return routeR.searchRoute(routeId);
	}

	@Override
	public List<Route> viewRouteList() {
		// TODO Auto-generated method stub
		return routeR.viewRouteList();
	}
	
}