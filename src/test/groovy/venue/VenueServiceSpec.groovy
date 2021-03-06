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
		Venue venue = new Venue(1, "Terminal West", "123 West Elm Street", true, 1, 800);
		
		when: "You request a venue"
		venueDao.getVenueById(1) >> venue;
		venueService.venueDao = venueDao;
		Venue retreivedVenue = venueService.getVenueById(1);
		
		then: "Venue is returned"
		retreivedVenue.equals(venue);
	}
	
	def "Get all venues"() {
		given: "Venue service"
		VenueService venueService = new VenueService();
		and: "Venue dao"
		VenueDao venueDao = Stub(VenueDao.class);
		and: "ArrayList of venues"
		Venue venue1 = new Venue(1, "Terminal West", "123 West Elm Street", true, 1, 800);
		Venue venue2 = new Venue(2, "Masquerade", "123 Peachtree Street", true, 2, 300);
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
