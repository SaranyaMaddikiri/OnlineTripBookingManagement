 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bus")
public class Bus {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int busId;
	@Column
	private  String busType;
	@Column
	private  String busNumber;
	@Column
	private int capacity;
	/*@Column
	private Travels travel;
	*/
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/*public Travels getTravel() {
		return travel;
	}
	public void setTravel(Travels travel) {
		this.travel = travel;
	}*/
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busType=" + busType + ", busNumber=" + busNumber + ", capacity=" + capacity
				+ "]";
	}

	
}