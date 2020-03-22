package businessModel.Maintenance;

import java.util.*;
public class Inspection implements Maintenance {
	Schedule s;
	int id;
	//i moved inspection to be in maintenance model because that honestly made more sense. 
	//and then it can fit the maintenance format and we can have
	//an inspection AND a request manager
//also inspection is identical as request with the exception of changing the setter/getter names
	
	public Inspection(int id) {
		this.id = id;
		
	}
	
	public int getInspectionId() {return id;}
	
	@Override

	public void scheduleMaintenance(int startTime, int endTime) {
		
	    	s = new Schedule(startTime, endTime);    
		
	}

	@Override
	public String getSchedule() {
    	return "Request " + id + " is scheduled from " + s.getStartTime() + " to " + s.getEndTime();
	}
    //

}