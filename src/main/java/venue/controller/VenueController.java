package venue.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
    @GetMapping("/venue/{name}")
    public Venue venue(@PathVariable(name="name") String venueName) {
    	return venueService.getVenueByName(venueName);
    }
    
    @PostMapping("/venue")
    public String createVenue(@RequestBody Venue newVenue) {
    	venueService.addVenue(newVenue);
    	return "You have created a new venue!";
    }
    
    @PutMapping("/venue/{name}")
    public String updateVenue(@PathVariable(name = "name") String venueName, @RequestBody Venue updatedVenue) {
    	venueService.updateVenue(venueName, updatedVenue);
    	return "You have updated venue : " + venueName;
    }
    
    @DeleteMapping("/venue/{name}")
    public String deleteVenue(@PathVariable(name="name") String venueName) {
    	venueService.deleteVenue(venueName);
    	return "You have deleted venue: " + venueName;
    }
}
