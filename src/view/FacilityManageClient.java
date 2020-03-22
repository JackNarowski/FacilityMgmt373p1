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
		
		System.out.println("_________________________________________________________________________________________________\n");
		//printing out inspections requested 
		
		Inspection i1 = new Inspection(1);
	
		fac1.getMaintManag().addNewInspection(i1);
		
		System.out.println("Inspection requested");
		System.out.println("Inspection ID: " + i1.getInspectionId());
		
		Inspection i2 = new Inspection(2);
		
		fac1.getMaintManag().addNewInspection(i2);
		System.out.println(" ");
		System.out.println("Inspection requested");
		System.out.println("Inspection ID: " + i2.getInspectionId());
		System.out.println(" ");
		
		//printing out problem requested 
		
		Problem p1 = new Problem("pipe in facility 1 had broken");
		fac1.getProbManag().addProblem(p1);
		System.out.println("Problem detected: " + p1.getProbDesc());
		
		//printing out request to fix 
		System.out.println("_________________________________________________________________________________________________\n");
		Requests r1 = new Requests(1);
		r1.scheduleMaintenance(1200, 1300);
		fac1.getMaintManag().makeFacilityMaintRequest(r1);
		System.out.println("Maintenance request created: ");
		System.out.println("Request ID: " + r1.getRequestId());
		System.out.println(r1.getSchedule());
		System.out.println("Downtime requested: " + r1.calcDownTimeForFacility() + " minutes");
		System.out.println(" ");
		System.out.println("Problems: ");
		fac1.getProbManag().listFacilityProblems();
		System.out.println(" ");

		System.out.println("Cost for facility " + fac1.getFacilityInformation() + ": $" + fac1.getProbManag().calcMaintenanceCostForFacility());
		
		System.out.println(" ");
		System.out.println("_________________________________________________________________________________________________\n");
		
		Use u1 = new Use(23451);
		u1.UseSchedule(1400, 1500, "23451");
		UseManager umang = new UseManager();
		umang.addNewUse(u1);
		umang.setCapacity(100);
		
		System.out.println(" ");
		System.out.println("Use facility for event: " + u1.getUseId());
		System.out.println("From " + u1.getSchedule());
		System.out.println("Capacity at: " + umang.requestAvailableCapacity() + " people");
		
		
		//I'm basing this off of the client from the Bookstore Lab we did before.
		
    	
    	
    }
}
