import businessModel.Facility.Facility;
import businessModel.Facility.FacilityFactory;
import businessModel.Maintenance.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class MaintenanceTest {
	@Test
    void makeFacilityMainRequestTest(){
        //Setup

    	Facility fac1 = FacilityFactory.addNewFacility(1);
    	Requests req1 = new Requests(1);
		fac1.getMaintManag().makeFacilityMaintRequest(req1);
        assertEquals(1, req1.getRequestId());
		//makeFacilityMainRequest(Request r);
        //Test output
    }
   
}
