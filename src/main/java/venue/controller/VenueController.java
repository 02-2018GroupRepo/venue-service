package venue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import venue.model.Venue;

@RestController
public class VenueController {
	
	private final Venue terminalWest = new Venue(1, "Terminal West", "123 West Elm Street", true, "Cirque du Soleil", 800);

    @RequestMapping("/venue")
    public Venue venue(@RequestParam(value="name", defaultValue="Please insert venue name") String venueName) {
        return terminalWest;
    }
}
