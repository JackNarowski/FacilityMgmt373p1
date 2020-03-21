package view;
import businessModel.Facility.*;
import businessModel.Maintenance.*;
import businessModel.Use.*;

public class FacilityManageClient {
    public static void main (String args[]) throws Exception{
    	FacilityManager fmanager = new FacilityManager();
    	
    	//FacilityFactory factory = new FacilityFactory();
    	
    	Facility fac1 = FacilityFactory.buildFacility(001);
    	fmanager.addNewFacility(fac1);
    	
    	System.out.print(fac1.getId() + " "); //it works! delete later
    	
    	Requests req1 = new Requests(001);
    	req1.createSchedule(1200, 1300); //request from 12 to 1pm
    	System.out.print(req1.getSchedule());
    	
    	
    }
}
