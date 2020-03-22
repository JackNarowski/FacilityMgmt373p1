package businessModel.Facility;
//import java.util.*;

public class FacilityFactory{
	static Facility f;
	
	public static Facility addNewFacility(int id) {
		f = new GenericFacility();
		f.setId(id);
		return f;
	}
	
    public static Facility addNewFacilityDetail(int id, String desc){
    	//here we're going to have an ability for flexability if more facility types are added
    	f = new GenericFacility();
    	f.setId(id);
    	f.setDescription(desc);
    	return f;
    }
    

}