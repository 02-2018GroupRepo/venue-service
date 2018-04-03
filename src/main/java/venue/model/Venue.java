package venue.model;

public class Venue {

    private int id;
    private String venueName;
    private String address;
    private boolean parking;
    private int eventId;
    private int capacity;
    
    public Venue() {}
    
    public Venue(int id, String venueName, String address, boolean parking, int eventId, int capacity) {
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

	public void setId(int id) {
		this.id = id;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
