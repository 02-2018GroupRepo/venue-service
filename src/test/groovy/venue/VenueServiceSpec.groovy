package venue

import spock.lang.Specification
import venue.dao.VenueDao
import venue.model.Venue
import venue.service.VenueService

class VenueServiceSpec extends Specification {
	def "Get venue"() {
		given: "Venue service"
		VenueService venueService = new VenueService();
		and: "Venue dao"
		VenueDao venueDao = Stub(VenueDao.class);
		and: "Venue"
		Venue venue = new Venue(1, "Terminal West", "123 West Elm Street", true, "Cirque du Soleil", 800);
		
		when: "You request a venue"
		venueDao.getVenueByName("Terminal West") >> venue;
		venueService.venueDao = venueDao;
		Venue retreivedVenue = venueService.getVenueByName("Terminal West");
		
		then: "Venue is returned"
		retreivedVenue.equals(venue);
	}
	
	def "Get all venues"() {
		given: "Venue service"
		VenueService venueService = new VenueService();
		and: "Venue dao"
		VenueDao venueDao = Stub(VenueDao.class);
		and: "ArrayList of venues"
		Venue venue1 = new Venue(1, "Terminal West", "123 West Elm Street", true, "Cirque du Soleil", 800);
		Venue venue2 = new Venue(2, "Masquerade", "123 Peachtree Street", true, "Slim Shady", 300);
		ArrayList<Venue> venueList = new ArrayList<Venue>();
		venueList.add(venue1);
		venueList.add(venue2);
		
		when: "You request a venue"
		venueDao.getVenues() >> venueList;
		venueService.venueDao = venueDao;
		ArrayList<Venue> retreivedVenueList = venueService.getVenues();
		
		then: "Venue is returned"
		retreivedVenueList.equals(venueList);
	}
}
