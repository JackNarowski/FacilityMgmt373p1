import java.util.*;

public interface Facility {
        private String name;
        private Object info;
        private Object capcaity;

        public void addFacilityDetail();
        public Object getFacilityInformation();
        public Object requestAvailableCapacity();
}