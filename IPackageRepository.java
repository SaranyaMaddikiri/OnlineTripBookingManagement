import java.util.List;

//interface repository
public interface IPackageRepository {
	public Package addPackage(Package pack) throws PackageNotFoundException;
	
	public Package searchPackage(int packageId) throws PackageNotFoundException;
	
	public Package deletePackage(int packageId) throws PackageNotFoundException;
	
	public  List<Package> viewAllPackages();
}
