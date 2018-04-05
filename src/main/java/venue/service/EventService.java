package venue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import venue.dao.EventDao;
import venue.model.Event;

@Component
public class EventService {
	@Autowired
	EventDao eventDao;
	
	public Event getEventById(int id) {
		return eventDao.getEventById(id);
	}
}
