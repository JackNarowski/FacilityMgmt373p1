package businessModel.Use;

import java.util.ArrayList;

public class UseSchedule{
    public UseSchedule useschedule;
    public int startTime;
    public int endTime;
    public String use;

    public UseSchedule(int startTime, int endTime, String use) {
        if(validTime(startTime) & validTime(endTime)){
            this.startTime = startTime;
            this.endTime = endTime;
            this.use = use;
        }
    } //constructor

    public int getUseStartTime() {return startTime;}
    public int getUseEndTime() {return endTime;}
    public String getUse() {return use;}

    private boolean validUseTime(int time) {
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