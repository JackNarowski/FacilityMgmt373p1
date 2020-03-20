package businessModel.Facility;
//import java.util.*;

public class FacilityFactory{
    public Facility buildFacility(Facility f, int id){
    	f = new GenericFacility();
    	f.setId(id);
    	return f;
    }
    

}