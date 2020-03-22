package businessModel.Use;
//import businessModel.Maintenance.Schedule; use this to use schedule in ur class

public class Use {
    public int id;
    public UseSchedule s;

    public Use(int id){ //setting id in constructor
        this.id = id;

    }//setId

    public int getUseId() {
        return id;

    }//getId

    public void UseSchedule(int startTime, int endTime, String use) {
        s = new UseSchedule(startTime, endTime, use);
    }
    public String getSchedule() {
        return "Request " + id + "With use " + s.getUse() +" is scheduled from " + s.getUseStartTime() + " to " + s.getUseEndTime();
    }
    public int getStartTime(){
        return s.getUseStartTime();
    }
    public int getEndTime(){
        return s.getUseEndTime();
    }


}