package venue

import java.util.concurrent.atomic.AtomicLong
import spock.lang.Specification
import venue.model.Venue

class VenueSpec extends Specification {
	private final long id = 1;
	def "Venue information"() {
		given: "A venue"
		Venue venue = new Venue(id, "Terminal West", "123 West Elm Street", true, "Cirque du Soleil", 800);
		
		when: "Information is requested"
		long venueId = venue.getId();
		String venueName = venue.getVenueName();
		String address = venue.getAddress();
		boolean parking = venue.getParking();
		String event = venue.getEvent();
		int capacity = venue.getCapacity();
		
		then: "Information should match original values"
		venueId == 1;
		venueName.equalsIgnoreCase("Terminal West");
		address.equalsIgnoreCase("123 West Elm Street");
		parking == true;
		event.equalsIgnoreCase("Cirque du Soleil");
		capacity == 800;
	}
}
