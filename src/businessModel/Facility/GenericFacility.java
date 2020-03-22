package businessModel.Facility;
//import java.util.*;
//made a factory method with only one facility type so that we can implement more types of facilities later if needed


public class GenericFacility implements Facility{
	int id;
	String d = "No description provided";

	@Override
	public void setId(int i) {
		id = i;
	}

	@Override
	public int getFacilityInformation() {
		return id;
	}

	@Override
	public void setDescription(String d) {
		this.d = d;
		
	}

	@Override
	public String getDescription() {
		return d;
	}

	}