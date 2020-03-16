package businessModel.Facility;
import java.util.*;

public class FacilityFactory{
    public Facility buildFacility(Facility f, String name){
    	f = new GenericFacility();
    	f.setName(name);
    	return f;
    }
    

}