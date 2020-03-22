package businessModel.Use;

public class Use {

    //Facility User
    public int capcaity; //how many people can be inside the facility at once

    public void assignFacilityToUse() {
        UseSchedule( int startTime, int endTime, String Use);
    }

    private void vacateFacility(){capcaity = 0;}
    public void setCapacity(int c) {capcaity = c;}
    public int requestAvailableCapacity(){return capcaity;}

    public boolean isInUseDuringInterval(int startTime, int endTime){

    }

    public double calcUsageRate(){
    	
    }



}