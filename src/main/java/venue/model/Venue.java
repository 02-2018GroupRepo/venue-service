package venue.model;

public class Venue {

    private final long id;
    private final String content;

    public Venue(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
