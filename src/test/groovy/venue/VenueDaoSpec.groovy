package venue

import spock.lang.Specification
import venue.dao.VenueDao
import venue.model.Venue

class VenueDaoSpec extends Specification {
	def "Get venue"() {
		given: "Venue dao"
		VenueDao venueDao = new VenueDao();
		
		and: "Venue"
		Venue venue = new Venue(4, "Verizon Wireless Amphitheater", "123 Blep Street", true, "Deadmau5", 1200);
		venueDao.venues.add(venue);
		
		when: "You request a venue"
		Venue retreivedVenue = venueDao.getVenueByName("Verizon Wireless Amphitheater")
		
		then: "Venue is returned"
		retreivedVenue.equals(venue);
	}
	
	def "Get venues"() {
		given: "Venue dao"
		VenueDao venueDao = new VenueDao();
		
		and: "Venue"
		Venue venue1 = new Venue(4, "Verizon Wireless Amphitheater", "123 Blep Street", true, "Deadmau5", 1200);
		Venue venue2 = new Venue(5, "Centennial Olympic Park", "123 Olympic Avenue", true, "Pink Floyd", 1200);
		ArrayList<Venue> venueList = new ArrayList<Venue>();
		venueList.add(venue1);
		venueList.add(venue2);
		venueDao.venues = venueList;
		
		when: "You request a venue"
		ArrayList<Venue> retreivedVenueList = venueDao.getVenues();
		
		then: "Venue is returned"
		retreivedVenueList.equals(venueList);
	}
}
