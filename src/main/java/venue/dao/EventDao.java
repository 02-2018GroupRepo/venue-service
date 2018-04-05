package venue.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import venue.model.Event;

@Component
public class EventDao {
	@Value("${local.path}")
	private String localPath;
	
	@Autowired
	RestTemplate restTemplate;
	
	public Event getEventById(int id) {
		String transactionUrl = localPath + id;
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(transactionUrl);
        Event response = (Event) restTemplate.getForObject(builder.toUriString(), Event.class);
        return response;
	}
}
