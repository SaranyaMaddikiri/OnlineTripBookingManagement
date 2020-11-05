//Entities
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.xpath.*;
@Entity
@Table(name="Package")
public class Package {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int packageId;
	@Column
	private String packageName;
	@Column
	private String packageDescription;
	@Column
	private String packageType;
	@Column
	private double packageCost;
	
	
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageDescription() {
		return packageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageType=" + packageType + ", packageCost=" + packageCost + "]";
	}
	
	
}
