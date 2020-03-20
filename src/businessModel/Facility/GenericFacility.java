package businessModel.Facility;
//import java.util.*;
//made a factory method with only one facility type so that we can implement more types of facilities later if needed


public class GenericFacility implements Facility{
	int id;

	@Override
	public void setId(int i) {
		id = i;
	}

	@Override
	public int getId() {
		return id;
	}

	}