package venue.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import venue.model.Venue;

@RestController
public class VenueController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Venue greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Venue(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
