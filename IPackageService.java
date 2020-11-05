//Service Interface
import java.util.List;
public interface IPackageService {
	public Package addPackage(Package pack) throws PackageNotFoundException;
	
	public Package searchPackage(int packageId) throws PackageNotFoundException;
	
	public Package deletePackage(int packageId) throws PackageNotFoundException;
	
	public  List<Package> viewAllPackages();

}
