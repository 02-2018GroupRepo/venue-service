package venue.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import venue.model.Venue;
import venue.service.VenueService;

@RestController
public class VenueController {
	@Autowired
	VenueService venueService;
	
	@RequestMapping("/venues")
    public ArrayList<Venue> venues() {
    	return venueService.getVenues();
    }
	
    @RequestMapping("/venue")
    public Venue venue(@RequestParam(value="name", required=true) String venueName) {
    	return (Venue) venueService.getVenueByName(venueName);
    }
}
