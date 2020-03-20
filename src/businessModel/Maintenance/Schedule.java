package businessModel.Maintenance;

public class Schedule{
    public Requests request;
    public Schedule schedule;
    public int startTime;
    public int endTime;
    
    public Schedule(int startTime, int endTime) {
    	if(validTime(startTime) & validTime(endTime)){
    		this.startTime = startTime;
    		this.endTime = endTime;
    		
    	} // TODO idk what we're gonna do here
    
    
    } //constructor 
    	
    public int getStartTime() {return startTime;}
    public int getEndTime() {return endTime;}
    
    private boolean validTime(int time) {
    	boolean scheduleConfirmed;
    	
    	if((time > 2359) | (time < 0)) {
    		System.out.print("Time provided is out of bounds");
    		 scheduleConfirmed = false;
    	}//if  time is not a real time 
    	else {
    		scheduleConfirmed = true;
    	}
  
    	
    	
    	return scheduleConfirmed;
    	
    }
    
    
    
}
