package venue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import venue.model.Venue;

@Component
public class VenueDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Venue> getVenues() {
		String SQL = "SELECT id, venuename, address, parking, eventid, capacity FROM venue_practice";
		List<Venue> venues = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Venue.class));
		return venues;
	}
	
	public Venue getVenueById(int id) {
		String SQL = "SELECT id, venuename, address, parking, eventid, capacity FROM venue_practice WHERE id=" + id;
		List<Venue> venue = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Venue.class));
		return venue.get(0);
	}
	
	public void createVenue(Venue venue) {
		String insertSQL = "INSERT INTO venue_practice VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(insertSQL, new Object[] {venue.getId(), venue.getVenueName(), venue.getAddress(), venue.isParking(), venue.getEventId(), venue.getCapacity()});
	}
	
	public void updateVenue(int id, Venue venue) {
		String SQL = "UPDATE venue_practice SET id=?, venuename=?, address=?, parking=?, eventid=?, capacity=? WHERE id=" + id;
		jdbcTemplate.update(SQL, new Object[] {venue.getId(), venue.getVenueName(), venue.getAddress(), venue.isParking(), venue.getEventId(), venue.getCapacity()});
	}
	
	public void deleteVenue(int id) {
		String SQL = "DELETE FROM venue_practice WHERE id=" + id;
		jdbcTemplate.update(SQL);
	}
}
