package venue.model;

public class Event {
	private int id;
    private String eventName;
    private String description;
    private String date;
    private double duration;
    private int venueId;
    
    public Event() {
    	
    }
    
	public Event(int id, String eventName, String description, String date, double duration, int venueId) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.description = description;
		this.date = date;
		this.duration = duration;
		this.venueId = venueId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
}
