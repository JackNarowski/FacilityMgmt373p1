package businessModel.Facility;
import java.util.*;

public class FacilityManager{
  private ArrayList<Facility> facilities;

 public ArrayList<Facility> listFacilities(){ //accessor method for Facilities arraylist
     return facilities;
 }

 public void addNewFacility(Facility f) {
	 facilities.add(f);
	 System.out.println("Added successfully");
 }
 public void removeFacility(Facility f) {
	 facilities.remove(f);	 
 }
 


}