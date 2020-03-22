package businessModel.Facility;

//import businessModel.*;


public interface Facility {
       /* String name;
        Object info;
        Maintenance m;
        Inspection i;
        Use use; */
        
        public void setId(int id);
        public int getFacilityInformation();
        public void setDescription(String d);
        public String getDescription();
        
        //public void setRequestList(RequestList<Requests> r); //might add this in and then put requests and schedule into it 
    // TODO i cant get this to work lol
        
        
        
        
}