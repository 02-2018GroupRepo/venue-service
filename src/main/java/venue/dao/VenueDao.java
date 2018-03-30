package venue.dao;

import org.springframework.stereotype.Component;
import venue.model.Venue;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

@Component
public class VenueDao {
	private ArrayList<Venue> venues = new ArrayList<Venue>();
	
//	@PostConstruct
//	public void init() {
//		Venue terminalWest = new Venue(1, "Terminal West", "123 West Elm Street", true, 1, 800);
//		Venue masquerade = new Venue(2, "Masquerade", "123 Peachtree Street", true, 2, 300);
//		Venue phillipsArena = new Venue(3, "Phillips Arena", "123 Phillips Drive", false, 3, 21000);
//		venues.add(terminalWest);
//		venues.add(masquerade);
//		venues.add(phillipsArena);
//	}
	
	public VenueDao() {
		Venue terminalWest = new Venue(1, "Terminal West", "123 West Elm Street", true, 1, 800);
		Venue masquerade = new Venue(2, "Masquerade", "123 Peachtree Street", true, 2, 300);
		Venue phillipsArena = new Venue(3, "Phillips Arena", "123 Phillips Drive", false, 3, 21000);
		venues.add(terminalWest);
		venues.add(masquerade);
		venues.add(phillipsArena);
	}
	
	public ArrayList<Venue> getVenues() {
		return venues;
	}
	
	public Venue getVenueByName(String name) {
		Venue retrievedVenue = null;
		for (Venue venue: venues) {
			if (venue.getVenueName().equalsIgnoreCase(name) ) {
				retrievedVenue = venue;
			}
		}
		return retrievedVenue;
	}
	
	public void addVenue(Venue newVenue) {
		venues.add(newVenue);
	}
}
