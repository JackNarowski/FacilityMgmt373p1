package businessModel.Maintenance;

public class Requests implements Maintenance {
    public int id;
    public Schedule s;
    public int FacId;

    public Requests(int id, int FacId){ //setting id in constructor
    	this.id = id;
    	
    }//setId
    
    public int getRequestId() {
    	return id;
    	
    }//getId
    
    public int calcMaintenanceCostForFacility(){
    	
    } 
    
    public void scheduleMaintenance(int startTime, int endTime) {
    	s = new Schedule(startTime, endTime);
    }
    public String getSchedule() {
    	return "Request " + id + " is scheduled from " + s.getStartTime() + " to " + s.getEndTime();
    } 
    
}
