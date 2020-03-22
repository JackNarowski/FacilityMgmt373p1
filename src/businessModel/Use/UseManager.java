package businessModel.Use;

import java.util.ArrayList;

public class UseManager{
    private ArrayList<Use> Uses;
    public int capcaity;


    private void vacateFacility(){capcaity = 0;}
    public void setCapacity(int c) {capcaity = c;}
    public int requestAvailableCapacity(){return capcaity;}

    public UseManager() {
        Uses = new ArrayList<Use>();
    }

    public void assignFacilityToUse() {
        UseSchedule( int startTime, int endTime, String Use);
    }

    public boolean isInUseDuringInterval(int startTime, int endTime){
        for (Use use : Uses) {
            if (use.getStartTime < startTime && use.getEndTime > startTime)
                return true;
            if (use.getStartTime>startTime && use.getStartTime < endTime)
                return true;
            else return false;
        }
    }

    public double calcUsageRate(){
        totaltime = 0;
        for (Use use : Uses) {
            usetime = use.getEndTime - use.getStartTime;
            totaltime += usetime;
        }
    }

}