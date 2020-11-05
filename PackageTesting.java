import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PackageTesting {

	static IPackageRepositoryImpl ipre;
	static Package pack;

	@BeforeAll
	public static void initialize() {
		System.out.println("in before class");
		ipre = new IPackageRepositoryImpl();
		pack = new Package();
			
	}

	/*@Test
	public void testAddPackage() throws PackageNotFoundException {
		
		assertNotNull(ipre.addPackage(pack));
	}
	@Test
	public void testAddPackage1() throws PackageNotFoundException{

		pack.setPackageId(6);
		pack.setPackageName("hyderabad");
		pack.setPackageDescription("Triping");
		pack.setPackageType("city");
		pack.setPackageCost(15);
		assertSame(pack,ipre.addPackage(pack));

	}*/
	@Test
	public void testSearchPackageZero() throws PackageNotFoundException{
		assertNotNull(ipre.searchPackage(0));
	}
	@Test
	public void testSearchPackagePositive() throws PackageNotFoundException{
		assertNotNull(ipre.searchPackage(1));
	}	
	@Test
	public void testSearchPackageNegative() throws PackageNotFoundException{
		assertNotNull(ipre.searchPackage(-1));
	}	
	/*@Test
	public void testDeletePackageZero() throws PackageNotFoundException{
		assertNotNull(ipre.deletePackage(0));
	}	*/
	/*@Test
	public void testDeletePackagePositive() throws PackageNotFoundException{
		assertNotNull(ipre.deletePackage(2));
	}	*/
	/*@Test
	public void testDeletePackageNegative() throws PackageNotFoundException{
		assertNotNull(ipre.deletePackage(-1));
	}	*/
	@Test
	public void testViewAll() throws PackageNotFoundException{
		assertNotNull(ipre.viewAllPackages());
	}
	@Test
	public  void testViewAllPackages() throws PackageNotFoundException{
		assertEquals(pack,ipre.viewAllPackages());
	}

	
}
