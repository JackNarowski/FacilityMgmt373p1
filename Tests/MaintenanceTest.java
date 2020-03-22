import businessModel.Facility.Facility;
import businessModel.Facility.FacilityFactory;
import businessModel.Maintenance.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class MaintenanceTest {
		
	@Test
    void makeRequest(){
        //Setup

    	Facility fac1 = FacilityFactory.addNewFacility(1);
    	Requests req1 = new Requests(1);
		fac1.getMaintManag().makeFacilityMaintRequest(req1); 
        assertEquals(1, req1.getRequestId());
        req1.scheduleMaintenance(1200, 1300);
        
        assertEquals("Request 1 is scheduled from 1200 to 1300", req1.getSchedule());
		assertEquals(25, req1.calcDownTimeForFacility());
        
        //makeFacilityMainRequest(Request r);
        //Test output
    }
	
	@Test
	void makeInspection() {
		Facility fac1 = FacilityFactory.addNewFacility(1);
		Inspection i = new Inspection(2);
		fac1.getMaintManag().addNewInspection(i);
		i.scheduleMaintenance(1200, 1300);
		
		
		assertEquals(2, i.getInspectionId());		
		
		assertEquals("Request 2 is scheduled from 1200 to 1300", i.getSchedule());

		
		
	}
	
	@Test
	void maintManagerTest(){
		Facility fac1 = FacilityFactory.addNewFacility(1);
		
		//test request array 
		
		Requests r1 = new Requests(1);
		Requests r2 = new Requests(2); 
		Requests r3 = new Requests(3);
		fac1.getMaintManag().makeFacilityMaintRequest(r1);
		fac1.getMaintManag().makeFacilityMaintRequest(r2);
		fac1.getMaintManag().makeFacilityMaintRequest(r3);
		
		assertEquals(Arrays.asList(r1,r2,r3), fac1.getMaintManag().listMaintRequests());
		
		fac1.getMaintManag().removeRequest(r3);
		assertEquals(Arrays.asList(r1,r2), fac1.getMaintManag().listMaintRequests());

		//test inspection array
		
		Inspection i1 = new Inspection(1);
		Inspection i2 = new Inspection(2);
		Inspection i3 = new Inspection(3);
		
		fac1.getMaintManag().addNewInspection(i1);
		fac1.getMaintManag().addNewInspection(i2);
		fac1.getMaintManag().addNewInspection(i3);
		
		assertEquals(Arrays.asList(i1,i2,i3), fac1.getMaintManag().listInspections());
		
		fac1.getMaintManag().removeRequest(i2);
		
		assertEquals(Arrays.asList(i1,i3), fac1.getMaintManag().listInspections());

		
		
	}
	
	
	@Test
	void createProblem(){
		Problem p = new Problem("pipe broke");
		assertEquals("pipe broke", p.getProbDesc());
		assertEquals("No", p.isResolved());
		p.resolve();
		assertEquals("Yes", p.isResolved());
		
		
		
	}
	
	@Test
	void probManagTest(){
		Facility fac1 = FacilityFactory.addNewFacility(1);
		Problem p = new Problem("pipe broke");
		Problem p2 = new Problem("boiler broke");

		fac1.getProbManag().addProblem(p);
		fac1.getProbManag().addProblem(p2);
		
		assertEquals(2, fac1.getProbManag().calcProblemRateForFacility());
		assertEquals(600, fac1.getProbManag().calcMaintenanceCostForFacility());
		
		
		
		
	}
	
	@Test
	void testSchedule(){
		Schedule s = new Schedule(1200, 1430);
		assertEquals(1200, s.getStartTime());
		assertEquals(1430, s.getEndTime());
		
		try {
			fail("Time provided is out of bounds");
		}catch(Exception e) {
			Schedule s2 = new Schedule(2300, 2500);
			
		}//this test is SUPPOSED to fail
		
		}
	

	
	
	
	

}
