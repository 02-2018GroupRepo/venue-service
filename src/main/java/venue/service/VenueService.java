package venue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import venue.dao.VenueDao;
import venue.model.Venue;

@Component
public class VenueService {
	@Autowired
	private VenueDao venueDao;
	
	public List<Venue> getVenues() {
		return venueDao.getVenues();
	}
	
	public Venue getVenueById(int id) {
		return venueDao.getVenueById(id);
	}
	
	public void createVenue(Venue venue) {
		venueDao.createVenue(venue);
	}
	
	public void updateVenue(int id, Venue venue) {
		venueDao.updateVenue(id, venue);
	}
	
	public void deleteVenue(int id) {
		venueDao.deleteVenue(id);
	}
}
