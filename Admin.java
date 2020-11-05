import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_table")
public class Admin {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int  adminId;
	@Column
	private String adminName;
	@Column
	private  String password;
	@Column
	private String email;
	@Column
	private  String mobile;
	
	public void setadminId(int adminId){
		this.adminId=adminId;
	}
	
	public int getadminId(){
		return adminId;
	}
	
	public void setadminName(String adminName){
		this.adminName=adminName;
	}
	
	public String getadminName(){
		return adminName;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public String  getPassword(){
		return password;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setMobile(String mobile){
		this.mobile=mobile;
	}
	
	public String getMobile(){
		return mobile;
	}
	
	
	

}