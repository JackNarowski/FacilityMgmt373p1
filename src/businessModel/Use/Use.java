package businessModel.Use;

public class Use {

    //Facility User
    public int capcaity; //how many people can be inside the facility at once
    public Object UseSchedule;

    private void vacateFacility(){capcaity = 0;}
    public void setCapacity(int c) {capcaity = c;}
    public Object calcUsageRate(){ 
    	// TODO what kind of formula to make?
    	
    }
    public int requestAvailableCapacity(){return capcaity;}
    public void addFacilityDetail(){
    	
    	// TODO what kind of information to add in detail??
    }
    public Object getFacilityInformation(){
    	// TODO might move this to the Facility class 
    }
    //UseSchedule Subclass

}