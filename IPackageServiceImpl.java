import java.util.List;


//Service class implementation
public class IPackageServiceImpl implements IPackageService{

	IPackageRepository pre;
	public IPackageServiceImpl() {
		pre=new IPackageRepositoryImpl();
	}
	@Override
	public Package addPackage(Package pack) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		return pre.addPackage(pack);
	}
	@Override
	public Package searchPackage(int packageId) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		return pre.searchPackage(packageId);
	}
	@Override
	public Package deletePackage(int packageId) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		return pre.deletePackage(packageId);
	}
	@Override
	public  List<Package> viewAllPackages(){
		return pre.viewAllPackages();
	}
	
	
}
