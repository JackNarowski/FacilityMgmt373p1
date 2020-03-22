package businessModel.Maintenance;

public class Requests implements Maintenance {
    public int id;
    public Schedule s;

    public Requests(int id){ //setting id in constructor
    	this.id = id;
    	
    }//setId
    
    public int getRequestId() {
    	return id;
    	
    }//getId
    

    
    public void scheduleMaintenance(int startTime, int endTime) {
    	s = new Schedule(startTime, endTime);
    }
    public String getSchedule() {
    	return "Request " + id + " is scheduled from " + s.getStartTime() + " to " + s.getEndTime();
    } 
    
    public int calcDownTimeForFacility() {
    	return (s.getEndTime() - s.getStartTime()) / 4;
    }
    
}
