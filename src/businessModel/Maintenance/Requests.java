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
    
    public void createSchedule(int startTime, int endTime) {
    	s = new Schedule(startTime, endTime);
    }
    public Schedule getSchedule() {
    	return s;
    } 
    
}
