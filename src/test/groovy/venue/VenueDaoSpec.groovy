package venue

import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import spock.lang.Specification
import venue.dao.VenueDao
import venue.model.Venue

class VenueDaoSpec extends Specification {
//	def "Get venue"() {
//		given: "Venue dao"
//		VenueDao venueDao = new VenueDao();
//		
//		and: "Venue"
//		Venue venue = new Venue(4, "Verizon Wireless Amphitheater", "123 Blep Street", true, 1, 1200);
//		ArrayList<Venue> venueList = new ArrayList<Venue>();
//		venueList.add(venue);
//		JdbcTemplate jdbcTemplateStub = Stub(JdbcTemplate.class);
//		venueDao.jdbcTemplate = jdbcTemplateStub;
//		String SQL = "SELECT id, venuename, address, parking, eventid, capacity FROM venue_practice WHERE id=" + 4;
//		venueDao.jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Venue.class)) >> venueList 
//		
//		when: "You request a venue"
//		Venue retreivedVenue = venueDao.getVenueById(4)
//		
//		then: "Venue is returned"
//		retreivedVenue.equals(venue);
//	}
	
//	def "Get venues"() {
//		given: "Venue dao"
//		VenueDao venueDao = new VenueDao();
//		
//		and: "Venue"
//		Venue venue1 = new Venue(4, "Verizon Wireless Amphitheater", "123 Blep Street", true, 1, 1200);
//		Venue venue2 = new Venue(5, "Centennial Olympic Park", "123 Olympic Avenue", true, 2, 1200);
//		ArrayList<Venue> venueList = new ArrayList<Venue>();
//		venueList.add(venue1);
//		venueList.add(venue2);
//		venueDao.venues = venueList;
//		
//		when: "You request a venue"
//		ArrayList<Venue> retreivedVenueList = venueDao.getVenues();
//		
//		then: "Venue is returned"
//		retreivedVenueList.equals(venueList);
//	}
}
