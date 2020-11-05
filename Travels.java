import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="travels")

public class Travels {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int travelsId;
	@Column
	private String travelsName;
	@Column
	private String  agentName;
	@Column
	private String  address;
	@Column
	private String  contact;
	
	public void setTravelsId(int travelsId){
		this.travelsId=travelsId;
	}
	
	public int getTravelsId(){
		return travelsId;
	}
	
	public void setTravelsName(String travelsName){
		this.travelsName=travelsName;
	}
	
	public String getTravelsName(){
		return travelsName;
	}
	
	public void setAgentName(String agentName){
		this.agentName=agentName;
	}
	
	public String getAgentName(){
		return agentName;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setContact(String contact){
		this.contact=contact;
	}
	
	public String getContact(){
		return contact;
	}

	

}