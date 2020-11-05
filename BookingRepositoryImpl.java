import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookingRepositoryImpl implements IBookingRepository {

	EntityManager em;
	public BookingRepositoryImpl() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		em=emf.createEntityManager();
	}
	
	@Override
	public Booking makeBooking(Booking booking) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(booking);
		tx.commit();
		return booking;
	}

	@Override
	public Booking cancelBooking(int bookingId) throws BookingNotFoundException {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(bookingId);
		tx.commit();
		return null;
		/*Booking b=em.find(Booking.class, bookingId);
		if(b!= null) {
			EntityTransaction tx=em.getTransaction();
			em.remove(bookingId);
			tx.commit();
			}
			else {
				System.out.println("DETAILS NOT FOUND");
			}*/
			
		
	}

	@Override
	public Booking viewBooking(Booking bookingId) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
