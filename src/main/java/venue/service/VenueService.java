package venue.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import venue.dao.VenueDao;
import venue.model.Venue;

@Component
public class VenueService {
	@Autowired
	private VenueDao venueDao;
	
	public ArrayList<Venue> getVenues() {
		return venueDao.getVenues();
	}
	
	public Venue getVenueByName(String name) {
		return venueDao.getVenueByName(name);
	}
	
	public void addVenue(Venue newVenue) {
		venueDao.addVenue(newVenue);
	}
	
	public void updateVenue(String venueName, Venue updatedVenue) {
		venueDao.updateVenue(venueName, updatedVenue);
	}
	
	public void deleteVenue(String venueName) {
		venueDao.deleteVenue(venueName);
	}
}
