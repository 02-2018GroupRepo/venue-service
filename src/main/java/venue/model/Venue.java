package venue.model;

public class Venue {

    private final long id;
    private final String venueName;
    private final String address;
    private final boolean parking;
    private final int eventId;
    private final int capacity;

    public Venue(long id, String venueName, String address, boolean parking, int eventId, int capacity) {
    	this.id = id;
    	this.venueName = venueName;
        this.address = address;
        this.parking = parking;
        this.eventId = eventId;
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
    
    public int getEventId() {
        return eventId;
    }
    
    public int getCapacity() {
        return capacity;
    }
}
