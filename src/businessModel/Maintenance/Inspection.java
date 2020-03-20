package businessModel.Maintenance;

import java.util.*;
public class Inspection implements Maintenance {
	Schedule s;
	int id;
	//i moved inspection to be in maintenance model because that honestly made more sense. 
	//and then it can fit the maintenance format and we can have
	//an inspection AND a request manager
//also inspection is identical as request with the exception of changing the setter/getter names
	//also dont know what to do with maintenanceorder or scheduler yet lmfaooo
	
	public void setInspectionId(int id) {
		this.id = id;
		
	}
	
	public int getInspectionId() {return id;}
	
	@Override

	public void createSchedule(int startTime, int endTime) {
		
	    	s = new Schedule(startTime, endTime);    
		
	}

	@Override
	public Schedule getSchedule() {
		return s;
	}
    //

}