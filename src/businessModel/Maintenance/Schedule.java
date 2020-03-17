package businessModel.Maintenance;

public class Schedule implements Maintenance {
    public Requests request;
    public Schedule schedule;

    public String getRequestName(){}
    public double timeStart(){}
    public double timeStop(){}
    
    
    public Schedule(int startTime, int endTime) {
    	if(validTime(startTime) & validTime(endTime)){}
    	
    
    } //constructor 
    	
    
    private boolean validTime(int time) {
    	boolean scheduleConfirmed;
    	
    	if((time > 2359) & (time < 0)) {
    		System.out.print("Time provided is out of bounds");
    		 scheduleConfirmed = false;
    	}//if  time is not a real time 
    	else {
    		scheduleConfirmed = true;
    	}
  
    	
    	
    	return scheduleConfirmed;
    	
    }
    
    
    
}
