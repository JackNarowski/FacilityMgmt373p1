package businessModel.Maintenance;

import java.util.ArrayList;

public class ProblemManager {
	ArrayList<Problem> allProblems;
	
	public ProblemManager(){
		allProblems = new ArrayList<Problem>();
		
	}
	
	public void addProblem(Problem p) {allProblems.add(p);}
	public void removeProblem(Problem p){allProblems.remove(p);}
	
	public void listFacilityProblems(){
		for(Problem p: allProblems){
			System.out.println("Problem description: " + p.getProbDesc() + ". Resolved: " + p.isResolved());
		}
	}
	public int calcProblemRateForFacility(){
		return allProblems.size();
	
	}
	
    public int calcMaintenanceCostForFacility(){
    	return calcProblemRateForFacility() * 300;
    	
    }

}
