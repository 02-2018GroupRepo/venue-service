package venue.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import venue.dao.VenueDao;
import venue.model.Venue;

@RestController
public class VenueController {
	@Autowired
	private VenueDao venueDao;
	
	@RequestMapping("/venues")
    public ArrayList<Venue> venues() {
    	return venueDao.getVenues();
    }
	
    @RequestMapping("/venue")
    public Venue venue(@RequestParam(value="name", required=true) String venueName) {
    	return (Venue) venueDao.getVenueByName(venueName);
    }
}
