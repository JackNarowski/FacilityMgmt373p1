package dal;
import java.util.*;
import businessModel.Facility.*;
public interface FacilityDAO{
	 public ArrayList<Facility> listFacilities();

	 public void addNewFacility(Facility f);
	 public void removeFacility(Facility f);
	 
}