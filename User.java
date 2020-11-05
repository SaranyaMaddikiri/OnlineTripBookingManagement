import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
     @Id
     //@GeneratedValue(strategy=GenerationType.AUTO)
     private int userId;
     @Column
     //@OnetoOne
 	 private String userType;
     @Column
     /*@OnetoOne
 	@joinColumn(name="password")*/
	 private String password;
     
    

    public int getUserId() {
	 return userId;
}
     public void setUserId(int userId) {
	 this.userId = userId;
}
     public String getUserType() {
	 return userType;
}
     public void setUserType(String userType) {
	 this.userType = userType;
}
     public String getPassword() {
	 return password;
}
     public void setPassword(String password) {
	 this.password = password;
}
@Override
public String toString() {
	return "user [userId=" + userId +", userType=" + userType +", password=" + password +"]";
}
}