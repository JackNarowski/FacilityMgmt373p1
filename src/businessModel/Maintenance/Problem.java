package businessModel.Maintenance;

public class Problem {
	String p = null;
	boolean problem;
	
	public Problem(String description){
		p = description;
		problem = true;
		
	}
	
	public String getProbDesc(){return p;}
	
	public String isResolved() {
		if(problem){
			return "No"; //if problem is true, return that its not solved
			
		}
		else {return "Yes";}
		
	}
	
	public void resolve(){
		problem = false;
	}
	

}
