package businessModel.Facility;
//made a factory method with only one facility type so that we can implement more types of facilities later if needed


public class GenericFacility implements Facility{
	String name = "Error: no name provided"; 

	@Override
	public void setName(String n) {
		name = n;
	}

	@Override
	public String getName() {
		return name;
	}

}
