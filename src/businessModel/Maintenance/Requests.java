package businessModel.Maintenance;

public class Requests implements Maintenance {
    public int id;
    public Schedule s;

    public void setRequestId(int id){
    	this.id = id;
    	
    }//setId
    
    private int getRequestId() {
    	return id;
    	
    }//getId
    
    public boolean setSchedule(int startTime, int endTime) {
    	boolean scheduleConfirmed = false;
    	
    	if((startTime > 2359) & (startTime < 0)) {
    		System.out.print("Time provided is out of bounds");
    		return scheduleConfirmed = false;
    	}//if start time is not a real time 
    	if((endTime > 2359) & (endTime < 0)) {
    		System.out.print("Time provided is out of bounds");
    		return scheduleConfirmed = false;
    	}//if end time not a real time
    	
    	
    	
    	return scheduleConfirmed;
    	
    }
    
}
