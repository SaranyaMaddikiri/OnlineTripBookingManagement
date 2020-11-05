import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {
	
@Id
private int CustomerId;
@Column
private String CustomerName;
@Column
private String CustomerPassword;
@Column
private String address;
@Column
private String mobileNo;
@Column
private String email;

public int getCustomerId() {
	return CustomerId;
}
public void setCustomerId(int Customerid) {
	CustomerId = Customerid;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String Customername) {
	CustomerName = Customername;
}
public String getCustomerPassword() {
	return CustomerPassword;
}
public void setCustomerPassword(String Customerpassword) {
	CustomerPassword = Customerpassword;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String toString() {
	return "Customer [CustomerId="+CustomerId+",CustomerName="+CustomerName+",CustomerPassword="+CustomerPassword+",address="+address+",mobileNo="+mobileNo+",email="+email+"]";
}
}