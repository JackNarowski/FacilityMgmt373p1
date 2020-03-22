package businessModel.Facility;

import businessModel.Maintenance.MaintenanceManager;
import businessModel.Maintenance.ProblemManager;


public interface Facility {
       
        
        public void setId(int id);
        public int getFacilityInformation();
        public void setDescription(String d);
        public String getDescription();
    	public MaintenanceManager getMaintManag();
    	public ProblemManager getProbManag();
    	
    	}
   
        
        
        
        
