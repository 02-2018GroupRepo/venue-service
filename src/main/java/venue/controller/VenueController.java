package venue.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import venue.model.Venue;
import venue.service.VenueService;

@RestController
public class VenueController {
	@Autowired
	VenueService venueService;
	
	@RequestMapping("/venues")
    public List<Venue> venues() {
    	return venueService.getVenues();
    }
	
    @GetMapping("/venue/{id}")
    public Venue venue(@PathVariable(name="id") int id) {
    	return venueService.getVenueById(id);
    }
    
    @PostMapping("/venue")
    public String createVenue(@RequestBody Venue venue) {
    	venueService.createVenue(venue);
    	return "You have created a new venue!";
    }
    
    @PutMapping("/venue/{id}")
    public String updateVenue(@PathVariable(name="id") int id, @RequestBody Venue venue) {
    	venueService.updateVenue(id, venue);
    	return "You have updated venue : " + id;
    }
    
    @DeleteMapping("/venue/{id}")
    public String deleteVenue(@PathVariable(name="id") int id) {
    	venueService.deleteVenue(id);
    	return "You have deleted venue: " + id;
    }
}
