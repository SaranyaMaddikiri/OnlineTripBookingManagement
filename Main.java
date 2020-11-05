import java.util.List;
import java.util.Scanner;
import java.lang.*;
import javax.lang.model.element.NestingKind;
import org.hibernate.*;
import org.hibernate.annotations.*;
public class Main {
	public static void main(String[] args) throws PackageNotFoundException {
				IPackageService pse=new IPackageServiceImpl();
	
		Package pobj=new Package();
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println("Select the option:");
		System.out.println("1.Adding");
		System.out.println("2.Search");
		System.out.println("3.Delete");
		System.out.println("4.ViewAll");
		//accept an option
		try {
			int n=sc.nextInt();
			switch(n) {
		
		case 1:
			try {
				System.out.println("Enter Package Id:");
				int packageId=sc.nextInt();
				System.out.println("Enter Package Name:");
				String packageName= sc.next();
				System.out.println("Enter Package Description:");
				String packageDescription = sc.next();
				System.out.println("Enter Package Type:");
				String packageType=sc.next();
				System.out.println("Enter Package Cost:");
				double packageCost=sc.nextDouble();
		
				pobj.setPackageId(packageId);
				pobj.setPackageName(packageName);
				pobj.setPackageType(packageType);
				pobj.setPackageDescription(packageDescription);
				pobj.setPackageCost(packageCost);
		
				Package pack=pse.addPackage(pobj);
				System.out.println(pack.getPackageId());	
				System.out.println(pack.getPackageName());
				System.out.println(pack.getPackageType());	
				System.out.println(pack.getPackageDescription());
				System.out.println(pack.getPackageCost());
			}
			catch (PackageNotFoundException pe) {
				// TODO: handle exception
				System.out.println("ERROR:" +pe.getMessage());
			}
			catch (Exception exp) {
				// TODO: handle exception
				System.out.println(exp.getMessage());
			}
			break;
		
		case 2:
			try {
				System.out.println("Enter packageId to search");
				int packageId1=sc.nextInt();	
				pobj.setPackageId(packageId1);
				
				Package pack1=pse.searchPackage(packageId1);
				System.out.println(pack1.getPackageId());
				System.out.println(pack1.getPackageName());
				System.out.println(pack1.getPackageDescription());
				System.out.println(pack1.getPackageType());
				System.out.println(pack1.getPackageCost());
				System.out.println("The data retrived succesfully");
			}
			catch (PackageNotFoundException pne) {
				// TODO: handle exception
				System.out.println("ERROR:" +pne.getMessage());
			}
			catch (Exception exc) {
				// TODO: handle exception
				System.out.println(exc.getMessage());
			}
			break;
			
		case 3:
			try {
				System.out.println("Enter Package Id to delete:");
				int packageId2=sc.nextInt();
				pobj.setPackageId(packageId2);
				//packageId=packageId2;
				pse.deletePackage(packageId2);
				System.out.println("Record Deleted");
			}
			catch (PackageNotFoundException pnfe) {
				// TODO: handle exception
				System.out.println("ERROR:"+pnfe.getMessage());
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			break;
		case 4:
		
				List<Package> packList=pse.viewAllPackages();
				for (Package p: packList) {
					System.out.println(p);		
				}
				break;
		}
		}
		finally {
			// TODO: handle finally clause
			System.out.println();
		}
		
		sc.close();
	}
}
