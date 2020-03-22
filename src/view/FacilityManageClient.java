package view;
import businessModel.Facility.*;
import businessModel.Maintenance.*;
import businessModel.Use.*;

public class FacilityManageClient {
    public static void main (String args[]) throws Exception{
    	FacilityManager fmanager = new FacilityManager();
    	
    	Facility fac1 = FacilityFactory.addNewFacility(1);
    	fmanager.addNewFacility(fac1);
		Facility fac2 = FacilityFactory.addNewFacilityDetail(2, "A storage facility");
		fmanager.addNewFacility(fac2);
		
		
		
		/* PRINTING OUT A CLIENT*/
		System.out.println("Here are the facilities we have available:");
		for(Facility f: fmanager.listFacilities()){
			System.out.println(f.getFacilityInformation() + " "+ f.getDescription() + ", ");
			
		}
		
		//I'm basing this off of the client from the Bookstore Lab we did before.
		
    	
    	
    }
}
