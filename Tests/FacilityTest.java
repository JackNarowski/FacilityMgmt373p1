import businessModel.Facility.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FacilityTest {

	@Test
	void testFacilityCreation() {
		Facility fac1 = FacilityFactory.addNewFacilityDetail(1);
		Facility fac2 = FacilityFactory.addNewFacilityDetail(2);
		
		assertEquals(1, fac1.getFacilityInformation());
		assertEquals(2, fac2.getFacilityInformation());
		
		//fail("Not yet implemented");
	}
	@Test
	void testFacilityManager() {
		FacilityManager fmanager = new FacilityManager();
		Facility fac1 = FacilityFactory.addNewFacilityDetail(1);
		Facility fac2 = FacilityFactory.addNewFacilityDetail(2);
		Facility fac3 = FacilityFactory.addNewFacilityDetail(3);

		
		fmanager.addNewFacility(fac1);
		fmanager.addNewFacility(fac2);
		fmanager.addNewFacility(fac3);
		
		//assertEquals("fac1, fac2, fac3, ", fmanager.listFacilities());
		assertEquals(Arrays.asList(fac1, fac2, fac3), fmanager.listFacilities());
		
		fmanager.removeFacility(fac2);
		
		assertEquals(Arrays.asList(fac1, fac3), fmanager.listFacilities());

			
		}
		
		
	}


