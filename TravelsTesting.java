package com.cg.tms.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.cg.tms.entities.Travels;
import com.cg.tms.exceptions.TravelsNotFoundException;

import TripManagementSystemRepositories.ITravelsRepository;
import TripManagementSystemRepositories.ITravelsRepositoryimp;

public class TripManagementtest {

	ITravelsRepository repo=new ITravelsRepositoryimp();
	Travels travels=new Travels();
	
	@Test
	public void testaddTravels(){
		travels.settravelsId(61);
		assertTrue(travels.gettravelsId()>0);
	}
	
	@Test
	public void testnametest(){
		travels.settravelsName("suresh");
		assertNotNull(travels.gettravelsName());
	}
	
	@Test
	public void testagentnametest(){
		travels.setagentName("kumar");
		assertNotNull(travels.getagentName());
	}
	
	@Test
	public void testupdateTravels() throws TravelsNotFoundException{
		travels.settravelsId(61);
		travels.settravelsName("raj");
		travels.setagentName("kumar");
		travels.setAddress("7rkstreet");
		travels.setContact("9962519058");
		assertEquals("updated successfully",travels,repo.updateTravels(travels));
	}
	
	
	@Test
	public void testviewTravels(){
		List<Travels> travels1 = repo.viewTravels();
		assertNotNull(travels1);
	}
	
	
	
	
	
	
	
	

}
