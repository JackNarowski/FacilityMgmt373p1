package dal;
import businessModel.Facility.*;
public interface FacilityDAO{
	 

	 public void addNewFacility(Facility f);
	 public void removeFacility(Facility f);
	 public void getFacility(int id);
	 
}