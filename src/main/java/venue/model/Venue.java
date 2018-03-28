package venue.model;

public class Venue {

    private final long id;
    private final String venueName;
    private final String address;
    private final boolean parking;
    private final String event;
    private final int capacity;

    public Venue(long id, String venueName, String address, boolean parking, String event, int capacity) {
    	this.id = id;
    	this.venueName = venueName;
        this.address = address;
        this.parking = parking;
        this.event = event;
        this.capacity = capacity;
    }

    public long getId() {
        return id;
    }
    
    public String getVenueName() {
    	return venueName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public boolean getParking() {
        return parking;
    }
    
    public String getEvent() {
        return event;
    }
    
    public int getCapacity() {
        return capacity;
    }
}
