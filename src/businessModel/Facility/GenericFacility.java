package businessModel.Facility;
//made a factory method with only one facility type so that we can implement more types of facilities later if needed


public class GenericFacility implements Facility{
	String name = "Error: no name provided"; 

	@Override
	public void setName(String n) {
		// TODO Auto-generated method stub
		name = n;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
