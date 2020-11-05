import java.util.List;


public class ITravelsServiceImpl implements ITravelsService {
	
	ITravelsRepository ITravelRepobj;
	public ITravelsServiceImpl(){
		ITravelRepobj=new ITravelsRepositoryImpl();
	}

	@Override
	public Travels addTravels(Travels travels) {
		return ITravelRepobj.addTravels(travels);
		
	}

	@Override
	public Travels updateTravels(Travels travels) throws TravelsNotFoundException {
		return ITravelRepobj.updateTravels(travels);
	}

	@Override
	public Travels removeTravels(int travelsId) throws TravelsNotFoundException {
		return ITravelRepobj.removeTravels(travelsId);
	}

	@Override
	public Travels searchTravels(int travelsId) throws TravelsNotFoundException {
		return ITravelRepobj.searchTravels(travelsId);
	}

	@Override
	public List<Travels> viewTravels() {
		return ITravelRepobj.viewTravels();
	}

}