package businessModel.Facility;
//import java.util.*;

public class FacilityFactory{
	static Facility f;
    public static Facility addNewFacilityDetail(int id){
    	//here we're going to have an ability for flexability if more facility types are added
    	f = new GenericFacility();
    	f.setId(id);
    	return f;
    }
    

}