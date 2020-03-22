package businessModel.Facility;
import businessModel.Maintenance.*;
import businessModel.Use.*;
//import java.util.*;
//made a factory method with only one facility type so that we can implement more types of facilities later if needed


public class GenericFacility implements Facility{
	int id;
	String d = "No description provided";
	MaintenanceManager mmang;
	ProblemManager pmang;
	UseManager umang;
	public GenericFacility(){ //setting a way to store all the facility's requests, inspections, problems, use, etc
		mmang = new MaintenanceManager();
		pmang = new ProblemManager();
		umang = new UseManager();
	}

	@Override
	public void setId(int i) {
		id = i;
	}

	@Override
	public int getFacilityInformation() {
		return id;
	}

	@Override
	public void setDescription(String d) {
		this.d = d;
		
	}

	@Override
	public String getDescription() {
		return d;
	}
	
	public MaintenanceManager getMaintManag(){
		return mmang;
	}
	
	public ProblemManager getProbManag(){
		return pmang;
	}

	public UseManager getUmang() { return umang; }
}