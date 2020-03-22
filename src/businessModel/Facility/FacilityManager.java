package businessModel.Facility;
import java.util.*;

public class FacilityManager{ 
  private ArrayList<Facility> facilities;
  
  public FacilityManager() {
	  facilities = new ArrayList<Facility>(); //first thing we'll need to have. it contains all the facilities 
	  
  }

 public ArrayList<Facility> listFacilities(){ //accessor method for Facilities arraylist
	 return facilities;
 }

 public void addNewFacility(Facility f) {
	 facilities.add(f);
	// System.out.println("Added successfully"); moving to client
 }
 public void removeFacility(Facility f) {
	 facilities.remove(f);	 
	 //System.out.println("Removed successfully"); also moving to client
 }
 


}