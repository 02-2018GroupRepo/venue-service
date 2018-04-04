package venue

import java.util.concurrent.atomic.AtomicLong
import spock.lang.Specification
import venue.model.Venue

class VenueModelSpec extends Specification {
	def "Venue information"() {
		given: "A venue"
		Venue venue = new Venue(1, "Terminal West", "123 West Elm Street", true, 1, 800);
		
		when: "Information is requested"
		int venueId = venue.getId();
		String venueName = venue.getVenueName();
		String address = venue.getAddress();
		boolean parking = venue.isParking();
		int eventId = venue.getEventId();
		int capacity = venue.getCapacity();
		
		then: "Information should match original values"
		venueId == 1;
		venueName.equalsIgnoreCase("Terminal West");
		address.equalsIgnoreCase("123 West Elm Street");
		parking == true;
		eventId == 1;
		capacity == 800;
	}
}
