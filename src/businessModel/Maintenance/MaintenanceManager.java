package businessModel.Maintenance;

import java.util.ArrayList;


public class MaintenanceManager{ 
	  private ArrayList<Requests> requests;
	  private ArrayList<Inspection> inspections;
	  
	  public MaintenanceManager() {
		  requests = new ArrayList<Requests>(); //first thing we'll need to have. it contains all the facilities 
		  inspections = new ArrayList<Inspection>();
	  }

	 public ArrayList<Requests> listMaintRequests(){ //accessor method for Facilities arraylist
	     return requests;
	 }
	 public ArrayList<Inspection> listInspections(){
		return inspections;
		}
	 
	 public void listMaintenance() {
		 System.out.println("Requests: ");
		 for(Requests r:requests){
			 System.out.print(r + ", ");
		 }
		 System.out.println("\n Inspections: ");
		 
		 for(Inspection i: inspections) {
			 System.out.print(i + ", ");
		 }
	 }

	 public void makeFacilityMaintRequest(Requests r) {
		 requests.add(r);
		// System.out.println("Added successfully"); moving to client
	 }
	 
	 public void removeRequest(Requests r) {
		 requests.remove(r);	 
		 //System.out.println("Removed successfully"); also moving to client
	 }
	 
	 public void addNewInspection(Inspection i){inspections.add(i);}

	 public void removeRequest(Inspection i){inspections.remove(i);}

	}
